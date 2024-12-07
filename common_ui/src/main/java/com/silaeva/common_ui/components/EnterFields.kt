package com.silaeva.common_ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.silaeva.common_ui.R
import com.silaeva.common_ui.ui.theme.AppColors
import com.silaeva.common_ui.ui.theme.AppSpacing
import com.silaeva.common_ui.ui.theme.AppTypography

@Composable
fun EnterFields(
    modifier: Modifier,
    iconResource: Int,
    contentColor: Color,
    backgroundColor: Color,
    ){
    Box(
        modifier = modifier
            .padding(AppSpacing.radiusMedium)
            .background(
            color = backgroundColor,
            shape = RoundedCornerShape(AppSpacing.radiusMedium)
        ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = modifier
                .padding(horizontal = AppSpacing.radiusSmall),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = iconResource),
                tint = contentColor,
                contentDescription = null
            )
            Column(
                modifier = modifier
                    .padding(horizontal = AppSpacing.radiusMedium)
            ) {
                InputTextField(
                    hint = "Откуда - Минск",
                    contentColor = contentColor,
                    backgroundColor = backgroundColor,
                    onTextChange = {}
                )
                HorizontalDivider(
                    modifier = Modifier,
                    thickness = AppSpacing.borderSmall,
                    color = AppColors.grey_6
                )
                InputTextField(
                    hint = "Куда - Турция",
                    contentColor = contentColor,
                    backgroundColor = backgroundColor,
                    onTextChange = {}
                )
            }
        }
    }
}

@Composable
fun InputTextField(
    modifier: Modifier = Modifier,
    hint: String,
    isError: Boolean = false,
    onTextChange: (String) -> Unit,
    contentColor: Color,
    backgroundColor: Color,
) {
    var text by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf(isError) }

    OutlinedTextField(
        value = text,
        onValueChange = { newText ->
            text = newText
            onTextChange(text)
            error = newText.isBlank()
        },
        modifier = modifier
            .onFocusChanged { focusState ->
                expanded = focusState.isFocused
            }
            .fillMaxWidth(),
        textStyle = AppTypography.buttonText,
        placeholder = {
            Text(
                text = hint,
                style = AppTypography.buttonText,
            )
        },
        isError = error,
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = backgroundColor,
            unfocusedContainerColor = backgroundColor,
            focusedTextColor = contentColor,
            unfocusedTextColor = contentColor,
            focusedPlaceholderColor = AppColors.grey_6,
            unfocusedPlaceholderColor = AppColors.grey_6,
            focusedBorderColor = backgroundColor,
            unfocusedBorderColor = backgroundColor,
        )
    )
}

@Preview(showBackground = true)
@Composable
fun EnterFieldsPreview() {
    EnterFields(
        iconResource = R.drawable.ic_loupe,
        contentColor = AppColors.white,
        backgroundColor = AppColors.grey_4,
        modifier = Modifier
    )
}
