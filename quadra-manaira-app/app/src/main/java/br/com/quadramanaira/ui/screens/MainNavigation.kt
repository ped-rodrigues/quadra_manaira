package br.com.quadramanaira.ui.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.automirrored.filled.Chat
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.quadramanaira.data.model.UserProfile
import br.com.quadramanaira.ui.repoViewModel
import br.com.quadramanaira.ui.screens.calendar.CalendarScreen
import br.com.quadramanaira.ui.screens.calendar.CalendarViewModel
import br.com.quadramanaira.ui.screens.chat.ChatListScreen
import br.com.quadramanaira.ui.screens.chat.ChatListViewModel
import br.com.quadramanaira.ui.screens.chat.ChatScreen
import br.com.quadramanaira.ui.screens.chat.ChatViewModel
import br.com.quadramanaira.ui.screens.map.MapScreen
import br.com.quadramanaira.ui.screens.mural.MuralScreen
import br.com.quadramanaira.ui.screens.mural.MuralViewModel
import br.com.quadramanaira.ui.screens.notifications.NotificationsScreen
import br.com.quadramanaira.ui.screens.notifications.NotificationsViewModel
import br.com.quadramanaira.ui.screens.profile.ProfileScreen
import br.com.quadramanaira.ui.screens.profile.ProfileViewModel

private enum class Tab(val title: String, val icon: ImageVector) {
    AGENDA("Agenda", Icons.Default.CalendarMonth),
    MURAL("Mural", Icons.Default.Dashboard),
    CHAT("Mensagens", Icons.AutoMirrored.Filled.Chat),
    ALERTAS("Alertas", Icons.Default.Notifications),
    PERFIL("Perfil", Icons.Default.Person),
}

@Composable
fun MainNavigation(me: UserProfile) {
    val nav = rememberNavController()
    NavHost(nav, startDestination = "home") {
        composable("home") { HomeScaffold(me, nav) }
        composable("chat/{otherId}") { entry ->
            val otherId = entry.arguments?.getString("otherId").orEmpty()
            val vm = repoViewModel(key = "chat_$otherId") { repos, _ -> ChatViewModel(repos, me, otherId) }
            ChatScreen(vm, me, onBack = { nav.popBackStack() })
        }
        composable("map") { MapScreen(onBack = { nav.popBackStack() }) }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun HomeScaffold(me: UserProfile, nav: NavHostController) {
    var tab by rememberSaveable { mutableStateOf(Tab.AGENDA) }

    // ViewModels no nível do scaffold para os contadores da barra inferior.
    val notificationsVm = repoViewModel(key = "notif_${me.id}") { repos, _ -> NotificationsViewModel(repos, me.id) }
    val chatListVm = repoViewModel(key = "chats_${me.id}") { repos, _ -> ChatListViewModel(repos, me) }
    val unreadNotifications by notificationsVm.unreadCount.collectAsStateWithLifecycle()
    val conversations by chatListVm.conversations.collectAsStateWithLifecycle()
    val unreadChats = conversations.count { it.unreadFor(me.id) > 0 && it.otherId(me.id) !in me.blocked }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(if (tab == Tab.AGENDA) "Quadra de Manaíra" else tab.title) },
                actions = {
                    IconButton(onClick = { nav.navigate("map") }) { Icon(Icons.Default.Place, "Localização") }
                },
            )
        },
        bottomBar = {
            NavigationBar {
                Tab.entries.forEach { t ->
                    val badge = when (t) {
                        Tab.CHAT -> unreadChats
                        Tab.ALERTAS -> unreadNotifications
                        else -> 0
                    }
                    NavigationBarItem(
                        selected = tab == t,
                        onClick = { tab = t },
                        label = { Text(t.title) },
                        icon = {
                            BadgedBox(badge = { if (badge > 0) Badge { Text(if (badge > 9) "9+" else "$badge") } }) {
                                Icon(t.icon, t.title)
                            }
                        },
                    )
                }
            }
        },
    ) { padding ->
        when (tab) {
            Tab.AGENDA -> {
                val vm = repoViewModel { repos, container -> CalendarViewModel(repos, container) }
                CalendarScreen(vm, me, padding)
            }
            Tab.MURAL -> {
                val vm = repoViewModel(key = "mural_${me.id}") { repos, _ -> MuralViewModel(repos, me) }
                MuralScreen(vm, me, padding)
            }
            Tab.CHAT -> ChatListScreen(chatListVm, me, padding, onOpenChat = { nav.navigate("chat/$it") })
            Tab.ALERTAS -> NotificationsScreen(notificationsVm, padding)
            Tab.PERFIL -> {
                val vm = repoViewModel { repos, _ -> ProfileViewModel(repos) }
                ProfileScreen(vm, me, padding, onOpenMap = { nav.navigate("map") })
            }
        }
    }
}
