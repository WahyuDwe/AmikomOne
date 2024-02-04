package com.amikom.amikomone.ui.screens.main.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Article
import androidx.compose.material.icons.automirrored.outlined.Article
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.amikom.amikomone.R

enum class TopLevelDestination(
    val selectedIcon: ImageVector? = null,
    val unselectedIcon: ImageVector? = null,
    val title: Int,
    val appBarTitle: Int? = null
) {
    HOME(
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        title = R.string.beranda,
        appBarTitle = null,
    ),

    SCHEDULE(
        selectedIcon = Icons.Filled.CalendarMonth,
        unselectedIcon = Icons.Outlined.CalendarMonth,
        title = R.string.jadwal,
        appBarTitle = R.string.jadwal_kuliah
    ),

    EMPTY(
        selectedIcon = null,
        title = 0
    ),

    HISTORY(
        selectedIcon = Icons.AutoMirrored.Filled.Article,
        unselectedIcon = Icons.AutoMirrored.Outlined.Article,
        title = R.string.riwayat,
        appBarTitle = R.string.riwayat_presensi
    ),

    PROFILE(
        selectedIcon = Icons.Filled.Person,
        unselectedIcon = Icons.Outlined.Person,
        title = R.string.profil
    )
}