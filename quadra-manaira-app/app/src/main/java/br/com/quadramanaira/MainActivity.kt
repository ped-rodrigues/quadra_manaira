package br.com.quadramanaira

import android.Manifest
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.quadramanaira.ui.SessionState
import br.com.quadramanaira.ui.SessionViewModel
import br.com.quadramanaira.ui.appContainer
import br.com.quadramanaira.ui.components.LoadingBox
import br.com.quadramanaira.ui.repoViewModel
import br.com.quadramanaira.ui.screens.MainNavigation
import br.com.quadramanaira.ui.screens.auth.AuthViewModel
import br.com.quadramanaira.ui.screens.auth.LoginScreen
import br.com.quadramanaira.ui.screens.auth.RegisterScreen
import br.com.quadramanaira.ui.screens.profile.ProfileForm
import br.com.quadramanaira.ui.screens.profile.ProfileViewModel
import br.com.quadramanaira.ui.theme.QuadraTheme

class MainActivity : ComponentActivity() {

    private val notificationPermission =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { /* opcional */ }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            notificationPermission.launch(Manifest.permission.POST_NOTIFICATIONS)
        }
        setContent {
            QuadraTheme {
                Surface(Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    if (appContainer().repos == null) FirebaseSetupScreen() else QuadraRoot()
                }
            }
        }
    }
}

@Composable
private fun QuadraRoot() {
    val session = repoViewModel { repos, _ -> SessionViewModel(repos) }
    val state by session.state.collectAsStateWithLifecycle()

    when (val s = state) {
        SessionState.Loading -> LoadingBox()
        SessionState.SignedOut -> AuthNavigation()
        is SessionState.NeedsProfile -> CompleteProfileScreen(s, onLogout = session::logout)
        is SessionState.Ready -> MainNavigation(me = s.me)
    }
}

@Composable
private fun AuthNavigation() {
    val nav = rememberNavController()
    val vm = repoViewModel { repos, _ -> AuthViewModel(repos) }
    NavHost(nav, startDestination = "login") {
        composable("login") { LoginScreen(vm, onCreateAccount = { nav.navigate("register") }) }
        composable("register") { RegisterScreen(vm, onBack = { nav.popBackStack() }) }
    }
}

/** Primeiro login com Google (ou cadastro interrompido): pede os dados que faltam. */
@Composable
private fun CompleteProfileScreen(state: SessionState.NeedsProfile, onLogout: () -> Unit) {
    val vm = repoViewModel { repos, _ -> ProfileViewModel(repos) }
    Scaffold { padding ->
        Column(
            Modifier.padding(padding).verticalScroll(rememberScrollState()).padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Text("Falta pouco! Complete seu perfil para entrar na comunidade.", style = MaterialTheme.typography.bodyLarge)
            ProfileForm(vm, initial = state.partial, title = "Seu perfil")
            TextButton(onClick = onLogout) { Text("Sair") }
        }
    }
}

/** Mostrada quando o app foi compilado sem o google-services.json. */
@Composable
private fun FirebaseSetupScreen() {
    Scaffold { padding ->
        Column(
            Modifier.padding(padding).verticalScroll(rememberScrollState()).padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Text("Firebase não configurado", style = MaterialTheme.typography.headlineSmall)
            Text(
                "Este build foi gerado sem o arquivo google-services.json.\n\n" +
                    "1. Crie um projeto em console.firebase.google.com\n" +
                    "2. Adicione um app Android com o pacote br.com.quadramanaira\n" +
                    "3. Baixe o google-services.json e coloque em app/\n" +
                    "4. Ative Authentication (E-mail/senha e Google), Firestore e Cloud Messaging\n" +
                    "5. Compile de novo.\n\n" +
                    "O passo a passo completo está no LEIAME.md do projeto."
            )
        }
    }
}
