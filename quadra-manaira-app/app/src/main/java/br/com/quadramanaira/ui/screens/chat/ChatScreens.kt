package br.com.quadramanaira.ui.screens.chat

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
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material3.Badge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewModelScope
import br.com.quadramanaira.Repos
import br.com.quadramanaira.data.model.ChatMessage
import br.com.quadramanaira.data.model.Conversation
import br.com.quadramanaira.data.model.UserProfile
import br.com.quadramanaira.ui.components.AvatarBubble
import br.com.quadramanaira.ui.components.EmptyState
import br.com.quadramanaira.ui.components.SectionTitle
import br.com.quadramanaira.util.DateUtils
import br.com.quadramanaira.util.toUserMessage
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

// ---------- Lista de conversas + atletas da comunidade ----------

class ChatListViewModel(repos: Repos, me: UserProfile) : ViewModel() {
    val conversations: StateFlow<List<Conversation>> = repos.chat.conversations(me.id)
        .catch { emit(emptyList()) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())

    val athletes: StateFlow<List<UserProfile>> = repos.users.allUsers()
        .map { list -> list.filter { it.id != me.id } }
        .catch { emit(emptyList()) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())
}

@Composable
fun ChatListScreen(vm: ChatListViewModel, me: UserProfile, contentPadding: PaddingValues, onOpenChat: (String) -> Unit) {
    val conversations by vm.conversations.collectAsStateWithLifecycle()
    val athletes by vm.athletes.collectAsStateWithLifecycle()

    LazyColumn(Modifier.fillMaxSize(), contentPadding = contentPadding) {
        item { SectionTitle("Conversas", Modifier.padding(horizontal = 16.dp)) }
        if (conversations.isEmpty()) {
            item { Text("Nenhuma conversa ainda.", Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) }
        }
        items(conversations, key = { it.id }) { conv ->
            val unread = conv.unreadFor(me.id)
            ListItem(
                modifier = Modifier.clickable { onOpenChat(conv.otherId(me.id)) },
                headlineContent = { Text(conv.otherName(me.id), fontWeight = if (unread > 0) FontWeight.Bold else null) },
                supportingContent = { Text(conv.lastMessage, maxLines = 1, overflow = TextOverflow.Ellipsis) },
                trailingContent = {
                    Column(horizontalAlignment = Alignment.End) {
                        Text(DateUtils.dateTime(conv.lastAt), style = MaterialTheme.typography.labelSmall)
                        if (unread > 0) Badge { Text(if (unread > 9) "9+" else unread.toString()) }
                    }
                },
            )
            HorizontalDivider()
        }
        item { SectionTitle("Atletas da comunidade", Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) }
        if (athletes.isEmpty()) {
            item { Text("Nenhum outro atleta cadastrado ainda.", Modifier.padding(16.dp)) }
        }
        items(athletes, key = { "u_" + it.id }) { user ->
            ListItem(
                modifier = Modifier.clickable { onOpenChat(user.id) },
                leadingContent = { AvatarBubble(user.avatar, 40.dp) },
                headlineContent = { Text(user.name) },
                supportingContent = { Text("${user.sport.emoji} ${user.sport.label} • Toque para conversar") },
            )
        }
    }
}

// ---------- Conversa ----------

class ChatViewModel(private val repos: Repos, private val me: UserProfile, otherId: String) : ViewModel() {
    private val conversationId = repos.chat.conversationId(me.id, otherId)

    val other: StateFlow<UserProfile?> = repos.users.profile(otherId)
        .catch { emit(null) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), null)

    val messages: StateFlow<List<ChatMessage>> = repos.chat.messages(conversationId)
        .catch { emit(emptyList()) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error.asStateFlow()

    init {
        // Zera as não lidas ao abrir e sempre que chegar mensagem nova com a tela aberta (corrige B7).
        viewModelScope.launch {
            combine(messages, other) { msgs, _ -> msgs.size }.collect { repos.chat.markRead(conversationId, me.id) }
        }
    }

    fun send(text: String, onSent: () -> Unit) {
        val target = other.value ?: return
        viewModelScope.launch {
            repos.chat.send(me, target, text)
                .onSuccess { _error.value = null; onSent() }
                .onFailure { _error.value = it.toUserMessage() }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatScreen(vm: ChatViewModel, me: UserProfile, onBack: () -> Unit) {
    val other by vm.other.collectAsStateWithLifecycle()
    val messages by vm.messages.collectAsStateWithLifecycle()
    val error by vm.error.collectAsStateWithLifecycle()
    var text by rememberSaveable { mutableStateOf("") }
    val listState = rememberLazyListState()

    LaunchedEffect(messages.size) {
        if (messages.isNotEmpty()) listState.animateScrollToItem(messages.lastIndex)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(other?.name ?: "Conversa") },
                navigationIcon = { IconButton(onClick = onBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, "Voltar") } },
            )
        },
        bottomBar = {
            Column(Modifier.navigationBarsPadding().imePadding()) {
                error?.let { Text(it, color = MaterialTheme.colorScheme.error, modifier = Modifier.padding(horizontal = 16.dp)) }
                Row(Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                    OutlinedTextField(
                        value = text,
                        onValueChange = { if (it.length <= 2000) text = it },
                        placeholder = { Text("Escreva uma mensagem...") },
                        modifier = Modifier.weight(1f),
                        maxLines = 4,
                    )
                    IconButton(onClick = { vm.send(text) { text = "" } }, enabled = text.isNotBlank() && other != null) {
                        Icon(Icons.AutoMirrored.Filled.Send, "Enviar")
                    }
                }
            }
        },
    ) { padding ->
        if (messages.isEmpty()) {
            EmptyState("Nenhuma mensagem ainda. Diga um olá para ${other?.name ?: "o atleta"} e combine uma partida!", Modifier.padding(padding))
        } else {
            LazyColumn(
                state = listState,
                modifier = Modifier.padding(padding).fillMaxSize(),
                contentPadding = PaddingValues(12.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp),
            ) {
                items(messages, key = { it.id }) { msg -> MessageBubble(msg, mine = msg.senderId == me.id) }
            }
        }
    }
}

@Composable
private fun MessageBubble(msg: ChatMessage, mine: Boolean) {
    Box(Modifier.fillMaxWidth(), contentAlignment = if (mine) Alignment.CenterEnd else Alignment.CenterStart) {
        Column(
            Modifier
                .widthIn(max = 300.dp)
                .background(
                    if (mine) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surfaceVariant,
                    RoundedCornerShape(16.dp),
                )
                .padding(horizontal = 12.dp, vertical = 8.dp),
        ) {
            Text(msg.text, color = if (mine) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurfaceVariant)
            Text(
                DateUtils.dateTime(msg.createdAt),
                style = MaterialTheme.typography.labelSmall,
                color = if (mine) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
    }
}
