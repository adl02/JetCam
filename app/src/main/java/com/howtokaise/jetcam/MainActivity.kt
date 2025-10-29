package com.howtokaise.jetcam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.howtokaise.jetcam.ui.theme.JetCamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetCamTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    permission()
                }
            }
        }
    }
}
