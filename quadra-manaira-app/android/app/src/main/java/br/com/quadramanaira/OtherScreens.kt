package br.com.quadramanaira

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

// ---------- Alertas ----------

@Composable
fun AlertsScreen(me: Profile, alerts: List<Alert>?, pad: PaddingValues) {
    val scope = rememberCoroutineScope()
    Column(Modifier.fillMaxSize().padding(bottom = pad.calculateBottomPadding())) {
        ScreenTitle("Alertas") {
            if (alerts.orEmpty().any { !it.read }) {
                TextButton(onClick = { scope.launch { Repo.markAlertsRead(me.id, alerts.orEmpty().filter { !it.read }.map { it.id }) } }) { Text("Marcar todos como lidos") }
            }
        }
        when {
            alerts == null -> Loading()
            alerts.isEmpty() -> Empty("Aqui aparecem seus jogos, o lembrete 24 h antes, mensagens novas e os aniversários da galera.")
            else -> LazyColumn(contentPadding = PaddingValues(bottom = 24.dp)) {
                items(alerts, key = { it.id }) { a ->
                    Row(
                        Modifier.fillMaxWidth()
                            .background(if (a.read) MaterialTheme.colorScheme.background else MaterialTheme.colorScheme.secondaryContainer)
                            .clickable(enabled = !a.read) { scope.launch { Repo.markAlertsRead(me.id, listOf(a.id)) } }
                            .padding(horizontal = 20.dp, vertical = 14.dp),
                    ) {
                        Text(alertIcon(a.type), style = MaterialTheme.typography.headlineSmall, modifier = Modifier.width(40.dp))
                        Column(Modifier.weight(1f)) {
                            Text(a.title, fontWeight = if (a.read) FontWeight.Normal else FontWeight.Bold)
                            Text(a.message, color = MaterialTheme.colorScheme.onSurfaceVariant)
                            Text(ago(a.createdAt), style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.padding(top = 4.dp))
                        }
                    }
                    HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
                }
            }
        }
    }
}

private fun alertIcon(type: String) = when (type) {
    "BOOKING" -> "📅"
    "CHAT" -> "💬"
    "ALERT_24H" -> "⏰"
    "BIRTHDAY" -> "🎉"
    else -> "🔔"
}

// ---------- Perfil ----------

@Composable
fun ProfileScreen(me: Profile, pad: PaddingValues, onLocal: () -> Unit) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val busy = rememberBusy()
    var editing by rememberSaveable { mutableStateOf(false) }
    var broadcasts by remember { mutableStateOf(Repo.broadcasts()) }
    var confirmDelete by remember { mutableStateOf(false) }

    Column(
        Modifier.fillMaxSize().padding(bottom = pad.calculateBottomPadding()).verticalScroll(rememberScrollState()).imePadding(),
    ) {
        ScreenTitle("Perfil")
        Column(Modifier.padding(horizontal = 16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Panel {
                AnimatedContent(editing, transitionSpec = { fadeIn() togetherWith fadeOut() }, label = "perfil") { edit ->
                    Column(Modifier.padding(16.dp)) {
                        if (edit) ProfileForm(me, saveLabel = "Salvar", onSaved = { editing = false }, onCancel = { editing = false })
                        else {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Avatar(me.avatar, 64.dp)
                                Column(Modifier.weight(1f).padding(start = 16.dp)) {
                                    Text(me.name, style = MaterialTheme.typography.headlineSmall)
                                    Text(me.email, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                                    Text("${me.sport.emoji} ${me.sport.label}", style = MaterialTheme.typography.bodySmall)
                                }
                            }
                            OutlinedButton(onClick = { editing = true }, modifier = Modifier.fillMaxWidth().padding(top = 12.dp)) { Text("Editar perfil") }
                        }
                    }
                }
            }

            Panel {
                Column {
                    SettingRow("Como chegar na quadra", onClick = onLocal)
                    HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
                    SettingRow("Compartilhar o app", onClick = { share(context) })
                    HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
                    Row(Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                        Column(Modifier.weight(1f)) {
                            Text("Avisos gerais da quadra")
                            Text(
                                "Jogos novos, cancelamentos e aniversários. Desligado, você só recebe os seus jogos e mensagens.",
                                style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                        }
                        Switch(broadcasts, onCheckedChange = { on ->
                            broadcasts = on
                            scope.launch { runCatching { Repo.setBroadcasts(on) } }
                        }, modifier = Modifier.padding(start = 12.dp))
                    }
                }
            }

            busy.error?.let { Text(it, color = MaterialTheme.colorScheme.error) }
            TextButton(onClick = { scope.launch { Repo.logout() } }, modifier = Modifier.fillMaxWidth()) { Text("Sair da conta") }
            TextButton(onClick = { confirmDelete = true }, modifier = Modifier.fillMaxWidth()) { Text("Excluir minha conta", color = MaterialTheme.colorScheme.error) }
            Text(
                "Quadra de Manaíra, versão ${BuildConfig.VERSION_NAME}",
                style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(bottom = 16.dp),
            )
        }
    }

    if (confirmDelete) {
        AlertDialog(
            onDismissRequest = { confirmDelete = false },
            title = { Text("Excluir sua conta?") },
            text = { Text("Apagamos seu perfil, publicações, curtidas, conversas e agendamentos. Jogos futuros são cancelados. Não dá para desfazer.") },
            confirmButton = {
                TextButton(onClick = { confirmDelete = false; scope.act(busy) { Repo.deleteAccount() } }) {
                    Text("Excluir conta", color = MaterialTheme.colorScheme.error)
                }
            },
            dismissButton = { TextButton(onClick = { confirmDelete = false }) { Text("Cancelar") } },
        )
    }
}

@Composable
private fun SettingRow(text: String, onClick: () -> Unit) {
    Text(text, Modifier.fillMaxWidth().clickable(onClick = onClick).padding(16.dp))
}

fun share(context: Context) {
    val send = Intent(Intent.ACTION_SEND).setType("text/plain").putExtra(Intent.EXTRA_TEXT, Quadra.SHARE_TEXT)
    context.startActivity(Intent.createChooser(send, "Compartilhar a Quadra de Manaíra"))
}

private fun openRoute(context: Context) {
    val geo = Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=${Quadra.LAT},${Quadra.LNG}(Quadra de Manaíra)"))
    try {
        context.startActivity(geo)
    } catch (_: ActivityNotFoundException) {
        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/?api=1&destination=${Quadra.LAT},${Quadra.LNG}")))
    }
}

// ---------- Localização ----------

@Composable
fun LocalScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    Column(Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
        Box(Modifier.fillMaxWidth().height(280.dp)) {
            Image(
                painterResource(R.drawable.img_capa_quadra), contentDescription = "Foto da quadra na orla de Manaíra",
                contentScale = ContentScale.Crop, modifier = Modifier.matchParentSize(),
            )
            FilledTonalIconButton(onClick = onBack, modifier = Modifier.statusBarsPadding().padding(8.dp)) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, "Voltar")
            }
        }
        Column(Modifier.padding(20.dp).navigationBarsPadding(), verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Text(Quadra.NAME, style = MaterialTheme.typography.headlineMedium)
            Text(Quadra.ADDRESS, color = MaterialTheme.colorScheme.onSurfaceVariant)
            Button(onClick = { openRoute(context) }, modifier = Modifier.fillMaxWidth().height(52.dp)) { Text("Abrir rota no mapa") }
            OutlinedButton(onClick = { share(context) }, modifier = Modifier.fillMaxWidth()) { Text("Compartilhar o app") }
            Text("O que tem lá", style = MaterialTheme.typography.titleLarge, modifier = Modifier.padding(top = 8.dp))
            Quadra.infrastructure.forEach { (title, desc) ->
                Row(Modifier.height(IntrinsicSize.Min)) {
                    // Traço amarelo, como as linhas da quadra, da altura do texto.
                    Box(Modifier.padding(vertical = 4.dp).width(4.dp).fillMaxHeight().background(Linha))
                    Column(Modifier.padding(start = 12.dp)) {
                        Text(title, fontWeight = FontWeight.SemiBold)
                        Text(desc, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                }
            }
        }
    }
}
