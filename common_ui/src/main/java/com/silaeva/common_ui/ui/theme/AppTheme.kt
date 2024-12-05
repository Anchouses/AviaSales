package com.silaeva.common_ui.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colorScheme = unusedColorScheme(Color.Yellow),
    ) {
        CompositionLocalProvider(
            LocalTypography provides AppTypography,
            LocalColors provides if (darkTheme) LocalColorsDark else LocalColorsLight,
        ) {
            content()
        }
    }
}

object AppTheme {

    val typography: AppTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val colors: AppColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current
}

private val LocalColors = staticCompositionLocalOf<AppColors> {
    error("No colors provided")
}

private val LocalTypography = staticCompositionLocalOf<AppTypography> {
    error("No typography provided")
}

private fun unusedColorScheme(
    debugColor: Color,
) = ColorScheme(
    primary = debugColor,
    onPrimary = debugColor,
    primaryContainer = debugColor,
    onPrimaryContainer = debugColor,
    inversePrimary = debugColor,
    secondary = debugColor,
    onSecondary = debugColor,
    secondaryContainer = debugColor,
    onSecondaryContainer = debugColor,
    tertiary = debugColor,
    onTertiary = debugColor,
    tertiaryContainer = debugColor,
    onTertiaryContainer = debugColor,
    background = debugColor,
    onBackground = debugColor,
    surface = debugColor,
    onSurface = debugColor,
    surfaceVariant = debugColor,
    onSurfaceVariant = debugColor,
    surfaceTint = debugColor,
    inverseSurface = debugColor,
    inverseOnSurface = debugColor,
    error = debugColor,
    onError = debugColor,
    errorContainer = debugColor,
    onErrorContainer = debugColor,
    outline = debugColor,
    outlineVariant = debugColor,
    scrim = debugColor,
)
