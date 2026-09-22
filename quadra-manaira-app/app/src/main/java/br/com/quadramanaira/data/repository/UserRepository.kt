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
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.tasks.await

class UserRepository(
    private val auth: FirebaseAuth,
    private val db: FirebaseFirestore,
    private val messaging: FirebaseMessaging,
) {
    private val usersCol get() = db.collection("users")

    fun profile(uid: String): Flow<UserProfile?> =
        usersCol.document(uid).asFlow().map { if (it.exists()) it.toProfile() else null }

    fun allUsers(): Flow<List<UserProfile>> =
        usersCol.orderBy("nameLower", Query.Direction.ASCENDING).asFlow()
            .map { snap -> snap.documents.map { it.toProfile() } }

    suspend fun updateProfile(name: String, birthDate: String, sport: Sport, avatar: String): Result<Unit> = runCatching {
        val uid = auth.currentUser?.uid ?: throw UserMessageException("Faça login.")
        val cleanName = name.trim()
        if (cleanName.length < 2) throw UserMessageException("Informe seu nome completo.")
        AuthRepository.validateBirthDate(birthDate)
        // set(merge) também cria o perfil se ele não existir (ex.: falha no meio do cadastro).
        usersCol.document(uid).set(
            mapOf(
                "email" to (auth.currentUser?.email ?: ""),
                "name" to cleanName,
                "nameLower" to cleanName.lowercase(),
                "birthDate" to birthDate.trim(),
                "birthDayMonth" to DateUtils.birthDayMonth(birthDate),
                "sport" to sport.name,
                "avatar" to Avatars.from(avatar),
            ),
            SetOptions.merge(),
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

    companion object {
        const val TOPIC_ALL = "quadra"
    }
}

fun DocumentSnapshot.toProfile() = UserProfile(
    id = id,
    name = getString("name").orEmpty(),
    email = getString("email").orEmpty(),
    birthDate = getString("birthDate").orEmpty(),
    sport = Sport.from(getString("sport")),
    avatar = Avatars.from(getString("avatar")),
)
