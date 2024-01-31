package com.amikom.amikomone.ui.component

import androidx.annotation.StringRes
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CenterAppBar(
    @StringRes titleRes: Int,
) {
    CenterAlignedTopAppBar(title = {
        Text(
            stringResource(id = titleRes),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    })
}