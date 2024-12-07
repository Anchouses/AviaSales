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
import com.silaeva.common_ui.ui.theme.AppColors
import com.silaeva.common_ui.ui.theme.AppTypography


@Composable
fun BottomNavIcon(
    modifier: Modifier = Modifier,
    iconResource: Int,
    descriptionIcon: String,
    onClick: () -> Unit,
    isClicked: Boolean,

) {
    val color = if (isClicked) AppColors.blue else AppColors.grey_6

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
                style = AppTypography.tabText
            )
        }
    }
}