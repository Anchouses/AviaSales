package com.silaeva.common_ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.silaeva.common_ui.ui.theme.AppColors
import com.silaeva.common_ui.ui.theme.AppSpacing
import com.silaeva.common_ui.ui.theme.AppTypography

@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    buttonColor: Color,
    text: String,
    textColor: Color,
    onClickListener: () -> Unit
) {
    Button(
        onClick = onClickListener,
        modifier = modifier
            .width(AppSpacing.secondaryButtonWidth)
            .height(AppSpacing.secondaryButtonHeight),
        shape = RoundedCornerShape(AppSpacing.radiusLarge),
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColor
        )
    ) {
        Text(
            text = text,
            color = textColor,
            style = AppTypography.buttonText,
            modifier = Modifier
                .align(Alignment.CenterVertically)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SecondaryButtonPreview() {
    SecondaryButton(
        text = "stringResource(id = R.string.onwards)",
        onClickListener = {},
        buttonColor = AppColors.black,
        textColor = AppColors.white
    )
}