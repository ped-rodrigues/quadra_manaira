package br.com.quadramanaira

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.util.Log
import android.util.Patterns
import androidx.credentials.ClearCredentialStateRequest
import androidx.credentials.CredentialManager
import androidx.credentials.CustomCredential
import androidx.credentials.GetCredentialRequest
import androidx.credentials.exceptions.GetCredentialCancellationException
import androidx.credentials.exceptions.NoCredentialException
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential
import com.google.android.gms.tasks.Task
import com.google.firebase.FirebaseNetworkException
import com.google.firebase.FirebaseTooManyRequestsException
import com.google.firebase.Timestamp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.google.firebase.auth.FirebaseAuthRecentLoginRequiredException
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import com.google.firebase.auth.FirebaseAuthWeakPasswordException
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.SetOptions
import com.google.firebase.messaging.FirebaseMessaging
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.URL
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.ResolverStyle
import java.util.Date
import java.util.Locale
import kotlin.math.roundToInt

// ---------- Modelos ----------

enum class Sport(val label: String, val emoji: String) {
    FUTEBOL("Futebol", "⚽"),
    BASQUETE("Basquete", "🏀"),
    VOLEI_PRAIA("Vôlei de praia", "🏐"),
    GINASTICA("Ginástica", "🤸");

    companion object {
        fun of(value: String?) = entries.firstOrNull { it.name == value } ?: FUTEBOL
    }
}

val AVATARS = listOf("🏄", "⚽", "🏐", "🏀", "🤸")

data class Profile(
    val id: String,
    val name: String,
    val sport: Sport,
    val avatar: String,
    // Só preenchidos no meu próprio perfil (vêm de users/{uid}/private/data).
    val email: String = "",
    val birthDate: String = "",
    val blocked: Set<String> = emptySet(),
)

data class Booking(
    val id: String,
    val date: String,
    val start: String,
    val end: String,
    val sport: Sport,
    val organizerId: String,
    val organizerName: String,
    val notes: String,
)

data class Post(
    val id: String,
    val authorId: String,
    val authorName: String,
    val authorAvatar: String,
    val sport: Sport,
    val text: String,
    val likes: Long,
    val createdAt: Long,
    val likedByMe: Boolean,
)

data class Conversation(val id: String, val otherId: String, val otherName: String, val lastMessage: String, val lastAt: Long, val unread: Long)
data class Message(val id: String, val senderId: String, val text: String, val createdAt: Long)
data class Alert(val id: String, val type: String, val title: String, val message: String, val createdAt: Long, val read: Boolean)
data class Weather(val tempC: Int, val windKmh: Int, val condition: String, val sunrise: String)

sealed interface Session {
    data object Loading : Session
    data object SignedOut : Session
    /** Cadastro por e-mail ainda não confirmado: as regras só deixam mexer no próprio perfil. */
    data class Unverified(val email: String) : Session
    /** Logado sem perfil completo (primeiro login com Google ou cadastro interrompido). */
    data class NeedsProfile(val uid: String, val partial: Profile?) : Session
    data class Ready(val me: Profile) : Session
}

/** Erro com mensagem pronta para mostrar. */
class UserError(message: String) : Exception(message)

// ---------- Regras da quadra (puras, testadas em LogicTest) ----------

object Quadra {
    val ZONE: ZoneId = ZoneId.of("America/Recife")
    const val OPEN = 6 * 60
    const val CLOSE = 22 * 60
    const val MAX_MINUTES = 180
    const val NAME = "Quadra Poliesportiva de Manaíra"
    const val LAT = -7.0982
    const val LNG = -34.8315
    const val ADDRESS = "Orla de Manaíra, Av. Gov. Flávio Ribeiro Coutinho com Av. João Maurício\nJoão Pessoa, PB, 58038-000"
    const val SITE = "https://quadramanaira.com.br"
    val infrastructure = listOf(
        "Iluminação de LED" to "A quadra funciona até as 22h com boa visibilidade.",
        "Quadra poliesportiva" to "Marcações de futsal e basquete, com areia ao lado para o vôlei.",
        "Água por perto" to "Bebedouros e quiosques no calçadão.",
        "Acesso livre" to "Espaço público e gratuito de João Pessoa.",
    )
    const val SHARE_TEXT = "Bora jogar na Quadra de Manaíra? Pelo app dá pra ver os horários livres, " +
        "agendar futebol, basquete, vôlei de praia ou ginástica e combinar com a galera pelo chat. $SITE"

    fun today(): LocalDate = LocalDate.now(ZONE)
    fun now(): LocalDateTime = LocalDateTime.now(ZONE)
}

fun minutes(t: String) = t.substring(0, 2).toInt() * 60 + t.substring(3, 5).toInt()
fun hhmm(m: Int) = String.format(Locale.ROOT, "%02d:%02d", m / 60, m % 60)

/** Blocos de 30 min ocupados por um agendamento: [início, fim). */
fun slots(start: String, end: String) = (minutes(start) until minutes(end) step 30).map(::hhmm)

fun overlaps(s1: Int, e1: Int, s2: Int, e2: Int) = s1 < e2 && s2 < e1

/** Mensagem de erro, ou null se o horário é válido. O servidor valida de novo nas regras. */
fun bookingError(date: LocalDate, start: String, end: String, now: LocalDateTime): String? {
    val s = minutes(start)
    val e = minutes(end)
    return when {
        s % 30 != 0 || e % 30 != 0 -> "Escolha horários cheios ou de meia hora."
        e <= s -> "O fim precisa ser depois do início."
        s < Quadra.OPEN || e > Quadra.CLOSE -> "A quadra funciona das 06:00 às 22:00."
        e - s > Quadra.MAX_MINUTES -> "Cada agendamento pode ter até 3 horas."
        date.atTime(s / 60, s % 60).isBefore(now) -> "Esse horário já passou."
        else -> null
    }
}

private val BIRTH = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT)

fun parseBirth(value: String): LocalDate? = runCatching { LocalDate.parse(value.trim(), BIRTH) }.getOrNull()

fun birthError(value: String, today: LocalDate): String? {
    val d = parseBirth(value) ?: return "Data de nascimento inválida. Use dd/mm/aaaa."
    return if (d.isAfter(today) || d.year < 1900) "Data de nascimento inválida." else null
}

private val PT = Locale.forLanguageTag("pt-BR")
private val LONG_DATE = DateTimeFormatter.ofPattern("EEEE, d 'de' MMMM", PT)
private val WEEKDAY = DateTimeFormatter.ofPattern("EEE", PT)
private val DATE_TIME = DateTimeFormatter.ofPattern("dd/MM 'às' HH:mm", PT)

fun longDate(d: LocalDate): String = d.format(LONG_DATE).replaceFirstChar { it.uppercase() }
fun weekday(d: LocalDate): String = d.format(WEEKDAY).removeSuffix(".").replaceFirstChar { it.uppercase() }

fun ago(millis: Long, now: Long = System.currentTimeMillis()): String {
    val min = (now - millis) / 60_000
    return when {
        min < 1 -> "agora"
        min < 60 -> "há $min min"
        min < 24 * 60 -> "há ${min / 60} h"
        else -> Instant.ofEpochMilli(millis).atZone(Quadra.ZONE).format(DATE_TIME)
    }
}

// ---------- Firebase ----------

/** Listener do Firestore como Flow. Erro (ex.: permissão após logout) encerra o fluxo sem derrubar o app. */
private fun Query.flow(): Flow<List<DocumentSnapshot>> = callbackFlow {
    val reg = addSnapshotListener { snap, e ->
        if (e != null) { Log.w("Quadra", "listener", e); close() } else if (snap != null) trySend(snap.documents)
    }
    awaitClose { reg.remove() }
}

private fun DocumentReference.flow(): Flow<DocumentSnapshot> = callbackFlow {
    val reg = addSnapshotListener { snap, e ->
        if (e != null) { Log.w("Quadra", "listener", e); close() } else if (snap != null) trySend(snap)
    }
    awaitClose { reg.remove() }
}

private fun DocumentSnapshot.millis(field: String) =
    getTimestamp(field, DocumentSnapshot.ServerTimestampBehavior.ESTIMATE)?.toDate()?.time ?: System.currentTimeMillis()

private fun DocumentSnapshot.str(field: String) = getString(field).orEmpty()

private fun DocumentSnapshot.toProfile() =
    Profile(id, str("name"), Sport.of(getString("sport")), getString("avatar")?.takeIf { it in AVATARS } ?: AVATARS[0])

fun Throwable.friendly(): String {
    generateSequence(this) { it.cause }.firstOrNull { it is UserError }?.let { return it.message.orEmpty() }
    return when (this) {
        is FirebaseAuthWeakPasswordException -> "Senha fraca. Use pelo menos 6 caracteres."
        is FirebaseAuthUserCollisionException -> "Já existe uma conta com esse e-mail."
        is FirebaseAuthInvalidUserException -> "Conta não encontrada. Toque em Criar conta."
        is FirebaseAuthInvalidCredentialsException -> "E-mail ou senha incorretos."
        is FirebaseNetworkException -> "Sem internet. Confira a conexão e tente de novo."
        is FirebaseTooManyRequestsException -> "Muitas tentativas. Espere alguns minutos."
        is GetCredentialCancellationException -> "Login cancelado."
        is NoCredentialException -> "Nenhuma conta Google neste aparelho."
        is FirebaseFirestoreException -> when (code) {
            FirebaseFirestoreException.Code.PERMISSION_DENIED -> "Você não tem permissão para fazer isso."
            FirebaseFirestoreException.Code.UNAVAILABLE -> "Servidor fora do ar. Tente de novo."
            else -> "Erro no servidor (${code.name})."
        }
        else -> message ?: "Algo deu errado. Tente de novo."
    }
}

@SuppressLint("StaticFieldLeak") // é o Context da Application, que vive o app inteiro
object Repo {
    lateinit var app: Context

    private val auth get() = FirebaseAuth.getInstance()
    private val db get() = FirebaseFirestore.getInstance()
    private val users get() = db.collection("users")
    private val bookings get() = db.collection("bookings")
    private val slotsCol get() = db.collection("slots")
    private val posts get() = db.collection("posts")
    private val conversations get() = db.collection("conversations")
    private fun privateDoc(uid: String) = users.document(uid).collection("private").document("data")
    private val prefs get() = app.getSharedPreferences("quadra", Context.MODE_PRIVATE)

    // ----- Sessão e conta -----

    @OptIn(ExperimentalCoroutinesApi::class)
    fun session(): Flow<Session> = callbackFlow {
        // Ouve o token, não só o login: é ele que muda quando o e-mail é confirmado (checkVerified).
        val listener = FirebaseAuth.IdTokenListener { a -> trySend(a.currentUser?.let { it.uid to it.isEmailVerified }) }
        auth.addIdTokenListener(listener)
        awaitClose { auth.removeIdTokenListener(listener) }
    }.distinctUntilChanged().flatMapLatest { user ->
        val (uid, verified) = user ?: return@flatMapLatest flowOf(Session.SignedOut)
        if (!verified) flowOf(Session.Unverified(auth.currentUser?.email.orEmpty()))
        else combine(users.document(uid).flow(), privateDoc(uid).flow()) { pub, priv ->
            @Suppress("UNCHECKED_CAST")
            val me = if (!pub.exists()) null else pub.toProfile().copy(
                email = priv.getString("email") ?: auth.currentUser?.email.orEmpty(),
                birthDate = priv.str("birthDate"),
                blocked = (priv.get("blocked") as? List<String>).orEmpty().toSet(),
            )
            if (me != null && me.birthDate.isNotBlank()) Session.Ready(me) else Session.NeedsProfile(uid, me)
        }
    }

    suspend fun login(email: String, password: String) {
        if (email.isBlank() || password.isEmpty()) throw UserError("Preencha e-mail e senha.")
        auth.signInWithEmailAndPassword(email.trim(), password).await()
    }

    suspend fun register(name: String, email: String, password: String, birth: String, sport: Sport, avatar: String) {
        checkProfile(name, birth)
        if (!Patterns.EMAIL_ADDRESS.matcher(email.trim()).matches()) throw UserError("E-mail inválido.")
        if (password.length < 6) throw UserError("A senha precisa ter pelo menos 6 caracteres.")
        val user = auth.createUserWithEmailAndPassword(email.trim(), password).await().user
            ?: throw UserError("Não foi possível criar a conta.")
        // Criada a conta, a sessão troca de tela e cancela quem chamou; o resto do cadastro não pode parar no meio.
        withContext(NonCancellable) {
            writeProfile(user.uid, user.email.orEmpty(), name.trim(), birth.trim(), sport, avatar, isNew = true)
            runCatching { user.sendEmailVerification().await() } // se falhar, a tela de confirmação reenvia
        }
    }

    suspend fun resendVerification() {
        auth.currentUser?.sendEmailVerification()?.await()
    }

    /** Recarrega a conta; confirmada, renova o token (as regras leem email_verified dele) e a sessão avança. */
    suspend fun checkVerified() {
        val user = auth.currentUser ?: return
        user.reload().await()
        if (!user.isEmailVerified) throw UserError("Ainda não confirmado. Abra o link do e-mail e tente de novo.")
        user.getIdToken(true).await()
    }

    suspend fun resetPassword(email: String) {
        if (email.isBlank()) throw UserError("Digite o e-mail da sua conta.")
        auth.sendPasswordResetEmail(email.trim()).await()
    }

    /** Id gerado pelo plugin google-services; sem ele o botão do Google não aparece. */
    fun googleClientId(): String? {
        val id = app.resources.getIdentifier("default_web_client_id", "string", app.packageName)
        return if (id != 0) app.getString(id) else null
    }

    suspend fun googleSignIn(activity: Activity) {
        val clientId = googleClientId() ?: throw UserError("Login com Google não configurado.")
        val request = GetCredentialRequest.Builder()
            .addCredentialOption(GetSignInWithGoogleOption.Builder(clientId).build())
            .build()
        val credential = CredentialManager.create(activity).getCredential(activity, request).credential
        if (credential !is CustomCredential || credential.type != GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL) {
            throw UserError("Credencial do Google inválida.")
        }
        val google = GoogleIdTokenCredential.createFrom(credential.data)
        val user = auth.signInWithCredential(GoogleAuthProvider.getCredential(google.idToken, null)).await().user
            ?: throw UserError("Falha no login com Google.")
        // Primeiro acesso: cria o perfil sem nascimento; a sessão pede para completar (e cancela quem chamou, ver register).
        withContext(NonCancellable) {
            if (!users.document(user.uid).get().await().exists()) {
                writeProfile(user.uid, user.email.orEmpty(), (google.displayName ?: "Atleta").take(60), "", Sport.VOLEI_PRAIA, AVATARS[0], isNew = true)
            }
        }
    }

    suspend fun logout() {
        runCatching { unregisterDevice() }
        auth.signOut()
        runCatching { CredentialManager.create(app).clearCredentialState(ClearCredentialStateRequest()) }
    }

    /** A Cloud Function onUserDeleted apaga os dados do usuário no Firestore. */
    suspend fun deleteAccount() {
        val user = auth.currentUser ?: throw UserError("Entre na sua conta.")
        try {
            user.delete().await()
        } catch (_: FirebaseAuthRecentLoginRequiredException) {
            throw UserError("Por segurança, saia, entre de novo e repita a exclusão.")
        }
        runCatching { FirebaseMessaging.getInstance().unregister().await(); prefs.edit().remove("token").apply() }
        runCatching { CredentialManager.create(app).clearCredentialState(ClearCredentialStateRequest()) }
    }

    private fun checkProfile(name: String, birth: String) {
        if (name.trim().length !in 2..60) throw UserError("Informe seu nome (2 a 60 letras).")
        birthError(birth, Quadra.today())?.let { throw UserError(it) }
    }

    suspend fun saveProfile(name: String, birth: String, sport: Sport, avatar: String) {
        val user = auth.currentUser ?: throw UserError("Entre na sua conta.")
        checkProfile(name, birth)
        writeProfile(user.uid, user.email.orEmpty(), name.trim(), birth.trim(), sport, avatar, isNew = false)
    }

    private suspend fun writeProfile(uid: String, email: String, name: String, birth: String, sport: Sport, avatar: String, isNew: Boolean) {
        val public = mutableMapOf<String, Any>(
            "name" to name,
            "nameLower" to name.lowercase(),
            "birthDayMonth" to (parseBirth(birth)?.let { String.format(Locale.ROOT, "%02d/%02d", it.dayOfMonth, it.monthValue) } ?: ""),
            "sport" to sport.name,
            "avatar" to if (avatar in AVATARS) avatar else AVATARS[0],
        )
        if (isNew) public["createdAt"] = FieldValue.serverTimestamp()
        db.batch()
            .set(users.document(uid), public, SetOptions.merge())
            .set(privateDoc(uid), mapOf("email" to email, "birthDate" to birth), SetOptions.merge())
            .commit().await()
    }

    fun profile(uid: String): Flow<Profile?> = users.document(uid).flow().map { if (it.exists()) it.toProfile() else null }

    fun athletes(): Flow<List<Profile>> = users.orderBy("nameLower").flow().map { docs -> docs.map { it.toProfile() } }

    // ----- Agenda -----

    /** Jogos confirmados de hoje em diante. */
    fun bookings(): Flow<List<Booking>> =
        bookings.whereGreaterThanOrEqualTo("date", Quadra.today().toString()).flow().map { docs ->
            docs.filter { it.getString("status") == "CONFIRMED" }.map {
                Booking(it.id, it.str("date"), it.str("startTime"), it.str("endTime"), Sport.of(it.getString("sport")),
                    it.str("organizerId"), it.str("organizerName"), it.str("notes"))
            }.sortedWith(compareBy({ it.date }, { it.start }))
        }

    /**
     * Cada jogo ocupa blocos de 30 min em slots/{data}_{HH:mm}, criados na mesma transação.
     * As regras proíbem sobrescrever um bloco, então dois aparelhos nunca pegam o mesmo horário.
     */
    suspend fun book(me: Profile, date: LocalDate, start: String, end: String, sport: Sport, notes: String) {
        bookingError(date, start, end, Quadra.now())?.let { throw UserError(it) }
        val day = date.toString()
        val slotRefs = slots(start, end).map { slotsCol.document("${day}_$it") }
        val ref = bookings.document()
        val startAt = date.atTime(minutes(start) / 60, minutes(start) % 60).atZone(Quadra.ZONE).toInstant()
        db.runTransaction { tx ->
            slotRefs.forEach { if (tx.get(it).exists()) throw UserError("Horário ocupado às ${it.id.substringAfter('_')}.") }
            tx.set(ref, mapOf(
                "date" to day, "startTime" to start, "endTime" to end, "startAt" to Timestamp(Date.from(startAt)),
                "sport" to sport.name, "organizerId" to me.id, "organizerName" to me.name,
                "notes" to notes.trim().take(300), "status" to "CONFIRMED", "reminderSent" to false,
                "createdAt" to FieldValue.serverTimestamp(),
            ))
            slotRefs.forEach { tx.set(it, mapOf("bookingId" to ref.id, "organizerId" to me.id, "date" to day)) }
        }.await()
    }

    suspend fun cancel(b: Booking) {
        val batch = db.batch().update(bookings.document(b.id), "status", "CANCELLED")
        slots(b.start, b.end).forEach { batch.delete(slotsCol.document("${b.date}_$it")) }
        batch.commit().await()
    }

    // ----- Mural -----

    fun posts(myUid: String): Flow<List<Post>> {
        val liked = db.collectionGroup("likes").whereEqualTo("uid", myUid).flow()
            .map { docs -> docs.mapNotNull { it.reference.parent.parent?.id }.toSet() }
        return combine(posts.orderBy("createdAt", Query.Direction.DESCENDING).limit(100).flow(), liked) { docs, mine ->
            docs.map {
                Post(it.id, it.str("authorId"), it.str("authorName"), it.getString("authorAvatar") ?: AVATARS[0],
                    Sport.of(it.getString("sport")), it.str("text"), it.getLong("likesCount") ?: 0, it.millis("createdAt"), it.id in mine)
            }
        }
    }

    suspend fun publish(me: Profile, text: String, sport: Sport) {
        val clean = text.trim()
        if (clean.isEmpty()) throw UserError("Escreva algo para publicar.")
        if (clean.length > 1000) throw UserError("Use até 1000 caracteres.")
        posts.add(mapOf(
            "authorId" to me.id, "authorName" to me.name, "authorAvatar" to me.avatar, "sport" to sport.name,
            "text" to clean, "likesCount" to 0L, "createdAt" to FieldValue.serverTimestamp(),
        )).await()
    }

    /** Curtida e contador no mesmo lote; as regras conferem o par. */
    suspend fun toggleLike(p: Post, myUid: String) {
        val ref = posts.document(p.id)
        val like = ref.collection("likes").document(myUid)
        val batch = db.batch()
        if (p.likedByMe) batch.delete(like).update(ref, "likesCount", FieldValue.increment(-1))
        else batch.set(like, mapOf("uid" to myUid, "createdAt" to FieldValue.serverTimestamp())).update(ref, "likesCount", FieldValue.increment(1))
        batch.commit().await()
    }

    suspend fun deletePost(p: Post) { posts.document(p.id).delete().await() }

    // ----- Chat -----

    fun conversationId(a: String, b: String) = listOf(a, b).sorted().joinToString("_")

    fun conversations(myUid: String): Flow<List<Conversation>> =
        conversations.whereArrayContains("participants", myUid).orderBy("lastAt", Query.Direction.DESCENDING).flow().map { docs ->
            docs.map { d ->
                @Suppress("UNCHECKED_CAST") val names = (d.get("names") as? Map<String, String>).orEmpty()
                @Suppress("UNCHECKED_CAST") val unread = (d.get("unread") as? Map<String, Long>).orEmpty()
                val other = d.id.split("_").firstOrNull { it != myUid } ?: myUid
                Conversation(d.id, other, names[other] ?: "Atleta", d.str("lastMessage"), d.millis("lastAt"), unread[myUid] ?: 0)
            }
        }

    fun messages(convId: String): Flow<List<Message>> =
        conversations.document(convId).collection("messages").orderBy("createdAt").limitToLast(200).flow()
            .map { docs -> docs.map { Message(it.id, it.str("senderId"), it.str("text"), it.millis("createdAt")) } }

    suspend fun send(me: Profile, other: Profile, text: String) {
        val clean = text.trim()
        if (clean.isEmpty()) return
        if (clean.length > 2000) throw UserError("Mensagem muito longa.")
        val conv = conversations.document(conversationId(me.id, other.id))
        db.batch()
            .set(conv, mapOf(
                "participants" to listOf(me.id, other.id).sorted(),
                "names" to mapOf(me.id to me.name, other.id to other.name),
                "lastMessage" to clean.take(120), "lastSenderId" to me.id, "lastAt" to FieldValue.serverTimestamp(),
                "unread" to mapOf(other.id to FieldValue.increment(1)),
            ), SetOptions.merge())
            .set(conv.collection("messages").document(), mapOf(
                "senderId" to me.id, "receiverId" to other.id, "text" to clean, "createdAt" to FieldValue.serverTimestamp(),
            ))
            .commit().await()
    }

    suspend fun markRead(convId: String, myUid: String) {
        runCatching { conversations.document(convId).update("unread.$myUid", 0).await() }
    }

    // ----- Denúncia e bloqueio -----

    suspend fun setBlocked(myUid: String, otherId: String, blocked: Boolean) {
        val op = if (blocked) FieldValue.arrayUnion(otherId) else FieldValue.arrayRemove(otherId)
        privateDoc(myUid).set(mapOf("blocked" to op), SetOptions.merge()).await()
    }

    /** A administração lê as denúncias pelo console do Firebase (coleção reports). */
    suspend fun report(myUid: String, type: String, targetId: String, targetUserId: String, text: String) {
        db.collection("reports").add(mapOf(
            "reporterId" to myUid, "type" to type, "targetId" to targetId, "targetUserId" to targetUserId,
            "text" to text.take(2000), "createdAt" to FieldValue.serverTimestamp(),
        )).await()
    }

    // ----- Alertas e push -----

    private fun alertsCol(uid: String) = users.document(uid).collection("notifications")

    fun alerts(uid: String): Flow<List<Alert>> =
        alertsCol(uid).orderBy("createdAt", Query.Direction.DESCENDING).limit(50).flow().map { docs ->
            docs.map { Alert(it.id, it.str("type"), it.str("title"), it.str("message"), it.millis("createdAt"), it.getBoolean("read") == true) }
        }

    suspend fun markAlertsRead(uid: String, ids: List<String>) {
        if (ids.isEmpty()) return
        runCatching {
            val batch = db.batch()
            ids.forEach { batch.update(alertsCol(uid).document(it), "read", true) }
            batch.commit().await()
        }
    }

    /** Avisos gerais (jogos novos, cancelamentos, aniversários). O servidor lê esta escolha no token do aparelho. */
    fun broadcasts() = prefs.getBoolean("broadcasts", true)

    suspend fun setBroadcasts(on: Boolean) {
        prefs.edit().putBoolean("broadcasts", on).apply()
        registerDevice()
    }

    /**
     * FCM 26+: register() pede o token e ele chega em PushService.onRegistered, que chama [onToken].
     * Guardamos o último token para apagá-lo do Firestore no logout.
     */
    fun onToken(token: String) {
        prefs.edit().putString("token", token).apply()
        auth.currentUser?.uid?.let { saveToken(it, token) }
    }

    private fun saveToken(uid: String, token: String): Task<Void> =
        users.document(uid).collection("tokens").document(token)
            .set(mapOf("platform" to "android", "broadcasts" to broadcasts(), "createdAt" to FieldValue.serverTimestamp()))

    suspend fun registerDevice() {
        val uid = auth.currentUser?.uid ?: return
        prefs.getString("token", null)?.let { saveToken(uid, it).await() }
        FirebaseMessaging.getInstance().register().await()
    }

    private suspend fun unregisterDevice() {
        val uid = auth.currentUser?.uid ?: return
        val token = prefs.getString("token", null) ?: return
        users.document(uid).collection("tokens").document(token).delete().await()
    }

    // ----- Clima (Open-Meteo, sem chave) -----

    suspend fun weather(): Weather = withContext(Dispatchers.IO) {
        val url = "https://api.open-meteo.com/v1/forecast?latitude=${Quadra.LAT}&longitude=${Quadra.LNG}" +
            "&current=temperature_2m,wind_speed_10m,weather_code,is_day&daily=sunrise&forecast_days=1&timezone=America%2FRecife"
        val conn = URL(url).openConnection().apply { connectTimeout = 6000; readTimeout = 6000 }
        val json = JSONObject(conn.getInputStream().bufferedReader().use { it.readText() })
        val c = json.getJSONObject("current")
        Weather(
            tempC = c.getDouble("temperature_2m").roundToInt(),
            windKmh = c.getDouble("wind_speed_10m").roundToInt(),
            condition = describeWeather(c.getInt("weather_code"), c.optInt("is_day", 1) == 1),
            sunrise = json.getJSONObject("daily").getJSONArray("sunrise").getString(0).takeLast(5),
        )
    }

    private fun describeWeather(code: Int, day: Boolean) = when (code) {
        0 -> if (day) "Céu limpo" else "Noite limpa"
        1, 2 -> "Poucas nuvens"
        3 -> "Nublado"
        45, 48 -> "Névoa"
        in 51..57 -> "Garoa"
        in 61..67, in 80..82 -> "Chuva"
        in 95..99 -> "Trovoadas"
        else -> "Tempo instável"
    }
}
