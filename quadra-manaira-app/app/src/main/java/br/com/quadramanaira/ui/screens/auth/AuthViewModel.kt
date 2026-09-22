package br.com.quadramanaira.ui.screens.auth

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.quadramanaira.Repos
import br.com.quadramanaira.data.model.Sport
import br.com.quadramanaira.util.toUserMessage
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class AuthUiState(
    val loading: Boolean = false,
    val error: String? = null,
    val info: String? = null,
)

class AuthViewModel(private val repos: Repos) : ViewModel() {
    private val _ui = MutableStateFlow(AuthUiState())
    val ui: StateFlow<AuthUiState> = _ui.asStateFlow()

    fun clearMessages() = _ui.update { it.copy(error = null, info = null) }

    fun login(email: String, password: String) = perform { repos.auth.login(email, password) }

    fun loginWithGoogle(activityContext: Context) = perform { repos.auth.signInWithGoogle(activityContext) }

    fun register(name: String, email: String, password: String, confirm: String, birthDate: String, sport: Sport, avatar: String) {
        if (password != confirm) {
            _ui.update { it.copy(error = "As senhas não conferem.") }
            return
        }
        perform { repos.auth.register(name, email, password, birthDate, sport, avatar) }
    }

    fun sendPasswordReset(email: String) = perform(
        successInfo = "Enviamos um link de redefinição para ${email.trim()}. Confira também o spam.",
    ) { repos.auth.sendPasswordReset(email) }

    private fun perform(successInfo: String? = null, block: suspend () -> Result<Unit>) {
        if (_ui.value.loading) return
        _ui.value = AuthUiState(loading = true)
        viewModelScope.launch {
            val result = block()
            _ui.value = AuthUiState(
                error = result.exceptionOrNull()?.toUserMessage(),
                info = if (result.isSuccess) successInfo else null,
            )
        }
    }
}
