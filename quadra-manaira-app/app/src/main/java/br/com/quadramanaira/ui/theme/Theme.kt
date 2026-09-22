package br.com.quadramanaira.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Paleta do app original.
val ManairaCyan = Color(0xFF00838F)
val ManairaDarkBlue = Color(0xFF005662)
val ManairaAmber = Color(0xFFFFD166)
val ManairaSand = Color(0xFFF7FAFC)
private val DarkPrimary = Color(0xFF4DD0E1)
private val DarkSecondary = Color(0xFF80DEEA)
private val DarkBackground = Color(0xFF0F172A)
private val DarkSurface = Color(0xFF1E293B)

private val LightColors = lightColorScheme(
    primary = ManairaCyan,
    secondary = ManairaDarkBlue,
    tertiary = ManairaAmber,
    background = ManairaSand,
    surface = Color.White,
)

private val DarkColors = darkColorScheme(
    primary = DarkPrimary,
    secondary = DarkSecondary,
    tertiary = ManairaAmber,
    background = DarkBackground,
    surface = DarkSurface,
)

@Composable
fun QuadraTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = if (darkTheme) DarkColors else LightColors, content = content)
}
