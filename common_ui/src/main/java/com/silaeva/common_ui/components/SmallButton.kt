package com.silaeva.common_ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.silaeva.common_ui.R
import com.silaeva.common_ui.ui.theme.AppTheme
import com.silaeva.common_ui.ui.theme.AppTheme.spacing
import com.silaeva.common_ui.ui.theme.AppTypography

@Composable
fun SmallButton(
    modifier: Modifier = Modifier,
    buttonColor: Color,
    text: String,
    textColor: Color,
    isIconNeed: Boolean,
    iconResource: Int,
    iconDescription: String,
    onClickListener: () -> Unit
) {
    Button(
        onClick = onClickListener,
        modifier = modifier
            .width(AppTheme.spacing.secondaryButtonWidth)
            .height(AppTheme.spacing.secondaryButtonHeight),
        shape = RoundedCornerShape(AppTheme.spacing.radiusLarge),
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColor
        )
    ) {
        if (isIconNeed) {
            Icon(
                painter = painterResource(id = iconResource),
                contentDescription = iconDescription,
                modifier = Modifier
                    .align(Alignment.CenterVertically),
                tint = AppTheme.colors.content.primary
            )
        }
        Spacer(
            modifier = Modifier
                .width(AppTheme.spacing.radiusSmall)
        )
        Text(
            text = text,
            color = textColor,
            style = AppTypography.title4,
            modifier = Modifier
                .align(Alignment.CenterVertically)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SmallButtonPreview()  {
    SmallButton(
        text = "stringResource(id = R.string.onwards)",
        iconResource = R.drawable.ic_plus,
        iconDescription = "",
        onClickListener = {},
        buttonColor = Color.Black,
        textColor = Color.White,
        isIconNeed = true
    )
}