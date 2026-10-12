package br.com.quadramanaira.data.repository

import android.content.Context
import androidx.credentials.CredentialManager
import androidx.credentials.CustomCredential
import androidx.credentials.GetCredentialRequest
import br.com.quadramanaira.data.model.Avatars
import br.com.quadramanaira.data.model.Sport
import br.com.quadramanaira.util.DateUtils
import br.com.quadramanaira.util.UserMessageException
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthRecentLoginRequiredException
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.userProfileChangeRequest
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.tasks.await

/**
 * Autenticação real via Firebase Auth.
 * Corrige: B1/F1 (e-mail real e único), B2 (Google de verdade), B4 (sessão gerenciada pelo SDK),
 * B5/F5 (senha com hash no servidor; o app nunca guarda senha).
 */
class AuthRepository(
    private val appContext: Context,
    private val auth: FirebaseAuth,
    private val db: FirebaseFirestore,
    private val users: UserRepository,
) {
    val currentUid: String? get() = auth.currentUser?.uid

    val uidFlow: Flow<String?> = callbackFlow {
        val listener = FirebaseAuth.AuthStateListener { trySend(it.currentUser?.uid) }
        auth.addAuthStateListener(listener)
        awaitClose { auth.removeAuthStateListener(listener) }
    }.distinctUntilChanged()

    suspend fun login(email: String, password: String): Result<Unit> = runCatching {
        require(email.isNotBlank() && password.isNotEmpty()) { "Preencha e-mail e senha." }
        auth.signInWithEmailAndPassword(email.trim(), password).await()
        runCatching { users.registerDevice() } // push é opcional; não impede o login
    }

    suspend fun register(
        name: String,
        email: String,
        password: String,
        birthDate: String,
        sport: Sport,
        avatar: String,
    ): Result<Unit> = runCatching {
        val cleanName = name.trim()
        if (cleanName.length < 2) throw UserMessageException("Informe seu nome completo.")
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email.trim()).matches()) {
            throw UserMessageException("E-mail inválido.")
        }
        if (password.length < 6) throw UserMessageException("A senha precisa ter pelo menos 6 caracteres.")
        validateBirthDate(birthDate)

        val user = auth.createUserWithEmailAndPassword(email.trim(), password).await().user
            ?: throw UserMessageException("Não foi possível criar a conta.")
        user.updateProfile(userProfileChangeRequest { displayName = cleanName }).await()
        writeProfile(user, cleanName, birthDate.trim(), sport, avatar)
        runCatching { users.registerDevice() } // push é opcional; não impede o login
    }

    suspend fun sendPasswordReset(email: String): Result<Unit> = runCatching {
        if (email.isBlank()) throw UserMessageException("Digite o e-mail da sua conta.")
        auth.sendPasswordResetEmail(email.trim()).await()
    }

    /** Precisa de um Context de Activity para mostrar o seletor de contas do Google. */
    suspend fun signInWithGoogle(activityContext: Context): Result<Unit> = runCatching {
        val clientId = webClientId()
            ?: throw UserMessageException("Login com Google ainda não configurado no Firebase.")
        val request = GetCredentialRequest.Builder()
            .addCredentialOption(GetSignInWithGoogleOption.Builder(clientId).build())
            .build()
        val credential = CredentialManager.create(activityContext)
            .getCredential(activityContext, request).credential
        if (credential !is CustomCredential ||
            credential.type != GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL
        ) throw UserMessageException("Credencial do Google inválida.")

        val google = GoogleIdTokenCredential.createFrom(credential.data)
        val user = auth.signInWithCredential(GoogleAuthProvider.getCredential(google.idToken, null))
            .await().user ?: throw UserMessageException("Falha no login com Google.")

        // Só cria o perfil no primeiro login; nos seguintes reaproveita o existente (corrige B2).
        val profileRef = db.collection("users").document(user.uid)
        if (!profileRef.get().await().exists()) {
            writeProfile(user, google.displayName ?: user.displayName ?: "Atleta", "", Sport.VOLEI_PRAIA, Avatars.all.first())
        }
        runCatching { users.registerDevice() } // push é opcional; não impede o login
    }

    suspend fun logout() {
        runCatching { users.unregisterDevice() }
        auth.signOut()
        runCatching {
            CredentialManager.create(appContext).clearCredentialState(
                androidx.credentials.ClearCredentialStateRequest()
            )
        }
    }

    /**
     * Exclui a conta (exigência da Play Store). Apaga o usuário do Auth; a Cloud Function
     * `onUserDeleted` apaga os dados dele no Firestore. O Firebase exige login recente.
     */
    suspend fun deleteAccount(): Result<Unit> = runCatching {
        val user = auth.currentUser ?: throw UserMessageException("Faça login.")
        try {
            user.delete().await()
        } catch (_: FirebaseAuthRecentLoginRequiredException) {
            throw UserMessageException("Por segurança, saia da conta, entre de novo e repita a exclusão.")
        }
        runCatching { users.forgetDevice() }
        runCatching {
            CredentialManager.create(appContext).clearCredentialState(
                androidx.credentials.ClearCredentialStateRequest()
            )
        }
    }

    private suspend fun writeProfile(user: FirebaseUser, name: String, birthDate: String, sport: Sport, avatar: String) {
        users.writeProfile(user.uid, user.email.orEmpty(), name, birthDate, sport, avatar, isNew = true)
    }

    private fun webClientId(): String? {
        // Gerado pelo plugin google-services a partir do google-services.json.
        val id = appContext.resources.getIdentifier("default_web_client_id", "string", appContext.packageName)
        return if (id != 0) appContext.getString(id) else null
    }

    companion object {
        fun validateBirthDate(birthDate: String) {
            val date = DateUtils.parseBirthDate(birthDate)
                ?: throw UserMessageException("Data de nascimento inválida. Use dd/mm/aaaa.")
            if (date.isAfter(DateUtils.today()) || date.year < 1900) {
                throw UserMessageException("Data de nascimento inválida.")
            }
        }
    }
}
