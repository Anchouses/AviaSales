package com.silaeva.common_ui.bottom_nav_bar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.silaeva.common_ui.ui.theme.AppTheme


@Composable
fun BottomNavIcon(
    modifier: Modifier = Modifier,
    iconResource: Int,
    descriptionIcon: String,
    onClick: () -> Unit,
    isClicked: Boolean
) {
    val color = if (isClicked) AppTheme.colors.content.accent else AppTheme.colors.content.primary

    TextButton(
        onClick = { onClick() }
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                painter = painterResource(iconResource),
                contentDescription = descriptionIcon,
                tint = color
            )
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = descriptionIcon,
                color = color,
                style = AppTheme.typography.tabText
            )
        }
    }
}