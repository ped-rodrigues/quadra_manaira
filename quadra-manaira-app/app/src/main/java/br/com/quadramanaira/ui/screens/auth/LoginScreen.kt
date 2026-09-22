package br.com.quadramanaira.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
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
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import br.com.quadramanaira.R

@Composable
fun LoginScreen(vm: AuthViewModel, onCreateAccount: () -> Unit) {
    val ui by vm.ui.collectAsStateWithLifecycle()
    val context = LocalContext.current
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }
    var showRecovery by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .imePadding()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Image(
            painter = painterResource(R.drawable.img_capa_quadra),
            contentDescription = "Foto da Quadra de Manaíra",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth().height(180.dp).clip(RoundedCornerShape(16.dp)),
        )
        Text("Quadra de Manaíra", style = MaterialTheme.typography.headlineMedium, color = MaterialTheme.colorScheme.primary)
        Text(
            "Entre para agendar jogos e interagir no mural",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
        )

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("E-mail") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth(),
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Senha") },
            singleLine = true,
            visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                IconButton(onClick = { showPassword = !showPassword }) {
                    Icon(
                        if (showPassword) Icons.Default.VisibilityOff else Icons.Default.Visibility,
                        contentDescription = "Mostrar/ocultar senha",
                    )
                }
            },
            modifier = Modifier.fillMaxWidth(),
        )

        ui.error?.let { Text(it, color = MaterialTheme.colorScheme.error, textAlign = TextAlign.Center) }

        Button(
            onClick = { vm.login(email, password) },
            enabled = !ui.loading,
            modifier = Modifier.fillMaxWidth(),
        ) {
            if (ui.loading) CircularProgressIndicator(Modifier.size(20.dp), strokeWidth = 2.dp)
            else Text("Entrar")
        }
        TextButton(onClick = { vm.clearMessages(); showRecovery = true }) { Text("Esqueci minha senha") }

        HorizontalDivider()
        OutlinedButton(
            onClick = { vm.loginWithGoogle(context) },
            enabled = !ui.loading,
            modifier = Modifier.fillMaxWidth(),
        ) { Text("Entrar com Google") }
        Spacer(Modifier.height(4.dp))
        TextButton(onClick = { vm.clearMessages(); onCreateAccount() }) { Text("Não tem conta? Criar conta") }
    }

    if (showRecovery) {
        PasswordRecoveryDialog(
            initialEmail = email,
            loading = ui.loading,
            info = ui.info,
            error = ui.error,
            onSend = vm::sendPasswordReset,
            onDismiss = { showRecovery = false; vm.clearMessages() },
        )
    }
}

@Composable
private fun PasswordRecoveryDialog(
    initialEmail: String,
    loading: Boolean,
    info: String?,
    error: String?,
    onSend: (String) -> Unit,
    onDismiss: () -> Unit,
) {
    var email by remember { mutableStateOf(initialEmail) }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Recuperação de senha") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                if (info != null) {
                    Text(info)
                } else {
                    Text("Digite o e-mail da sua conta. Vamos enviar um link para criar uma nova senha.")
                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("E-mail") },
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    )
                    error?.let { Text(it, color = MaterialTheme.colorScheme.error) }
                }
            }
        },
        confirmButton = {
            if (info != null) {
                TextButton(onClick = onDismiss) { Text("OK") }
            } else {
                TextButton(onClick = { onSend(email) }, enabled = !loading) { Text("Enviar link") }
            }
        },
        dismissButton = { if (info == null) TextButton(onClick = onDismiss) { Text("Cancelar") } },
    )
}
