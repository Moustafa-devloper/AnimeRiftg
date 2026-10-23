package com.animerift.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.animerift.app.ui.navigation.AnimeRiftApp
import com.animerift.app.ui.theme.AnimeRiftTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimeRiftTheme {
                AnimeRiftApp()
            }
        }
    }
}
