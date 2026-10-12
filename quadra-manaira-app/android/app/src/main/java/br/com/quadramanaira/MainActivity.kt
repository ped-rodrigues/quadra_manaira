package br.com.quadramanaira

import android.Manifest
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Chat
import androidx.compose.material.icons.outlined.CalendarMonth
import androidx.compose.material.icons.outlined.Forum
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.saveable.rememberSaveableStateHolder
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.google.firebase.FirebaseApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        if (Build.VERSION.SDK_INT >= 33) requestPermissions(arrayOf(Manifest.permission.POST_NOTIFICATIONS), 0)
        val configured = FirebaseApp.getApps(this).isNotEmpty()
        setContent {
            QuadraTheme {
                Surface(Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    if (configured) Root() else SetupScreen()
                }
            }
        }
    }
}

@Composable
private fun Root() {
    val session by remember { Repo.session() }.collectAsStateWithLifecycle(Session.Loading)
    AnimatedContent(session, contentKey = { it::class }, transitionSpec = { fadeIn() togetherWith fadeOut() }, label = "session") { s ->
        when (s) {
            Session.Loading -> Loading()
            Session.SignedOut -> AuthScreen()
            is Session.NeedsProfile -> CompleteProfileScreen(s.partial)
            is Session.Ready -> Home(s.me)
        }
    }
}

private enum class Tab(val title: String, val icon: ImageVector) {
    AGENDA("Agenda", Icons.Outlined.CalendarMonth),
    MURAL("Mural", Icons.Outlined.Forum),
    CONVERSAS("Conversas", Icons.AutoMirrored.Outlined.Chat),
    ALERTAS("Alertas", Icons.Outlined.Notifications),
    PERFIL("Perfil", Icons.Outlined.Person),
}

/** Navegação: abas embaixo; conversa e localização abrem por cima, deslizando da direita. */
@Composable
private fun Home(me: Profile) {
    var tab by rememberSaveable { mutableStateOf(Tab.AGENDA) }
    var route by rememberSaveable { mutableStateOf("tabs") } // "tabs", "local" ou "chat:<uid>"
    val saved = rememberSaveableStateHolder()
    val alerts by remember(me.id) { Repo.alerts(me.id) }.collectAsStateWithLifecycle(null)
    val conversations by remember(me.id) { Repo.conversations(me.id) }.collectAsStateWithLifecycle(null)
    val visibleConversations = conversations?.filter { it.otherId !in me.blocked }

    LaunchedEffect(me.id) { runCatching { Repo.registerDevice() } } // push é opcional
    BackHandler(route != "tabs") { route = "tabs" }

    AnimatedContent(
        route,
        transitionSpec = {
            if (targetState != "tabs") slideInHorizontally { it } togetherWith fadeOut()
            else fadeIn() togetherWith slideOutHorizontally { it }
        },
        label = "route",
    ) { r ->
        when {
            r == "local" -> LocalScreen(onBack = { route = "tabs" })
            r.startsWith("chat:") -> {
                val otherId = r.removePrefix("chat:")
                ChatScreen(me, otherId, unread = visibleConversations?.firstOrNull { it.otherId == otherId }?.unread ?: 0, onBack = { route = "tabs" })
            }
            else -> Scaffold(
                bottomBar = {
                    NavigationBar(containerColor = MaterialTheme.colorScheme.surfaceContainer) {
                        Tab.entries.forEach { t ->
                            val badge = when (t) {
                                Tab.CONVERSAS -> visibleConversations.orEmpty().count { it.unread > 0 }
                                Tab.ALERTAS -> alerts.orEmpty().count { !it.read }
                                else -> 0
                            }
                            NavigationBarItem(
                                selected = tab == t,
                                onClick = { tab = t },
                                label = { Text(t.title) },
                                colors = NavigationBarItemDefaults.colors(
                                    indicatorColor = MaterialTheme.colorScheme.secondary,
                                    selectedIconColor = MaterialTheme.colorScheme.onSecondary,
                                    selectedTextColor = MaterialTheme.colorScheme.onSurface,
                                ),
                                icon = {
                                    BadgedBox(badge = { if (badge > 0) Badge { Text(if (badge > 9) "9+" else "$badge") } }) {
                                        Icon(t.icon, contentDescription = t.title)
                                    }
                                },
                            )
                        }
                    }
                },
            ) { pad ->
                AnimatedContent(tab, transitionSpec = { fadeIn() togetherWith fadeOut() }, label = "tab") { t ->
                    saved.SaveableStateProvider(t.name) {
                        when (t) {
                            Tab.AGENDA -> AgendaScreen(me, pad, onLocal = { route = "local" })
                            Tab.MURAL -> MuralScreen(me, pad)
                            Tab.CONVERSAS -> ConversationsScreen(me, visibleConversations, pad, onOpen = { route = "chat:$it" })
                            Tab.ALERTAS -> AlertsScreen(me, alerts, pad)
                            Tab.PERFIL -> ProfileScreen(me, pad, onLocal = { route = "local" })
                        }
                    }
                }
            }
        }
    }
}

/** Build de release sem google-services.json: o app não roda sem backend, então explica o que falta. */
@Composable
private fun SetupScreen() {
    Column(Modifier.safeDrawingPadding().padding(24.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Firebase não configurado", style = MaterialTheme.typography.headlineMedium)
        Text(
            "Este build foi gerado sem o arquivo google-services.json.\n\n" +
                "Crie o projeto no console do Firebase, registre o app br.com.quadramanaira, " +
                "coloque o google-services.json em android/app e compile de novo. " +
                "O passo a passo está no LEIAME.md.",
        )
    }
}
