package com.silaeva.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.silaeva.common_ui.components.EnterFields
import com.silaeva.common_ui.ui.theme.AppColors
import com.silaeva.common_ui.ui.theme.AppSpacing
import com.silaeva.common_ui.ui.theme.AppTypography

@Composable
fun FirstScreen() {
    Column(
        modifier = Modifier
            .background(
                color = AppColors.black
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            modifier = Modifier
                .padding(top = AppSpacing.large, bottom = AppSpacing.extraLarge),
            text = "Поиск дешевых авиабилетов",
            color = AppColors.grey_7,
            style = AppTypography.title1
        )

        Box(
            modifier = Modifier
                .padding(AppSpacing.medium)
                .background(
                    color = AppColors.grey_3,
                    shape = RoundedCornerShape(AppSpacing.radiusMedium)
                ),
            contentAlignment = Alignment.Center
        ) {
            EnterFields(
                modifier = Modifier,
                iconResource = com.silaeva.common_ui.R.drawable.ic_loupe,
                contentColor = AppColors.white,
                backgroundColor = AppColors.grey_4
            )
        }

        Text(
            text = "Музыкально отлететь",
            color = AppColors.white,
            style = AppTypography.title1
        )

        LazyRow(
            modifier = Modifier
                .fillMaxWidth(),
            state = rememberLazyListState()
        ) {
            item {
                Column(
                    modifier = Modifier
                        .padding(horizontal = AppSpacing.medium),
                    horizontalAlignment = Alignment.Start
                ) {
                    Image(
                        modifier = Modifier.background(
                            color = AppColors.black,
                            shape = RoundedCornerShape(AppSpacing.radiusMedium)
                        ),
                        painter = painterResource(R.drawable.red_white),
                        contentDescription = null
                    )
                    Text(
                        text = "Die Antwoord",
                        color = AppColors.white,
                        style = AppTypography.title3
                    )
                    Text(
                        text = "Die Antwoord",
                        color = AppColors.white,
                        style = AppTypography.title3
                    )
                    Row {

                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstScreenPreview() {
    FirstScreen()
}