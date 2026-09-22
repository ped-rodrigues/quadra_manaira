package br.com.quadramanaira.ui.screens.map

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import br.com.quadramanaira.R
import br.com.quadramanaira.util.QuadraInfo

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MapScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Localização da quadra") },
                navigationIcon = { IconButton(onClick = onBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, "Voltar") } },
            )
        },
    ) { padding ->
        Column(
            Modifier.padding(padding).verticalScroll(rememberScrollState()).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Image(
                painter = painterResource(R.drawable.img_capa_quadra),
                contentDescription = "Foto da Quadra de Manaíra",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth().height(200.dp).clip(RoundedCornerShape(16.dp)),
            )
            Text(QuadraInfo.NAME, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
            Text(QuadraInfo.ADDRESS, style = MaterialTheme.typography.bodyMedium)
            Button(onClick = { QuadraInfo.openRoute(context) }, modifier = Modifier.fillMaxWidth()) { Text("Traçar rota no Google Maps") }
            OutlinedButton(onClick = { QuadraInfo.share(context) }, modifier = Modifier.fillMaxWidth()) { Text("Compartilhar no WhatsApp") }
            Text("Infraestrutura do local", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.primary)
            QuadraInfo.infrastructure.forEach { (title, desc) ->
                Card(Modifier.fillMaxWidth()) {
                    Column(Modifier.padding(16.dp)) {
                        Text(title, fontWeight = FontWeight.Bold)
                        Text(desc, style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
    }
}
