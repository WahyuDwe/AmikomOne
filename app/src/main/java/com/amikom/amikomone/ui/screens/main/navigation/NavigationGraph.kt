package com.amikom.amikomone.ui.screens.main.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
        composable(
            NavigationModel.Home.route,
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(500)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(500)
                )
            },
        ) {
            HomeScreen()
        }
        composable(
            NavigationModel.Schedule.route,
            enterTransition = {
                when (initialState.destination.route) {
                    NavigationModel.Home.route -> slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left,
                        animationSpec = tween(500)
                    )

                    else -> slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right,
                        animationSpec = tween(500)
                    )
                }
            },
            exitTransition = {
                when (targetState.destination.route) {
                    NavigationModel.Home.route -> slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right,
                        animationSpec = tween(500)
                    )

                    else -> slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left,
                        animationSpec = tween(500)
                    )
                }
            },
        ) {
            ScheduleScreen()
        }
        composable(
            NavigationModel.History.route,
            enterTransition = {
                when (initialState.destination.route) {
                    NavigationModel.Profile.route -> slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right,
                        animationSpec = tween(500)
                    )

                    else -> slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left,
                        animationSpec = tween(500)
                    )
                }
            },
            exitTransition = {
                when (targetState.destination.route) {
                    NavigationModel.Profile.route -> slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left,
                        animationSpec = tween(500)
                    )

                    else -> slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right,
                        animationSpec = tween(500)
                    )
                }
            }
        ) {
            HistoryScreen()
        }
        composable(
            NavigationModel.Profile.route,
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(500)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(500)
                )
            }
        ) {
            ProfileScreen()
        }
    }
}