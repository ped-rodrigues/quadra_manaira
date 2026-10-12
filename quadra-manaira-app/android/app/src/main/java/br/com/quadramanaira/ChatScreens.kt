package br.com.quadramanaira

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Badge
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import kotlinx.coroutines.launch

@Composable
fun ConversationsScreen(me: Profile, conversations: List<Conversation>?, pad: PaddingValues, onOpen: (String) -> Unit) {
    val athletes by remember { Repo.athletes() }.collectAsStateWithLifecycle(null)
    val byId = athletes.orEmpty().associateBy { it.id }
    val others = athletes?.filter { it.id != me.id }

    Column(Modifier.fillMaxSize().padding(bottom = pad.calculateBottomPadding())) {
        ScreenTitle("Conversas")
        LazyColumn(contentPadding = PaddingValues(bottom = 24.dp)) {
            when {
                conversations == null -> item { Loading(Modifier.padding(32.dp)) }
                conversations.isEmpty() -> item { Empty("Nenhuma conversa ainda. Escolha alguém da lista abaixo para combinar um jogo.") }
                else -> items(conversations, key = { it.id }) { c ->
                    Row(
                        Modifier.fillMaxWidth().clickable { onOpen(c.otherId) }.padding(horizontal = 20.dp, vertical = 12.dp).animateItem(),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Avatar(byId[c.otherId]?.avatar ?: AVATARS[0])
                        Column(Modifier.weight(1f).padding(horizontal = 12.dp)) {
                            Text(c.otherName, fontWeight = if (c.unread > 0) FontWeight.Bold else FontWeight.SemiBold)
                            Text(c.lastMessage, maxLines = 1, overflow = TextOverflow.Ellipsis, color = MaterialTheme.colorScheme.onSurfaceVariant)
                        }
                        Column(horizontalAlignment = Alignment.End) {
                            Text(ago(c.lastAt), style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                            if (c.unread > 0) Badge(containerColor = MaterialTheme.colorScheme.secondary) { Text(if (c.unread > 9) "9+" else "${c.unread}") }
                        }
                    }
                }
            }
            item { Text("Quem joga na quadra", style = MaterialTheme.typography.titleLarge, modifier = Modifier.padding(start = 20.dp, top = 20.dp, bottom = 4.dp)) }
            when {
                others == null -> item { Loading(Modifier.padding(32.dp)) }
                others.isEmpty() -> item { Empty("Você é a primeira pessoa aqui. Compartilhe o app com a galera pelo Perfil.") }
                else -> items(others, key = { "u_" + it.id }) { u ->
                    Row(
                        Modifier.fillMaxWidth().clickable(onClickLabel = "Conversar") { onOpen(u.id) }.padding(horizontal = 20.dp, vertical = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Avatar(u.avatar, 40.dp)
                        Column(Modifier.padding(start = 12.dp)) {
                            Text(u.name)
                            Text(
                                if (u.id in me.blocked) "Bloqueado" else "${u.sport.emoji} ${u.sport.label}",
                                style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ChatScreen(me: Profile, otherId: String, unread: Long, onBack: () -> Unit) {
    val convId = remember(otherId) { Repo.conversationId(me.id, otherId) }
    val other by remember(otherId) { Repo.profile(otherId) }.collectAsStateWithLifecycle(null)
    val messages by remember(convId) { Repo.messages(convId) }.collectAsStateWithLifecycle(emptyList())
    val scope = rememberCoroutineScope()
    val busy = rememberBusy()
    val context = LocalContext.current
    var text by rememberSaveable { mutableStateOf("") }
    var menu by remember { mutableStateOf(false) }
    var confirmReport by remember { mutableStateOf(false) }
    val blocked = otherId in me.blocked
    val name = other?.name ?: "Conversa"

    // Com a conversa aberta, mensagem nova já chega lida.
    LaunchedEffect(unread) { if (unread > 0) Repo.markRead(convId, me.id) }

    Column(Modifier.fillMaxSize().imePadding()) {
        Surface(color = MaterialTheme.colorScheme.surfaceContainer) {
            Row(Modifier.fillMaxWidth().statusBarsPadding().padding(4.dp), verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = onBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, "Voltar") }
                Avatar(other?.avatar ?: AVATARS[0], 36.dp)
                Text(name, style = MaterialTheme.typography.titleLarge, modifier = Modifier.weight(1f).padding(start = 12.dp))
                Box {
                    IconButton(onClick = { menu = true }, enabled = other != null) { Icon(Icons.Outlined.MoreVert, "Opções da conversa") }
                    DropdownMenu(menu, onDismissRequest = { menu = false }) {
                        DropdownMenuItem(text = { Text("Denunciar conversa") }, onClick = { menu = false; confirmReport = true })
                        DropdownMenuItem(
                            text = { Text(if (blocked) "Desbloquear $name" else "Bloquear $name") },
                            onClick = { menu = false; scope.act(busy) { Repo.setBlocked(me.id, otherId, !blocked) } },
                        )
                    }
                }
            }
        }
        if (messages.isEmpty()) Empty("Mande um oi para $name e combinem o próximo jogo.", Modifier.weight(1f))
        else LazyColumn(
            Modifier.weight(1f),
            reverseLayout = true, // fica sempre grudado na última mensagem
            contentPadding = PaddingValues(12.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp),
        ) {
            items(messages.asReversed(), key = { it.id }) { m -> Bubble(m, m.senderId == me.id, Modifier.animateItem()) }
        }
        busy.error?.let { Text(it, color = MaterialTheme.colorScheme.error, modifier = Modifier.padding(horizontal = 16.dp)) }
        Surface(color = MaterialTheme.colorScheme.surfaceContainer) {
            if (blocked) Text("Você bloqueou $name. Desbloqueie pelo menu para conversar.", Modifier.navigationBarsPadding().padding(16.dp))
            else Row(Modifier.navigationBarsPadding().padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                OutlinedTextField(
                    text, { if (it.length <= 2000) text = it }, placeholder = { Text("Mensagem") },
                    maxLines = 4, modifier = Modifier.weight(1f),
                )
                FilledIconButton(
                    onClick = { val o = other ?: return@FilledIconButton; val t = text; text = ""; scope.act(busy) { runCatching { Repo.send(me, o, t) }.onFailure { text = t; throw it } } },
                    enabled = text.isNotBlank() && other != null,
                    modifier = Modifier.padding(start = 8.dp),
                ) { Icon(Icons.AutoMirrored.Filled.Send, "Enviar") }
            }
        }
    }

    if (confirmReport) {
        AlertDialog(
            onDismissRequest = { confirmReport = false },
            title = { Text("Denunciar conversa?") },
            text = { Text("As últimas mensagens de $name vão para a administração da quadra.") },
            confirmButton = {
                TextButton(onClick = {
                    confirmReport = false
                    val evidence = messages.filter { it.senderId == otherId }.takeLast(20).joinToString("\n") { it.text }
                    scope.launch {
                        runCatching { Repo.report(me.id, "CHAT", convId, otherId, evidence) }
                            .onSuccess { Toast.makeText(context, "Denúncia enviada.", Toast.LENGTH_SHORT).show() }
                            .onFailure { busy.error = it.friendly() }
                    }
                }) { Text("Denunciar") }
            },
            dismissButton = { TextButton(onClick = { confirmReport = false }) { Text("Cancelar") } },
        )
    }
}

@Composable
private fun Bubble(m: Message, mine: Boolean, modifier: Modifier) {
    Box(modifier.fillMaxWidth(), contentAlignment = if (mine) Alignment.CenterEnd else Alignment.CenterStart) {
        Column(
            Modifier.widthIn(max = 300.dp)
                .background(
                    if (mine) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surfaceContainer,
                    RoundedCornerShape(topStart = 18.dp, topEnd = 18.dp, bottomStart = if (mine) 18.dp else 4.dp, bottomEnd = if (mine) 4.dp else 18.dp),
                )
                .padding(horizontal = 14.dp, vertical = 8.dp),
        ) {
            val color = if (mine) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurface
            Text(m.text, color = color)
            Text(ago(m.createdAt), style = MaterialTheme.typography.labelSmall, color = color.copy(alpha = 0.7f), modifier = Modifier.align(Alignment.End))
        }
    }
}
