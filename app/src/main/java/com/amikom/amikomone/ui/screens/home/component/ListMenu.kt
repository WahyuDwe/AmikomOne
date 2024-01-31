package com.amikom.amikomone.ui.screens.home.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.amikom.amikomone.ui.screens.home.navigation.MenuModel

@OptIn(ExperimentalMaterial3Api::class)
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
                OutlinedCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp, bottom = 12.dp),
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(0.dp, Color.Transparent),
                    onClick = { /*TODO*/ },
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Image(
                            painter = painterResource(id = item.icon),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(top = 8.dp, bottom = 8.dp)
                                .size(50.dp)
                        )
                        Text(
                            modifier = Modifier.padding(bottom = 8.dp),
                            text = item.title,
                            style = TextStyle(
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center,
                            ),
                        )

                    }
                }
            }
        }
    }
}