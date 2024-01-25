package com.amikom.amikomone.ui.screens.main.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun BottomNavigation(
    navController: NavHostController
) {
    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf(
        NavigationModel.Home,
        NavigationModel.Schedule,
        NavigationModel.History,
        NavigationModel.Profile
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    item.selectedIcon?.let {
                        Icon(
                            imageVector = it,
                            contentDescription = item.title
                        )
                    }
                },
                label = { Text(item.title) },
                selected = currentRoute?.hierarchy?.any { it.route == item.route } == true,
                onClick = {
                    selectedItem = index
                    navController.navigate(item.route)
                }
            )
        }
    }
}