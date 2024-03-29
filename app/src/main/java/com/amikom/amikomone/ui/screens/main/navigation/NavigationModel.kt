package com.amikom.amikomone.ui.screens.main.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Article
import androidx.compose.material.icons.automirrored.outlined.Article
import androidx.compose.material.icons.automirrored.rounded.Article
import androidx.compose.material.icons.rounded.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.amikom.amikomone.R

sealed class NavigationModel(
    val route: String,
    val selectedIcon: ImageVector? = null,
    val unselectedIcon: ImageVector? = null,
    val title: Int,
    val appBarTitle: Int? = null
) {
    data object Home : NavigationModel(
        route = "home",
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        title = R.string.beranda,
        appBarTitle = null,
    )

    data object Schedule : NavigationModel(
        route = "schedule",
        selectedIcon = Icons.Filled.CalendarMonth,
        unselectedIcon = Icons.Outlined.CalendarMonth,
        title = R.string.jadwal,
        appBarTitle = R.string.jadwal_kuliah
    )

    data object Empty : NavigationModel(
        route = "empty",
        selectedIcon = null,
        title = 0
    )

    data object History : NavigationModel(
        route = "history",
        selectedIcon = Icons.AutoMirrored.Filled.Article,
        unselectedIcon = Icons.AutoMirrored.Outlined.Article,
        title = R.string.riwayat,
        appBarTitle = R.string.riwayat_presensi
    )

    data object Profile : NavigationModel(
        route = "profile",
        selectedIcon = Icons.Filled.Person,
        unselectedIcon = Icons.Outlined.Person,
        title = R.string.profil
    )
}