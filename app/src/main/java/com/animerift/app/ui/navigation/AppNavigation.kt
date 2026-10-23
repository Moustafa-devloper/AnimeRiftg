package com.animerift.app.ui.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.animerift.app.data.mock.MockAnimeRepository
import com.animerift.app.ui.screens.DetailScreen
import com.animerift.app.ui.screens.HomeScreen
import com.animerift.app.ui.screens.LibraryScreen
import com.animerift.app.ui.screens.PlayerScreen
import com.animerift.app.ui.screens.SettingsScreen

@Composable
fun AnimeRiftApp() {
    val navController = rememberNavController()
    val repository = remember { MockAnimeRepository() }

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(
                repository = repository,
                onAnimeClick = { animeId -> navController.navigate("detail/$animeId") },
                onLibraryClick = { navController.navigate("library") },
                onSettingsClick = { navController.navigate("settings") }
            )
        }
        composable("detail/{animeId}") { backStackEntry ->
            val animeId = backStackEntry.arguments?.getString("animeId") ?: ""
            val anime = repository.getAnimeById(animeId)
            if (anime != null) {
                DetailScreen(
                    anime = anime,
                    onBack = { navController.popBackStack() },
                    onPlayEpisode = { episode -> navController.navigate("player/${anime.id}") },
                    onToggleFavorite = { repository.toggleFavorite(anime.id) }
                )
            } else {
                Box(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Anime not found", color = MaterialTheme.colorScheme.onBackground)
                    }
                }
            }
        }
        composable("library") {
            LibraryScreen(
                repository = repository,
                onBack = { navController.popBackStack() },
                onAnimeClick = { animeId -> navController.navigate("detail/$animeId") }
            )
        }
        composable("settings") {
            SettingsScreen(
                onBack = { navController.popBackStack() }
            )
        }
        composable("player/{animeId}") { backStackEntry ->
            val animeId = backStackEntry.arguments?.getString("animeId") ?: ""
            val anime = repository.getAnimeById(animeId)
            if (anime != null) {
                PlayerScreen(
                    anime = anime,
                    onBack = { navController.popBackStack() }
                )
            } else {
                Box(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Player unavailable", color = MaterialTheme.colorScheme.onBackground)
                    }
                }
            }
        }
    }
}
