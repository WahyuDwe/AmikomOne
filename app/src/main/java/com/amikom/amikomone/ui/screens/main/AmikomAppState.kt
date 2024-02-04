package com.amikom.amikomone.ui.screens.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.amikom.amikomone.ui.screens.main.navigation.NavigationModel
import com.amikom.amikomone.ui.screens.main.navigation.TopLevelDestination

@Composable
fun rememberAmikomAppState(
    navController: NavHostController = rememberNavController()
): AmikomAppState {
    return remember(
        navController
    ) {
        AmikomAppState(
            navController = navController
        )
    }

}

@Stable
class AmikomAppState(
    val navController: NavHostController
) {
    val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    val currentTopLeverDestination: NavigationModel?
        @Composable get() = when (currentDestination?.route) {
            NavigationModel.Home.route -> NavigationModel.Home
            NavigationModel.Schedule.route -> NavigationModel.Schedule
            NavigationModel.History.route -> NavigationModel.History
            NavigationModel.Profile.route -> NavigationModel.Profile
            else -> null
        }
}