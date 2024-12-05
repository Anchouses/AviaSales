package com.silaeva.common_ui.ui.theme

import androidx.compose.ui.graphics.Color

data class AppColors(
    val background: AppBackgroundColors,
    val content: AppContentColors,
)

data class AppBackgroundColors(
    val primary: Color,
    val surface: Color,
    val accent: Color,
)

data class AppContentColors(
    val primary: Color,
    val secondary: Color,
    val primaryInverse: Color,
    val accent: Color,
)

val LocalColorsLight = AppColors(
    background = AppBackgroundColors(
        primary = Color.White,
        surface = Color(0xFFEDF1F3),
        accent = Color(0xFF2E6DC1),
    ),
    content = AppContentColors(
        primary = Color.Black,
        secondary = Color(0xFF8B8B8B),
        primaryInverse = Color.White,
        accent = Color(0xFF2E6DC1),
    ),
)

val LocalColorsDark = AppColors(
    background = AppBackgroundColors(
        primary = Color.Black,
        surface = Color(0xFFEDF1F3),
        accent = Color(0xFF2E6DC1),
    ),
    content = AppContentColors(
        primary = Color.White,
        secondary = Color(0xFF8B8B8B),
        primaryInverse = Color.Black,
        accent = Color(0xFF2E6DC1),
    ),
)