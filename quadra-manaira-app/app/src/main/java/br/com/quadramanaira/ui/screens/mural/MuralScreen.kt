package br.com.quadramanaira.ui.screens.mural

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewModelScope
import br.com.quadramanaira.Repos
import br.com.quadramanaira.data.model.Post
import br.com.quadramanaira.data.model.Sport
import br.com.quadramanaira.data.model.UserProfile
import br.com.quadramanaira.ui.components.AvatarBubble
import br.com.quadramanaira.ui.components.EmptyState
import br.com.quadramanaira.ui.components.LoadingBox
import br.com.quadramanaira.ui.components.SportSelector
import br.com.quadramanaira.util.DateUtils
import br.com.quadramanaira.util.toUserMessage
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class MuralViewModel(private val repos: Repos, private val me: UserProfile) : ViewModel() {
    val posts: StateFlow<List<Post>?> = repos.mural.posts(me.id)
        .catch { emit(emptyList()) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), null)

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error.asStateFlow()
    private val _publishing = MutableStateFlow(false)
    val publishing: StateFlow<Boolean> = _publishing.asStateFlow()

    fun publish(author: UserProfile, text: String, sport: Sport, onDone: () -> Unit) {
        if (_publishing.value) return
        _publishing.value = true
        viewModelScope.launch {
            repos.mural.publish(author, text, sport)
                .onSuccess { _error.value = null; onDone() }
                .onFailure { _error.value = it.toUserMessage() }
            _publishing.value = false
        }
    }

    fun toggleLike(post: Post) {
        viewModelScope.launch {
            repos.mural.toggleLike(post, me.id).onFailure { _error.value = it.toUserMessage() }
        }
    }

    fun delete(post: Post) {
        viewModelScope.launch {
            repos.mural.delete(post).onFailure { _error.value = it.toUserMessage() }
        }
    }
}

@Composable
fun MuralScreen(vm: MuralViewModel, me: UserProfile, contentPadding: PaddingValues) {
    val posts by vm.posts.collectAsStateWithLifecycle()
    val error by vm.error.collectAsStateWithLifecycle()
    val publishing by vm.publishing.collectAsStateWithLifecycle()
    var text by rememberSaveable { mutableStateOf("") }
    var sport by rememberSaveable { mutableStateOf(me.sport) }
    var toDelete by remember { mutableStateOf<Post?>(null) }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(
            start = 16.dp, end = 16.dp,
            top = contentPadding.calculateTopPadding() + 8.dp,
            bottom = contentPadding.calculateBottomPadding() + 16.dp,
        ),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        item {
            Card(Modifier.fillMaxWidth()) {
                Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text("Nova publicação", style = MaterialTheme.typography.titleSmall)
                    OutlinedTextField(
                        value = text,
                        onValueChange = { if (it.length <= 1000) text = it },
                        placeholder = { Text("Mensagem para a comunidade...") },
                        modifier = Modifier.fillMaxWidth(),
                        minLines = 2,
                    )
                    SportSelector(sport, { sport = it })
                    error?.let { Text(it, color = MaterialTheme.colorScheme.error) }
                    Button(
                        onClick = { vm.publish(me, text, sport) { text = "" } },
                        enabled = text.isNotBlank() && !publishing,
                        modifier = Modifier.align(Alignment.End),
                    ) { Text(if (publishing) "Publicando..." else "Publicar") }
                }
            }
        }
        val list = posts
        when {
            list == null -> item { LoadingBox(Modifier.padding(32.dp)) }
            list.isEmpty() -> item { EmptyState("O mural está vazio. Seja o primeiro a publicar!") }
            else -> items(list, key = { it.id }) { post ->
                PostCard(post, isMine = post.authorId == me.id, onLike = { vm.toggleLike(post) }, onDelete = { toDelete = post })
            }
        }
    }

    toDelete?.let { post ->
        AlertDialog(
            onDismissRequest = { toDelete = null },
            title = { Text("Apagar publicação?") },
            confirmButton = { TextButton(onClick = { vm.delete(post); toDelete = null }) { Text("Apagar") } },
            dismissButton = { TextButton(onClick = { toDelete = null }) { Text("Cancelar") } },
        )
    }
}

@Composable
private fun PostCard(post: Post, isMine: Boolean, onLike: () -> Unit, onDelete: () -> Unit) {
    Card(Modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                AvatarBubble(post.authorAvatar, 40.dp)
                Spacer(Modifier.width(12.dp))
                Column(Modifier.weight(1f)) {
                    Text(post.authorName, fontWeight = FontWeight.Bold)
                    Text(
                        "${post.sport.emoji} ${post.sport.label} • ${DateUtils.dateTime(post.createdAt)}",
                        style = MaterialTheme.typography.bodySmall,
                    )
                }
                if (isMine) IconButton(onClick = onDelete) { Icon(Icons.Default.Delete, "Apagar") }
            }
            Text(post.text, modifier = Modifier.padding(vertical = 8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = onLike) {
                    Icon(
                        if (post.likedByMe) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                        contentDescription = "Curtir",
                        tint = if (post.likedByMe) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
                Text("${post.likesCount} curtidas", style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}
