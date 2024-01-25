package com.amikom.amikomone.ui.screens.main.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.amikom.amikomone.ui.screens.history.HistoryScreen
import com.amikom.amikomone.ui.screens.home.HomeScreen
import com.amikom.amikomone.ui.screens.profile.ProfileScreen
import com.amikom.amikomone.ui.screens.schedule.ScheduleScreen

@Composable
fun NavigationGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NavigationModel.Home.route
    ) {
        composable(NavigationModel.Home.route) {
            HomeScreen()
        }
        composable(NavigationModel.Schedule.route) {
            ScheduleScreen()
        }
        composable(NavigationModel.History.route) {
            HistoryScreen()
        }
        composable(NavigationModel.Profile.route) {
            ProfileScreen()
        }
    }
}