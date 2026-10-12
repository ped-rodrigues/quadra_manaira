package br.com.quadramanaira.data.repository

import br.com.quadramanaira.data.model.Avatars
import br.com.quadramanaira.data.model.Sport
import br.com.quadramanaira.data.model.UserProfile
import br.com.quadramanaira.util.DateUtils
import br.com.quadramanaira.util.UserMessageException
import br.com.quadramanaira.util.asFlow
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.SetOptions
import com.google.firebase.messaging.FirebaseMessaging
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.tasks.await

class UserRepository(
    private val auth: FirebaseAuth,
    private val db: FirebaseFirestore,
    private val messaging: FirebaseMessaging,
) {
    private val usersCol get() = db.collection("users")
    private fun privateDoc(uid: String) = usersCol.document(uid).collection("private").document("data")

    /** Perfil público de qualquer atleta (sem e-mail e sem data de nascimento). */
    fun profile(uid: String): Flow<UserProfile?> =
        usersCol.document(uid).asFlow().map { if (it.exists()) it.toProfile() else null }

    /** Meu perfil completo: parte pública + `private/data` (e-mail, nascimento, bloqueios). */
    fun myProfile(uid: String): Flow<UserProfile?> =
        combine(profile(uid), privateDoc(uid).asFlow()) { public, private ->
            @Suppress("UNCHECKED_CAST")
            public?.copy(
                email = private.getString("email") ?: auth.currentUser?.email.orEmpty(),
                birthDate = private.getString("birthDate").orEmpty(),
                blocked = (private.get("blocked") as? List<String>).orEmpty().toSet(),
            )
        }

    fun allUsers(): Flow<List<UserProfile>> =
        usersCol.orderBy("nameLower", Query.Direction.ASCENDING).asFlow()
            .map { snap -> snap.documents.map { it.toProfile() } }

    suspend fun updateProfile(name: String, birthDate: String, sport: Sport, avatar: String): Result<Unit> = runCatching {
        val uid = auth.currentUser?.uid ?: throw UserMessageException("Faça login.")
        val cleanName = name.trim()
        if (cleanName.length < 2) throw UserMessageException("Informe seu nome completo.")
        AuthRepository.validateBirthDate(birthDate)
        // set(merge) também cria o perfil se ele não existir (ex.: falha no meio do cadastro).
        writeProfile(uid, auth.currentUser?.email.orEmpty(), cleanName, birthDate.trim(), sport, avatar, isNew = false)
    }

    /** Grava a parte pública e a privada do perfil juntas. */
    suspend fun writeProfile(
        uid: String, email: String, name: String, birthDate: String, sport: Sport, avatar: String, isNew: Boolean,
    ) {
        val public = mutableMapOf<String, Any>(
            "name" to name,
            "nameLower" to name.lowercase(),
            "birthDayMonth" to DateUtils.birthDayMonth(birthDate),
            "sport" to sport.name,
            "avatar" to Avatars.from(avatar),
        )
        if (isNew) public["createdAt"] = FieldValue.serverTimestamp()
        db.batch()
            .set(usersCol.document(uid), public, SetOptions.merge())
            .set(privateDoc(uid), mapOf("email" to email, "birthDate" to birthDate), SetOptions.merge())
            .commit().await()
    }

    suspend fun setBlocked(otherId: String, blocked: Boolean): Result<Unit> = runCatching {
        val uid = auth.currentUser?.uid ?: throw UserMessageException("Faça login.")
        val op = if (blocked) FieldValue.arrayUnion(otherId) else FieldValue.arrayRemove(otherId)
        privateDoc(uid).set(mapOf("blocked" to op), SetOptions.merge()).await()
    }

    /** Denúncia de post ou conversa; a administração analisa pela coleção `reports` no console. */
    suspend fun report(type: String, targetId: String, targetUserId: String, text: String): Result<Unit> = runCatching {
        val uid = auth.currentUser?.uid ?: throw UserMessageException("Faça login.")
        db.collection("reports").add(
            mapOf(
                "reporterId" to uid,
                "type" to type,
                "targetId" to targetId,
                "targetUserId" to targetUserId,
                "text" to text.take(2000),
                "createdAt" to FieldValue.serverTimestamp(),
            )
        ).await()
    }

    /** Guarda o token FCM deste aparelho e assina o tópico geral de avisos da quadra. */
    suspend fun registerDevice() {
        val uid = auth.currentUser?.uid ?: return
        val token = messaging.token.await()
        saveToken(uid, token)
        messaging.subscribeToTopic(TOPIC_ALL).await()
    }

    suspend fun saveToken(uid: String, token: String) {
        usersCol.document(uid).collection("tokens").document(token)
            .set(mapOf("createdAt" to FieldValue.serverTimestamp(), "platform" to "android"))
            .await()
    }

    suspend fun unregisterDevice() {
        val uid = auth.currentUser?.uid ?: return
        val token = messaging.token.await()
        usersCol.document(uid).collection("tokens").document(token).delete().await()
        messaging.unsubscribeFromTopic(TOPIC_ALL).await()
    }

    /** Depois de excluir a conta: para de receber push neste aparelho (o token some junto com o perfil). */
    suspend fun forgetDevice() {
        messaging.unsubscribeFromTopic(TOPIC_ALL).await()
        messaging.deleteToken().await()
    }

    companion object {
        const val TOPIC_ALL = "quadra"
    }
}

fun DocumentSnapshot.toProfile() = UserProfile(
    id = id,
    name = getString("name").orEmpty(),
    email = "",
    birthDate = "",
    sport = Sport.from(getString("sport")),
    avatar = Avatars.from(getString("avatar")),
)
