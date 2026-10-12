package br.com.quadramanaira

import androidx.activity.compose.LocalActivity
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

/** Roda uma ação suspensa mostrando "ocupado" e devolvendo o erro já traduzido. */
class Busy {
    var running by mutableStateOf(false)
    var error by mutableStateOf<String?>(null)
}

@Composable
fun rememberBusy() = remember { Busy() }

fun kotlinx.coroutines.CoroutineScope.act(busy: Busy, block: suspend () -> Unit) {
    if (busy.running) return
    busy.running = true
    busy.error = null
    launch {
        try { block() } catch (e: Exception) { busy.error = e.friendly() } finally { busy.running = false }
    }
}

@Composable
fun AuthScreen() {
    var registering by rememberSaveable { mutableStateOf(false) }
    Column(Modifier.verticalScroll(rememberScrollState()).imePadding()) {
        // A foto já traz o letreiro "Quadra de Manaíra"; no cadastro ela encolhe para dar espaço ao formulário.
        Image(
            painterResource(R.drawable.img_capa_quadra), contentDescription = "Quadra de Manaíra na orla",
            contentScale = ContentScale.Crop, alignment = Alignment.TopCenter,
            modifier = Modifier.fillMaxWidth().aspectRatio(if (registering) 2.6f else 1376f / 768f).animateContentSize(),
        )
        AnimatedContent(registering, transitionSpec = { fadeIn() togetherWith fadeOut() }, label = "auth") { reg ->
            Column(Modifier.padding(20.dp).navigationBarsPadding(), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                if (reg) RegisterForm(onBack = { registering = false }) else LoginForm(onRegister = { registering = true })
            }
        }
    }
}

@Composable
private fun ColumnScope.LoginForm(onRegister: () -> Unit) {
    val scope = rememberCoroutineScope()
    val busy = rememberBusy()
    val activity = LocalActivity.current!!
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var recovering by remember { mutableStateOf(false) }

    Text("Veja os horários livres, agende seu jogo e combine com a galera.", color = MaterialTheme.colorScheme.onSurfaceVariant)
    EmailField(email) { email = it }
    PasswordField("Senha", password) { password = it }
    busy.error?.let { Text(it, color = MaterialTheme.colorScheme.error) }
    Button(onClick = { scope.act(busy) { Repo.login(email, password) } }, enabled = !busy.running, modifier = Modifier.fillMaxWidth().height(52.dp)) {
        if (busy.running) CircularProgressIndicator(Modifier.size(20.dp), strokeWidth = 2.dp) else Text("Entrar")
    }
    TextButton(onClick = { recovering = true }, modifier = Modifier.align(Alignment.CenterHorizontally)) { Text("Esqueci a senha") }
    if (Repo.googleClientId() != null) {
        HorizontalDivider()
        OutlinedButton(onClick = { scope.act(busy) { Repo.googleSignIn(activity) } }, enabled = !busy.running, modifier = Modifier.fillMaxWidth().height(52.dp)) {
            Text("Entrar com Google")
        }
    }
    TextButton(onClick = onRegister, modifier = Modifier.align(Alignment.CenterHorizontally)) { Text("Primeira vez aqui? Criar conta") }

    if (recovering) ResetDialog(email) { recovering = false }
}

@Composable
private fun ResetDialog(initialEmail: String, onDismiss: () -> Unit) {
    val scope = rememberCoroutineScope()
    val busy = rememberBusy()
    var email by remember { mutableStateOf(initialEmail) }
    var sent by remember { mutableStateOf(false) }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Criar nova senha") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                if (sent) Text("Enviamos o link para ${email.trim()}. Se não chegar em alguns minutos, olhe o spam.")
                else {
                    Text("Mandamos um link para o e-mail da sua conta.")
                    EmailField(email) { email = it }
                    busy.error?.let { Text(it, color = MaterialTheme.colorScheme.error) }
                }
            }
        },
        confirmButton = {
            if (sent) TextButton(onClick = onDismiss) { Text("Fechar") }
            else TextButton(onClick = { scope.act(busy) { Repo.resetPassword(email); sent = true } }, enabled = !busy.running) { Text("Enviar link") }
        },
        dismissButton = { if (!sent) TextButton(onClick = onDismiss) { Text("Cancelar") } },
    )
}

@Composable
private fun ColumnScope.RegisterForm(onBack: () -> Unit) {
    val scope = rememberCoroutineScope()
    val busy = rememberBusy()
    var name by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var birth by rememberSaveable { mutableStateOf("") }
    var sport by rememberSaveable { mutableStateOf(Sport.FUTEBOL) }
    var avatar by rememberSaveable { mutableStateOf(AVATARS[0]) }

    Text("Criar conta", style = MaterialTheme.typography.headlineSmall)
    OutlinedTextField(name, { name = it }, label = { Text("Nome") }, singleLine = true, modifier = Modifier.fillMaxWidth())
    EmailField(email) { email = it }
    PasswordField("Senha (mínimo 6 caracteres)", password) { password = it }
    BirthField(birth) { birth = it }
    SportAndAvatar(sport, { sport = it }, avatar, { avatar = it })
    busy.error?.let { Text(it, color = MaterialTheme.colorScheme.error) }
    Button(
        onClick = { scope.act(busy) { Repo.register(name, email, password, birth, sport, avatar) } },
        enabled = !busy.running, modifier = Modifier.fillMaxWidth().height(52.dp),
    ) { if (busy.running) CircularProgressIndicator(Modifier.size(20.dp), strokeWidth = 2.dp) else Text("Criar conta") }
    TextButton(onClick = onBack, modifier = Modifier.align(Alignment.CenterHorizontally)) { Text("Já tenho conta") }
}

/** Primeiro login com Google: só falta o nascimento (e talvez o nome). */
@Composable
fun CompleteProfileScreen(partial: Profile?) {
    val scope = rememberCoroutineScope()
    Column(
        Modifier.verticalScroll(rememberScrollState()).safeDrawingPadding().imePadding().padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Text("Falta pouco", style = MaterialTheme.typography.headlineMedium)
        Text("Complete seu perfil para agendar e conversar com a galera.")
        ProfileForm(partial, saveLabel = "Entrar na comunidade")
        TextButton(onClick = { scope.launch { Repo.logout() } }) { Text("Sair") }
    }
}

@Composable
fun ProfileForm(initial: Profile?, saveLabel: String, onSaved: () -> Unit = {}, onCancel: (() -> Unit)? = null) {
    val scope = rememberCoroutineScope()
    val busy = rememberBusy()
    var name by rememberSaveable { mutableStateOf(initial?.name.orEmpty()) }
    var birth by rememberSaveable { mutableStateOf(initial?.birthDate.orEmpty()) }
    var sport by rememberSaveable { mutableStateOf(initial?.sport ?: Sport.FUTEBOL) }
    var avatar by rememberSaveable { mutableStateOf(initial?.avatar ?: AVATARS[0]) }
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        OutlinedTextField(name, { name = it }, label = { Text("Nome") }, singleLine = true, modifier = Modifier.fillMaxWidth())
        BirthField(birth) { birth = it }
        SportAndAvatar(sport, { sport = it }, avatar, { avatar = it })
        busy.error?.let { Text(it, color = MaterialTheme.colorScheme.error) }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            if (onCancel != null) OutlinedButton(onClick = onCancel, modifier = Modifier.weight(1f)) { Text("Cancelar") }
            Button(
                onClick = { scope.act(busy) { Repo.saveProfile(name, birth, sport, avatar); onSaved() } },
                enabled = !busy.running, modifier = Modifier.weight(1f),
            ) { Text(if (busy.running) "Salvando…" else saveLabel) }
        }
    }
}

@Composable
private fun SportAndAvatar(sport: Sport, onSport: (Sport) -> Unit, avatar: String, onAvatar: (String) -> Unit) {
    Text("Esporte que você mais joga", style = MaterialTheme.typography.labelLarge)
    SportChips(sport, onSport)
    Text("Avatar", style = MaterialTheme.typography.labelLarge)
    Chips(AVATARS, avatar, { it }, onAvatar)
}

@Composable
private fun EmailField(value: String, onChange: (String) -> Unit) = OutlinedTextField(
    value, onChange, label = { Text("E-mail") }, singleLine = true,
    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email), modifier = Modifier.fillMaxWidth(),
)

@Composable
private fun PasswordField(label: String, value: String, onChange: (String) -> Unit) {
    var visible by remember { mutableStateOf(false) }
    OutlinedTextField(
        value, onChange, label = { Text(label) }, singleLine = true,
        visualTransformation = if (visible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        trailingIcon = {
            IconButton(onClick = { visible = !visible }) {
                Icon(if (visible) Icons.Outlined.VisibilityOff else Icons.Outlined.Visibility, if (visible) "Esconder senha" else "Mostrar senha")
            }
        },
        modifier = Modifier.fillMaxWidth(),
    )
}

/** dd/mm/aaaa com as barras inseridas sozinhas; o cursor vai para o fim para não ficar atrás da barra. */
@Composable
private fun BirthField(value: String, onChange: (String) -> Unit) {
    var field by remember { mutableStateOf(TextFieldValue(value, TextRange(value.length))) }
    if (field.text != value) field = TextFieldValue(value, TextRange(value.length))
    OutlinedTextField(
        field,
        { input ->
            val d = input.text.filter(Char::isDigit).take(8)
            val formatted = buildString { d.forEachIndexed { i, c -> if (i == 2 || i == 4) append('/'); append(c) } }
            field = TextFieldValue(formatted, TextRange(formatted.length))
            onChange(formatted)
        },
        label = { Text("Data de nascimento") }, placeholder = { Text("dd/mm/aaaa") }, singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number), modifier = Modifier.fillMaxWidth(),
    )
}
