package com.amikom.amikomone.ui.screens.schedule

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import com.amikom.amikomone.R
import com.amikom.amikomone.ui.component.CenterAppBar

@Composable
fun ScheduleScreen() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CenterAppBar(titleRes = R.string.jadwal_kuliah)
        Text(text = "Schedule")
    }

}