package com.animerift.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = androidx.compose.ui.graphics.Color(0xFF8A5CF6),
    secondary = androidx.compose.ui.graphics.Color(0xFF60A5FA),
    tertiary = androidx.compose.ui.graphics.Color(0xFFE0B3FF),
    background = androidx.compose.ui.graphics.Color(0xFF0F1226),
    surface = androidx.compose.ui.graphics.Color(0xFF171B2E),
    onPrimary = androidx.compose.ui.graphics.Color.White,
    onBackground = androidx.compose.ui.graphics.Color(0xFFF5F5F9),
    onSurface = androidx.compose.ui.graphics.Color(0xFFF5F5F9)
)

private val LightColorScheme = lightColorScheme(
    primary = androidx.compose.ui.graphics.Color(0xFF7C3AED),
    secondary = androidx.compose.ui.graphics.Color(0xFF3B82F6),
    tertiary = androidx.compose.ui.graphics.Color(0xFFD8B4FE),
    background = androidx.compose.ui.graphics.Color(0xFFF5F5F9),
    surface = androidx.compose.ui.graphics.Color.White,
    onPrimary = androidx.compose.ui.graphics.Color.White,
    onBackground = androidx.compose.ui.graphics.Color(0xFF111827),
    onSurface = androidx.compose.ui.graphics.Color(0xFF111827)
)

@Composable
fun AnimeRiftTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
