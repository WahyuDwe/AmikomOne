package com.amikom.amikomone.ui.screens.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.amikom.amikomone.R

@Composable
fun ProfileCard(
    modifier: Modifier = Modifier
) {
    OutlinedCard(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
    ) {
        Column(
            modifier = modifier.padding(16.dp),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    modifier = modifier
                        .clip(CircleShape)
                        .size(64.dp),
                    painter = painterResource(id = R.drawable.person),
                    contentDescription = "profile",
                    contentScale = ContentScale.Crop,
                )
                Column(
                    modifier = modifier
                        .padding(start = 16.dp),
                ) {
                    Text(
                        text = "Sophia Amanda",
                        style = TextStyle(
                            fontSize = 20.sp,
                        ),
                    )
                    Spacer(modifier = modifier.height(4.dp))
                    Text(
                        text = "20.11.3369",
                        style = TextStyle(
                            fontSize = 14.sp,
                        ),
                    )
                }
            }
        }
    }
}