package br.com.quadramanaira.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.quadramanaira.Repos
import br.com.quadramanaira.data.model.UserProfile
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

sealed interface SessionState {
    data object Loading : SessionState
    data object SignedOut : SessionState
    /** Logado, mas o perfil não existe ou está incompleto (ex.: primeiro login com Google). */
    data class NeedsProfile(val uid: String, val partial: UserProfile?) : SessionState
    data class Ready(val me: UserProfile) : SessionState
}

@OptIn(ExperimentalCoroutinesApi::class)
class SessionViewModel(private val repos: Repos) : ViewModel() {

    val state: StateFlow<SessionState> = repos.auth.uidFlow
        .flatMapLatest { uid ->
            if (uid == null) {
                flowOf(SessionState.SignedOut)
            } else {
                repos.users.myProfile(uid)
                    .map { p -> if (p != null && p.isComplete) SessionState.Ready(p) else SessionState.NeedsProfile(uid, p) }
                    .catch { emit(SessionState.NeedsProfile(uid, null)) }
            }
        }
        .stateIn(viewModelScope, SharingStarted.Eagerly, SessionState.Loading)

    fun logout() {
        viewModelScope.launch { repos.auth.logout() }
    }
}
