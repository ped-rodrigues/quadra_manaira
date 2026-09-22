package br.com.quadramanaira.util

import androidx.credentials.exceptions.GetCredentialCancellationException
import androidx.credentials.exceptions.NoCredentialException
import com.google.firebase.FirebaseNetworkException
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import com.google.firebase.auth.FirebaseAuthWeakPasswordException
import com.google.firebase.firestore.FirebaseFirestoreException

/** Erro com mensagem já pronta para mostrar ao usuário. */
class UserMessageException(message: String) : Exception(message)

/** Converte exceções do Firebase em mensagens em português. */
fun Throwable.toUserMessage(): String {
    generateSequence(this) { it.cause }.firstOrNull { it is UserMessageException }?.let {
        return it.message.orEmpty()
    }
    return when (this) {
        is FirebaseAuthWeakPasswordException -> "Senha fraca: use pelo menos 6 caracteres."
        is FirebaseAuthUserCollisionException -> "Já existe uma conta com esse e-mail."
        is FirebaseAuthInvalidUserException -> "Conta não encontrada. Toque em \"Criar conta\"."
        is FirebaseAuthInvalidCredentialsException -> "E-mail ou senha incorretos."
        is FirebaseNetworkException -> "Sem conexão com a internet."
        is GetCredentialCancellationException -> "Login cancelado."
        is NoCredentialException -> "Nenhuma conta Google encontrada neste aparelho."
        is FirebaseFirestoreException -> when (code) {
            FirebaseFirestoreException.Code.PERMISSION_DENIED -> "Você não tem permissão para fazer isso."
            FirebaseFirestoreException.Code.UNAVAILABLE -> "Servidor indisponível. Tente de novo."
            else -> "Erro no servidor (${code.name})."
        }
        else -> message ?: "Erro inesperado."
    }
}
