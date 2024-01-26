package com.amikom.amikomone.ui.screens.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.amikom.amikomone.ui.screens.home.navigation.MenuModel

@Composable
fun ListMenu() {
    val menu = listOf(
        MenuModel.Transcript,
        MenuModel.Schedule,
        MenuModel.Support,
        MenuModel.StudentCard,
        MenuModel.Library,
        MenuModel.Payment,
    )

    LazyVerticalGrid(columns = GridCells.Fixed(3)) {
        menu.forEachIndexed { _, item ->
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { /*TODO : Move to menu screen*/ },
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                    Image(
                        painter = painterResource(id = item.icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = item.title,
                        style = TextStyle(
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                        ),
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}