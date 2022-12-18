package it.balsick.cvjetpackcompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.White
import it.balsick.composetutorial.ui.theme.Orange
import it.balsick.composetutorial.ui.theme.Purple200
import it.balsick.composetutorial.ui.theme.Purple500
import it.balsick.composetutorial.ui.theme.Purple700

private val DarkColorPalette = darkColors(
    background = Purple200,
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Orange,
)

private val LightColorPalette = lightColors(
    background = Purple200,
    onBackground = White,
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Orange

    /* Other default colors to override
background = Color.White,
surface = Color.White,
onPrimary = Color.White,
onSecondary = Color.Black,
onBackground = Color.Black,
onSurface = Color.Black,
*/
)

@Composable
fun CVJetpackComposeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}