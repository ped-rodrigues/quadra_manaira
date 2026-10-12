package br.com.quadramanaira

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import kotlinx.coroutines.launch

@Composable
fun MuralScreen(me: Profile, pad: PaddingValues) {
    val posts by remember(me.id) { Repo.posts(me.id) }.collectAsStateWithLifecycle(null)
    val snackbar = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    var toDelete by remember { mutableStateOf<Post?>(null) }
    var toReport by remember { mutableStateOf<Post?>(null) }
    fun say(msg: String) = scope.launch { snackbar.showSnackbar(msg) }
    fun attempt(ok: String? = null, block: suspend () -> Unit) = scope.launch {
        runCatching { block() }.onSuccess { ok?.let(::say) }.onFailure { say(it.friendly()) }
    }

    Box(Modifier.fillMaxSize().padding(bottom = pad.calculateBottomPadding())) {
        Column {
        ScreenTitle("Mural")
        LazyColumn(contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 24.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
            item { Composer(me) { say("Publicado no mural.") } }
            val visible = posts?.filter { it.authorId !in me.blocked }
            when {
                visible == null -> item { Loading(Modifier.padding(32.dp)) }
                visible.isEmpty() -> item { Empty("Ninguém escreveu ainda. Conte quando vai jogar ou chame gente para o racha.") }
                else -> items(visible, key = { it.id }) { p ->
                    PostCard(
                        p, mine = p.authorId == me.id, modifier = Modifier.animateItem(),
                        onLike = { attempt { Repo.toggleLike(p, me.id) } },
                        onDelete = { toDelete = p },
                        onReport = { toReport = p },
                        onBlock = { attempt("${p.authorName} bloqueado. Os posts somem do seu mural.") { Repo.setBlocked(me.id, p.authorId, true) } },
                    )
                }
            }
        }
        }
        SnackbarHost(snackbar, Modifier.align(Alignment.BottomCenter))
    }

    toDelete?.let { p ->
        AlertDialog(
            onDismissRequest = { toDelete = null },
            title = { Text("Apagar publicação?") },
            text = { Text("Ela sai do mural de todo mundo.") },
            confirmButton = { TextButton(onClick = { toDelete = null; attempt("Publicação apagada.") { Repo.deletePost(p) } }) { Text("Apagar", color = MaterialTheme.colorScheme.error) } },
            dismissButton = { TextButton(onClick = { toDelete = null }) { Text("Manter") } },
        )
    }
    toReport?.let { p ->
        AlertDialog(
            onDismissRequest = { toReport = null },
            title = { Text("Denunciar publicação?") },
            text = { Text("A administração da quadra vai ler e decidir se ela sai do ar.") },
            confirmButton = {
                TextButton(onClick = { toReport = null; attempt("Denúncia enviada.") { Repo.report(me.id, "POST", p.id, p.authorId, p.text) } }) { Text("Denunciar") }
            },
            dismissButton = { TextButton(onClick = { toReport = null }) { Text("Cancelar") } },
        )
    }
}

/** Fechado é uma linha; tocar abre o campo (a animação mostra de onde ele veio). */
@Composable
private fun Composer(me: Profile, onPublished: () -> Unit) {
    val scope = rememberCoroutineScope()
    val busy = rememberBusy()
    var open by rememberSaveable { mutableStateOf(false) }
    var text by rememberSaveable { mutableStateOf("") }
    var sport by rememberSaveable { mutableStateOf(me.sport) }
    Panel {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Row(Modifier.fillMaxWidth().clickable(onClickLabel = "Escrever") { open = true }, verticalAlignment = Alignment.CenterVertically) {
                Avatar(me.avatar, 40.dp)
                Text(
                    if (open) me.name else "Escreva para a galera",
                    Modifier.padding(start = 12.dp),
                    color = if (open) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.onSurfaceVariant,
                    fontWeight = if (open) FontWeight.SemiBold else null,
                )
            }
            AnimatedVisibility(open) {
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    OutlinedTextField(
                        text, { if (it.length <= 1000) text = it }, minLines = 3,
                        placeholder = { Text("Ex.: alguém pro vôlei amanhã às 6h?") }, modifier = Modifier.fillMaxWidth(),
                    )
                    SportChips(sport) { sport = it }
                    busy.error?.let { Text(it, color = MaterialTheme.colorScheme.error) }
                    Row(Modifier.align(Alignment.End), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        TextButton(onClick = { open = false }) { Text("Fechar") }
                        Button(
                            onClick = { scope.act(busy) { Repo.publish(me, text, sport); text = ""; open = false; onPublished() } },
                            enabled = text.isNotBlank() && !busy.running,
                        ) { Text(if (busy.running) "Publicando…" else "Publicar") }
                    }
                }
            }
        }
    }
}

@Composable
private fun PostCard(p: Post, mine: Boolean, modifier: Modifier, onLike: () -> Unit, onDelete: () -> Unit, onReport: () -> Unit, onBlock: () -> Unit) {
    val scope = rememberCoroutineScope()
    val pop = remember { Animatable(1f) }
    var menu by remember { mutableStateOf(false) }
    Panel(modifier) {
        Column(Modifier.padding(start = 16.dp, end = 4.dp, top = 12.dp, bottom = 4.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Avatar(p.authorAvatar, 40.dp)
                Column(Modifier.weight(1f).padding(start = 12.dp)) {
                    Text(p.authorName, fontWeight = FontWeight.SemiBold)
                    Text("${p.sport.emoji} ${p.sport.label}, ${ago(p.createdAt)}", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                Box {
                    IconButton(onClick = { menu = true }) { Icon(Icons.Outlined.MoreVert, "Opções da publicação") }
                    DropdownMenu(menu, onDismissRequest = { menu = false }) {
                        if (mine) DropdownMenuItem(text = { Text("Apagar") }, onClick = { menu = false; onDelete() })
                        else {
                            DropdownMenuItem(text = { Text("Denunciar") }, onClick = { menu = false; onReport() })
                            DropdownMenuItem(text = { Text("Bloquear ${p.authorName}") }, onClick = { menu = false; onBlock() })
                        }
                    }
                }
            }
            Text(p.text, Modifier.padding(top = 8.dp, end = 12.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = {
                    if (!p.likedByMe) scope.launch { pop.animateTo(1.35f, tween(90)); pop.animateTo(1f, spring(dampingRatio = 0.35f, stiffness = 500f)) }
                    onLike()
                }) {
                    Icon(
                        if (p.likedByMe) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                        contentDescription = if (p.likedByMe) "Descurtir" else "Curtir",
                        tint = if (p.likedByMe) Coral else MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.scale(pop.value),
                    )
                }
                Text(
                    when (p.likes) { 0L -> "Curtir"; 1L -> "1 curtida"; else -> "${p.likes} curtidas" },
                    style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
        }
    }
}
