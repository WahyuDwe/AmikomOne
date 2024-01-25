package com.amikom.amikomone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.amikom.amikomone.ui.screens.main.MainScreen
import com.amikom.amikomone.ui.theme.AmikomOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AmikomOneTheme {
                MainScreen()
            }
        }
    }
}