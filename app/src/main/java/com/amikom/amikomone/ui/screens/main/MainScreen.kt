package com.amikom.amikomone.ui.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.QrCode
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.amikom.amikomone.ui.screens.home.HomeScreen
import com.amikom.amikomone.ui.screens.main.navigation.BottomNavigation
import com.amikom.amikomone.ui.screens.main.navigation.NavigationGraph

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
) {
    val navController = rememberNavController()
    Scaffold(
        modifier = modifier,
        bottomBar = { BottomNavigation(navController) },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    imageVector = Icons.Rounded.QrCode,
                    modifier = Modifier.size(32.dp),
                    contentDescription = null
                )
            }
        },

        ) {
        NavigationGraph(
            modifier = Modifier.padding(it),
            navController = navController
        )
    }
}