package br.com.quadramanaira.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import br.com.quadramanaira.AppContainer
import br.com.quadramanaira.QuadraApp
import br.com.quadramanaira.Repos

@Composable
fun appContainer(): AppContainer = (LocalContext.current.applicationContext as QuadraApp).container

/** Cria um ViewModel com acesso aos repositórios. Só usado depois que o Firebase está pronto. */
@Composable
inline fun <reified VM : ViewModel> repoViewModel(
    key: String? = null,
    crossinline create: (Repos, AppContainer) -> VM,
): VM {
    val container = appContainer()
    val repos = checkNotNull(container.repos) { "Firebase não configurado" }
    return viewModel(key = key, factory = viewModelFactory { initializer { create(repos, container) } })
}
