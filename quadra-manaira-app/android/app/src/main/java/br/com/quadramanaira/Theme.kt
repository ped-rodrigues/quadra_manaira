package br.com.quadramanaira

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Paleta tirada da própria quadra: o verde-azulado do mar de Manaíra, o amarelo das linhas pintadas
// no piso e o cinza claro do concreto. Coral só para curtir e para ações destrutivas.
val Mar = Color(0xFF0B6E69)
val MarFundo = Color(0xFF07423F)
val Linha = Color(0xFFF5C400)
val Concreto = Color(0xFFEEF2F0)
val Tinta = Color(0xFF0F2A28)
val Coral = Color(0xFFD7264F)

/** Fonte condensada de placar: títulos, horários e números. O texto corrido usa a fonte do sistema. */
val Placar = FontFamily(Font(R.font.barlow_condensed_semibold, FontWeight.SemiBold))

private val Light = lightColorScheme(
    primary = Mar, onPrimary = Color.White,
    primaryContainer = Color(0xFFCDE9E6), onPrimaryContainer = Tinta,
    secondary = Linha, onSecondary = Tinta,
    secondaryContainer = Color(0xFFFFF1B8), onSecondaryContainer = Tinta,
    background = Concreto, onBackground = Tinta,
    surface = Concreto, onSurface = Tinta,
    surfaceVariant = Color(0xFFDDE6E3), onSurfaceVariant = Color(0xFF41605C),
    surfaceContainerLowest = Color.White, surfaceContainerLow = Color(0xFFF7FAF9),
    surfaceContainer = Color.White, surfaceContainerHigh = Color(0xFFE6EDEB), surfaceContainerHighest = Color(0xFFDDE6E3),
    outline = Color(0xFF8FA8A4), outlineVariant = Color(0xFFC9D6D3),
    error = Coral, onError = Color.White,
)

private val Dark = darkColorScheme(
    primary = Color(0xFF4CC3BA), onPrimary = Color(0xFF00201E),
    primaryContainer = Color(0xFF0B4F4B), onPrimaryContainer = Color(0xFFCDE9E6),
    secondary = Linha, onSecondary = Tinta,
    secondaryContainer = Color(0xFF4A3D00), onSecondaryContainer = Color(0xFFFFF1B8),
    background = Color(0xFF071C1B), onBackground = Color(0xFFDDEAE7),
    surface = Color(0xFF071C1B), onSurface = Color(0xFFDDEAE7),
    surfaceVariant = Color(0xFF1C3633), onSurfaceVariant = Color(0xFFA9C2BE),
    surfaceContainerLowest = Color(0xFF041312), surfaceContainerLow = Color(0xFF0C2321),
    surfaceContainer = Color(0xFF0F2A28), surfaceContainerHigh = Color(0xFF173431), surfaceContainerHighest = Color(0xFF1F3F3B),
    outline = Color(0xFF5F7C78), outlineVariant = Color(0xFF2C4845),
    error = Color(0xFFFF8FA6), onError = Color(0xFF3F0012),
)

private fun placar(size: Int, line: Int) = TextStyle(fontFamily = Placar, fontWeight = FontWeight.SemiBold, fontSize = size.sp, lineHeight = line.sp)

private val Type = Typography(
    displaySmall = placar(44, 46),
    headlineMedium = placar(32, 36),
    headlineSmall = placar(26, 30),
    titleLarge = placar(22, 26),
)

@Composable
fun QuadraTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = if (isSystemInDarkTheme()) Dark else Light, typography = Type, content = content)
}

// ---------- Peças compartilhadas ----------

/** Bloco branco de conteúdo. */
@Composable
fun Panel(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Surface(modifier.fillMaxWidth(), shape = RoundedCornerShape(20.dp), color = MaterialTheme.colorScheme.surfaceContainer, content = content)
}

@Composable
fun ScreenTitle(text: String, modifier: Modifier = Modifier, action: @Composable () -> Unit = {}) {
    Row(
        modifier.fillMaxWidth().statusBarsPadding().padding(start = 20.dp, end = 8.dp, top = 12.dp, bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(text, style = MaterialTheme.typography.headlineMedium, modifier = Modifier.weight(1f))
        action()
    }
}

@Composable
fun Avatar(emoji: String, size: Dp = 44.dp) {
    Box(
        Modifier.size(size).background(MaterialTheme.colorScheme.primaryContainer, CircleShape),
        contentAlignment = Alignment.Center,
    ) { Text(emoji, fontSize = (size.value * 0.5f).sp) }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun <T> Chips(options: List<T>, selected: T, label: (T) -> String, onSelect: (T) -> Unit, enabled: (T) -> Boolean = { true }) {
    FlowRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        options.forEach { o ->
            FilterChip(
                selected = o == selected,
                onClick = { onSelect(o) },
                enabled = enabled(o),
                label = { Text(label(o)) },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = MaterialTheme.colorScheme.primary,
                    selectedLabelColor = MaterialTheme.colorScheme.onPrimary,
                ),
            )
        }
    }
}

@Composable
fun SportChips(selected: Sport, onSelect: (Sport) -> Unit) =
    Chips(Sport.entries, selected, { "${it.emoji} ${it.label}" }, onSelect)

@Composable
fun Empty(text: String, modifier: Modifier = Modifier) {
    Box(modifier.fillMaxWidth().padding(32.dp), contentAlignment = Alignment.Center) {
        Text(text, textAlign = TextAlign.Center, color = MaterialTheme.colorScheme.onSurfaceVariant)
    }
}

@Composable
fun Loading(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center) { CircularProgressIndicator() }
}

@Composable
fun Gap(h: Dp) = Spacer(Modifier.size(h))
