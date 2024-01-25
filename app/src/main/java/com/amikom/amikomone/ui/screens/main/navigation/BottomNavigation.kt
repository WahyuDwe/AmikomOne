package com.amikom.amikomone.ui.screens.main.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf(
        NavigationModel.Home,
        NavigationModel.Schedule,
        NavigationModel.Empty,
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
                enabled = item != NavigationModel.Empty,
                label = {
                    if (item == NavigationModel.Empty) {
                        Box(
                            modifier = modifier.padding(bottom = 8.dp)
                        ) {
//                            Text(
//                                text = "Absen",
//                                style = TextStyle(fontSize = 18.sp)
//                            )
                        }
                    } else {
                        Text(item.title)
                    }
                },
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