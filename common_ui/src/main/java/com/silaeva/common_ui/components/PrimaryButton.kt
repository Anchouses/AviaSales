package com.silaeva.common_ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.silaeva.common_ui.ui.theme.AppTheme
import com.silaeva.common_ui.ui.theme.AppTheme.spacing


@Composable
fun PrimaryColorButton(
    modifier: Modifier = Modifier,
    text: String,
    buttonColor: Color,
    textColor: Color,
    onClickListener: () -> Unit
) {
    Button(
        onClick = onClickListener,
        modifier = modifier
            .fillMaxWidth()
            .height(AppTheme.spacing.primaryButtonHeight),
        shape = RoundedCornerShape(AppTheme.spacing.radiusSmall),
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColor,
        )
    ) {
        Text(
            text = text,
            color = textColor,
            style = AppTheme.typography.buttonText,
            modifier = Modifier
                .align(Alignment.CenterVertically)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PrimaryColorButtonPreview() {
    PrimaryColorButton(
        text = "stringResource(id = R.string.onwards)",
        onClickListener = {},
        buttonColor = AppTheme.colors.background.primary,
        textColor = AppTheme.colors.content.primary,
    )
}