package com.silaeva.common_ui.bottom_nav_bar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.silaeva.common_ui.R
import com.silaeva.common_ui.ui.theme.AppColors


@Composable
fun BottomNavBar() {

    var bottomBarDirection by remember { mutableStateOf(BottomBarDirection.SEARCH_TICKET) }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            contentAlignment = Alignment.TopCenter
        ) {
            when (bottomBarDirection) {
                BottomBarDirection.SEARCH_TICKET -> {}
                BottomBarDirection.HOTELS -> {}
                BottomBarDirection.AREA -> {}
                BottomBarDirection.SUBSCRIPTIONS -> {}
                BottomBarDirection.PROFILE -> {}
                else -> {}
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            contentAlignment = Alignment.BottomCenter
        ) {
            HorizontalDivider(
                thickness = 1.dp,
                color = AppColors.grey_6
            )
            Row(
                modifier = Modifier
                    .background(color = AppColors.black)
                    .padding(vertical = 6.dp,)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.Top
            ) {
                BottomNavIcon(
                    iconResource = R.drawable.ic_plane,
                    descriptionIcon = "Авиабилеты",
                    onClick = {
                        bottomBarDirection = BottomBarDirection.SEARCH_TICKET
                    },
                    isClicked = bottomBarDirection == BottomBarDirection.SEARCH_TICKET
                )

                BottomNavIcon(
                    iconResource = R.drawable.ic_hotel,
                    descriptionIcon = "Отели",
                    onClick = {
                        bottomBarDirection = BottomBarDirection.HOTELS
                    },
                    isClicked = bottomBarDirection == BottomBarDirection.HOTELS
                )

                BottomNavIcon(
                    iconResource = R.drawable.ic_place,
                    descriptionIcon = "Короче",
                    onClick = {
                        bottomBarDirection = BottomBarDirection.AREA
                    },
                    isClicked = bottomBarDirection == BottomBarDirection.AREA
                )

                BottomNavIcon(
                    iconResource = R.drawable.ic_bell,
                    descriptionIcon = "Подписки",
                    onClick = {
                        bottomBarDirection = BottomBarDirection.SUBSCRIPTIONS
                    },
                    isClicked = bottomBarDirection == BottomBarDirection.SUBSCRIPTIONS
                )

                BottomNavIcon(
                    iconResource = R.drawable.ic_bell,
                    descriptionIcon = "Профиль",
                    onClick = {
                        bottomBarDirection = BottomBarDirection.PROFILE
                    },
                    isClicked = bottomBarDirection == BottomBarDirection.PROFILE
                )
            }
        }
    }
}