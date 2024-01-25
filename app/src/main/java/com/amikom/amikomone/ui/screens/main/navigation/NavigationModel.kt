package com.amikom.amikomone.ui.screens.main.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.Article
import androidx.compose.material.icons.automirrored.rounded.ViewList
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationModel(
    val route: String,
    val selectedIcon: ImageVector? = null,
    val title: String
) {
    data object Home : NavigationModel(
        route = "home",
        selectedIcon = Icons.Rounded.Home,
        title = "Beranda"
    )

    data object Schedule : NavigationModel(
        route = "schedule",
        selectedIcon = Icons.Rounded.CalendarMonth,
        title = "Jadwal"
    )

//    data object Empty : NavigationModel(
//        route = "empty",
//        selectedIcon = null,
//        title = ""
//    )

    data object History : NavigationModel(
        route = "history",
        selectedIcon = Icons.AutoMirrored.Rounded.Article,
        title = "Riwayat"
    )

    data object Profile : NavigationModel(
        route = "profile",
        selectedIcon = Icons.Rounded.Person,
        title = "Profil"
    )
}