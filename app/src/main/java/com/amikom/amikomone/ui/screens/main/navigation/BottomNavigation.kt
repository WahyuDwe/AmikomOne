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
    val currentRoute = navBackStackEntry?.destination?.route

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    item.selectedIcon?.let { icon ->
                        Icon(
                            imageVector = if (selectedItem == index) icon
                            else item.unselectedIcon ?: icon,
                            contentDescription = item.title
                        )
                    }
                },
                label = { Text(item.title) },
                selected = currentRoute?.contains(item.route) == true,
                onClick = {
                    selectedItem = index
                    // make sure we do not navigate twice to the same screen
                    if (currentRoute?.contains(item.route) == true) return@NavigationBarItem
                    navController.navigate(item.route)
                }
            )
        }
    }
}