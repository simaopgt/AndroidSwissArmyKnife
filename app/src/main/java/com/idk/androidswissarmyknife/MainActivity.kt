package com.idk.androidswissarmyknife

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.idk.androidswissarmyknife.ui.theme.AndroidSwissArmyKnifeTheme
import com.idk.feature_home.presentation.ui.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidSwissArmyKnifeTheme {
                HomeScreen()
            }
        }
    }
}
