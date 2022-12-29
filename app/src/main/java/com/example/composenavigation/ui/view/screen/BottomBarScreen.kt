package com.example.composenavigation.ui.view.screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "HOME",
        icon = Icons.Filled.Home
    )

    object Search : BottomBarScreen(
        route = "SEARCH",
        icon = Icons.Filled.Search
    )

    object Favourite : BottomBarScreen(
        route = "FAVOURITE",
        icon = Icons.Outlined.FavoriteBorder
    )

    object Profile : BottomBarScreen(
        route = "PROFILE",
        icon = Icons.Outlined.Person
    )
}