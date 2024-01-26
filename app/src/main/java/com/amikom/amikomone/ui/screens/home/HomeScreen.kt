package com.amikom.amikomone.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.amikom.amikomone.ui.screens.home.component.ListMenu
import com.amikom.amikomone.ui.screens.home.component.ProfileCard

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
    ) {
        ProfileCard()
        Spacer(modifier = Modifier.height(16.dp))
        ListMenu()
    }
}