package br.com.quadramanaira.ui.screens.notifications

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewModelScope
import br.com.quadramanaira.Repos
import br.com.quadramanaira.data.model.AppNotification
import br.com.quadramanaira.data.model.NotificationType
import br.com.quadramanaira.ui.components.EmptyState
import br.com.quadramanaira.ui.components.LoadingBox
import br.com.quadramanaira.util.DateUtils
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class NotificationsViewModel(private val repos: Repos, private val uid: String) : ViewModel() {
    val items: StateFlow<List<AppNotification>?> = repos.notifications.notifications(uid)
        .catch { emit(emptyList()) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), null)

    val unreadCount: StateFlow<Int> = items
        .map { list -> list.orEmpty().count { !it.read } }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), 0)

    fun markRead(item: AppNotification) {
        if (!item.read) viewModelScope.launch { repos.notifications.markRead(uid, item.id) }
    }

    fun markAllRead() {
        viewModelScope.launch { repos.notifications.markAllRead(uid, items.value.orEmpty()) }
    }
}

@Composable
fun NotificationsScreen(vm: NotificationsViewModel, contentPadding: PaddingValues) {
    val notifications by vm.items.collectAsStateWithLifecycle()
    val list = notifications
    when {
        list == null -> LoadingBox(Modifier.padding(contentPadding))
        list.isEmpty() -> EmptyState(
            "Nenhuma notificação ainda.\nVocê vai receber avisos de jogos, lembretes 24h antes, mensagens e aniversários.",
            Modifier.padding(contentPadding),
        )
        else -> LazyColumn(Modifier.fillMaxSize(), contentPadding = contentPadding) {
            item {
                Row(Modifier.fillMaxWidth().padding(horizontal = 8.dp), horizontalArrangement = Arrangement.End) {
                    TextButton(onClick = vm::markAllRead) { Text("Marcar todas como lidas") }
                }
            }
            items(list, key = { it.id }) { n ->
                ListItem(
                    modifier = Modifier.clickable { vm.markRead(n) },
                    leadingContent = { Text(icon(n.type), style = MaterialTheme.typography.headlineSmall) },
                    headlineContent = { Text(n.title, fontWeight = if (n.read) null else FontWeight.Bold) },
                    supportingContent = { Text(n.message) },
                    trailingContent = { Text(DateUtils.dateTime(n.createdAt), style = MaterialTheme.typography.labelSmall) },
                    colors = if (n.read) ListItemDefaults.colors()
                    else ListItemDefaults.colors(containerColor = MaterialTheme.colorScheme.secondaryContainer),
                )
                HorizontalDivider()
            }
        }
    }
}

private fun icon(type: NotificationType) = when (type) {
    NotificationType.BOOKING -> "📅"
    NotificationType.CHAT -> "💬"
    NotificationType.ALERT_24H -> "⏰"
    NotificationType.BIRTHDAY -> "🎉"
    NotificationType.SYSTEM -> "🔔"
}
