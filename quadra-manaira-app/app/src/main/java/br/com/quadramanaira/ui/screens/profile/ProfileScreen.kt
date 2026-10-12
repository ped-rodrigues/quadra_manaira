package br.com.quadramanaira.ui.screens.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewModelScope
import br.com.quadramanaira.BuildConfig
import br.com.quadramanaira.Repos
import br.com.quadramanaira.data.model.Avatars
import br.com.quadramanaira.data.model.Sport
import br.com.quadramanaira.data.model.UserProfile
import br.com.quadramanaira.push.Notifications
import br.com.quadramanaira.ui.components.AvatarBubble
import br.com.quadramanaira.ui.components.AvatarSelector
import br.com.quadramanaira.ui.components.SportSelector
import br.com.quadramanaira.ui.screens.auth.BirthDateField
import br.com.quadramanaira.util.QuadraInfo
import br.com.quadramanaira.util.toUserMessage
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProfileViewModel(private val repos: Repos) : ViewModel() {
    private val _saving = MutableStateFlow(false)
    val saving: StateFlow<Boolean> = _saving.asStateFlow()
    private val _message = MutableStateFlow<String?>(null)
    val message: StateFlow<String?> = _message.asStateFlow()

    fun save(name: String, birthDate: String, sport: Sport, avatar: String, onSaved: () -> Unit = {}) {
        if (_saving.value) return
        _saving.value = true
        viewModelScope.launch {
            repos.users.updateProfile(name, birthDate, sport, avatar)
                .onSuccess { _message.value = "Perfil salvo!"; onSaved() }
                .onFailure { _message.value = it.toUserMessage() }
            _saving.value = false
        }
    }

    fun logout() {
        viewModelScope.launch { repos.auth.logout() }
    }

    fun deleteAccount() {
        viewModelScope.launch {
            repos.auth.deleteAccount().onFailure { _message.value = it.toUserMessage() }
        }
    }
}

@Composable
fun ProfileScreen(vm: ProfileViewModel, me: UserProfile, contentPadding: PaddingValues, onOpenMap: () -> Unit) {
    val context = LocalContext.current
    var editing by rememberSaveable { mutableStateOf(false) }
    var broadcasts by remember { mutableStateOf(Notifications.broadcastsEnabled(context)) }
    var confirmDelete by remember { mutableStateOf(false) }
    val message by vm.message.collectAsStateWithLifecycle()

    Column(
        Modifier
            .padding(contentPadding)
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        if (editing) {
            ProfileForm(vm, initial = me, title = "Editar perfil", onDone = { editing = false }, onCancel = { editing = false })
        } else {
            Card(Modifier.fillMaxWidth()) {
                Row(Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                    AvatarBubble(me.avatar, 64.dp)
                    Spacer(Modifier.width(16.dp))
                    Column(Modifier.weight(1f)) {
                        Text(me.name, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
                        Text(me.email, style = MaterialTheme.typography.bodySmall)
                        Text("${me.sport.emoji} ${me.sport.label} • Nascimento: ${me.birthDate}", style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
            Button(onClick = { editing = true }, modifier = Modifier.fillMaxWidth()) { Text("Editar meu perfil") }
        }

        Text("Recursos & compartilhamento", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.primary)
        OutlinedButton(onClick = onOpenMap, modifier = Modifier.fillMaxWidth()) { Text("📍 Localização da quadra") }
        OutlinedButton(onClick = { QuadraInfo.share(context) }, modifier = Modifier.fillMaxWidth()) { Text("Compartilhar no WhatsApp") }

        Text("Notificações", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.primary)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(Modifier.weight(1f)) {
                Text("Avisos gerais da quadra")
                Text("Novos jogos, cancelamentos e aniversários. Desligado: só seus jogos e mensagens.", style = MaterialTheme.typography.bodySmall)
            }
            Switch(checked = broadcasts, onCheckedChange = {
                broadcasts = it
                Notifications.setBroadcastsEnabled(context, it)
            })
        }

        TextButton(onClick = vm::logout, modifier = Modifier.fillMaxWidth()) {
            Text("Sair da conta", color = MaterialTheme.colorScheme.error)
        }
        TextButton(onClick = { confirmDelete = true }, modifier = Modifier.fillMaxWidth()) {
            Text("Excluir minha conta", color = MaterialTheme.colorScheme.error)
        }
        if (!editing) message?.let { Text(it, color = MaterialTheme.colorScheme.primary) }
        Text(
            "Quadra de Manaíra • Versão ${BuildConfig.VERSION_NAME}",
            style = MaterialTheme.typography.labelSmall,
            modifier = Modifier.align(Alignment.CenterHorizontally),
        )
    }

    if (confirmDelete) {
        AlertDialog(
            onDismissRequest = { confirmDelete = false },
            title = { Text("Excluir sua conta?") },
            text = { Text("Seu perfil, publicações, curtidas, conversas e agendamentos serão apagados. Jogos futuros serão cancelados. Não dá pra desfazer.") },
            confirmButton = {
                TextButton(onClick = { confirmDelete = false; vm.deleteAccount() }) {
                    Text("Excluir", color = MaterialTheme.colorScheme.error)
                }
            },
            dismissButton = { TextButton(onClick = { confirmDelete = false }) { Text("Cancelar") } },
        )
    }
}

/** Formulário de perfil, usado para editar e para completar o cadastro após o login com Google. */
@Composable
fun ProfileForm(
    vm: ProfileViewModel,
    initial: UserProfile?,
    title: String,
    onDone: () -> Unit = {},
    onCancel: (() -> Unit)? = null,
) {
    val saving by vm.saving.collectAsStateWithLifecycle()
    val message by vm.message.collectAsStateWithLifecycle()
    var name by rememberSaveable { mutableStateOf(initial?.name.orEmpty()) }
    var birthDate by rememberSaveable { mutableStateOf(initial?.birthDate.orEmpty()) }
    var sport by rememberSaveable { mutableStateOf(initial?.sport ?: Sport.FUTEBOL) }
    var avatar by rememberSaveable { mutableStateOf(initial?.avatar ?: Avatars.all.first()) }

    Column(Modifier.imePadding(), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text(title, style = MaterialTheme.typography.titleLarge)
        OutlinedTextField(name, { name = it }, label = { Text("Nome completo") }, singleLine = true, modifier = Modifier.fillMaxWidth())
        BirthDateField(birthDate, { birthDate = it })
        Text("Esporte praticado", style = MaterialTheme.typography.labelLarge)
        SportSelector(sport, { sport = it })
        Text("Avatar", style = MaterialTheme.typography.labelLarge)
        AvatarSelector(avatar, { avatar = it })
        message?.let { Text(it, color = MaterialTheme.colorScheme.primary) }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            if (onCancel != null) OutlinedButton(onClick = onCancel, modifier = Modifier.weight(1f)) { Text("Cancelar") }
            Button(
                onClick = { vm.save(name, birthDate, sport, avatar, onDone) },
                enabled = !saving,
                modifier = Modifier.weight(1f),
            ) { Text(if (saving) "Salvando..." else "Salvar") }
        }
    }
}
