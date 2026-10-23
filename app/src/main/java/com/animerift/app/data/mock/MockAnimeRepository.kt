package com.animerift.app.data.mock

import com.animerift.app.domain.Anime
import com.animerift.app.domain.AnimeFilters
import com.animerift.app.domain.AnimeRepository
import com.animerift.app.domain.Episode

class MockAnimeRepository : AnimeRepository {
    private val animeList = listOf(
        Anime(
            id = "akira-1",
            title = "Akira",
            englishTitle = "Akira",
            description = "A cyberpunk classic about a Tokyo psychic and the aftermath of a city-devouring catastrophe.",
            genres = listOf("Sci-Fi", "Action", "Dystopian"),
            status = "Finished",
            year = 1988,
            rating = 4.8f,
            posterUrl = "https://images.unsplash.com/photo-1517604931442-7e0c8ed2963c?auto=format&fit=crop&w=900&q=80",
            bannerUrl = "https://images.unsplash.com/photo-1518770660439-4636190af475?auto=format&fit=crop&w=1200&q=80",
            sourceName = "Mock Source",
            episodes = listOf(
                Episode("ep-1","The Future Is Here",1,24,"https://images.unsplash.com/photo-1518770660439-4636190af475?auto=format&fit=crop&w=300&q=80","https://storage.googleapis.com/exoplayer-test-media-1/mp4/BigBuckBunny_320x180.mp4"),
                Episode("ep-2","The Power of the Mind",2,24,"https://images.unsplash.com/photo-1517604931442-7e0c8ed2963c?auto=format&fit=crop&w=300&q=80","https://storage.googleapis.com/exoplayer-test-media-1/mp4/BigBuckBunny_320x180.mp4")
            )
        ),
        Anime(
            id = "solo-leveling-1",
            title = "Solo Leveling",
            englishTitle = "Solo Leveling",
            description = "A hunter awakens with hidden power and enters a terrifying dungeon system that reshapes humanity.",
            genres = listOf("Action", "Fantasy", "Adventure"),
            status = "Ongoing",
            year = 2024,
            rating = 4.9f,
            posterUrl = "https://images.unsplash.com/photo-1542204165-65bf26472b9b?auto=format&fit=crop&w=900&q=80",
            bannerUrl = "https://images.unsplash.com/photo-1493246507139-91e8fad9978e?auto=format&fit=crop&w=1200&q=80",
            sourceName = "Mock Source",
            episodes = listOf(
                Episode("ep-1","Awakening",1,24,"https://images.unsplash.com/photo-1542204165-65bf26472b9b?auto=format&fit=crop&w=300&q=80","https://storage.googleapis.com/exoplayer-test-media-1/mp4/BigBuckBunny_320x180.mp4"),
                Episode("ep-2","The Gate",2,24,"https://images.unsplash.com/photo-1493246507139-91e8fad9978e?auto=format&fit=crop&w=300&q=80","https://storage.googleapis.com/exoplayer-test-media-1/mp4/BigBuckBunny_320x180.mp4")
            )
        ),
        Anime(
            id = "spirited-away-1",
            title = "Spirited Away",
            englishTitle = "Spirited Away",
            description = "A young girl is swept into a magical spirit world where she must find a way home.",
            genres = listOf("Fantasy", "Adventure", "Slice of Life"),
            status = "Finished",
            year = 2001,
            rating = 4.7f,
            posterUrl = "https://images.unsplash.com/photo-1517849845537-4d257902454a?auto=format&fit=crop&w=900&q=80",
            bannerUrl = "https://images.unsplash.com/photo-1504384308090-c894fdcc538d?auto=format&fit=crop&w=1200&q=80",
            sourceName = "Mock Source",
            episodes = listOf(
                Episode("ep-1","The Tunnel",1,24,"https://images.unsplash.com/photo-1517849845537-4d257902454a?auto=format&fit=crop&w=300&q=80","https://storage.googleapis.com/exoplayer-test-media-1/mp4/BigBuckBunny_320x180.mp4"),
                Episode("ep-2","The Bathhouse",2,24,"https://images.unsplash.com/photo-1504384308090-c894fdcc538d?auto=format&fit=crop&w=300&q=80","https://storage.googleapis.com/exoplayer-test-media-1/mp4/BigBuckBunny_320x180.mp4")
            )
        ),
        Anime(
            id = "attack-on-titan-1",
            title = "Attack on Titan",
            englishTitle = "Attack on Titan",
            description = "Humanity's last stand against colossal monsters and the secrets hidden behind the walls.",
            genres = listOf("Action", "Drama", "Thriller"),
            status = "Completed",
            year = 2013,
            rating = 4.9f,
            posterUrl = "https://images.unsplash.com/photo-1500530855697-b586d89ba3ee?auto=format&fit=crop&w=900&q=80",
            bannerUrl = "https://images.unsplash.com/photo-1531297484001-80022131f5a1?auto=format&fit=crop&w=1200&q=80",
            sourceName = "Mock Source",
            episodes = listOf(
                Episode("ep-1","To You, in 2000 Years",1,24,"https://images.unsplash.com/photo-1500530855697-b586d89ba3ee?auto=format&fit=crop&w=300&q=80","https://storage.googleapis.com/exoplayer-test-media-1/mp4/BigBuckBunny_320x180.mp4"),
                Episode("ep-2","That Day",2,24,"https://images.unsplash.com/photo-1531297484001-80022131f5a1?auto=format&fit=crop&w=300&q=80","https://storage.googleapis.com/exoplayer-test-media-1/mp4/BigBuckBunny_320x180.mp4")
            )
        )
    )

    private val favorites = linkedSetOf<String>()

    override fun getFeaturedAnime(): List<Anime> = animeList.take(3)

    override fun getRecentlyUpdated(): List<Anime> = animeList.takeLast(2)

    override fun searchAnime(query: String, filters: AnimeFilters): List<Anime> {
        val normalized = query.trim()
        return animeList.filter { anime ->
            val matchesQuery = normalized.isEmpty() || anime.title.contains(normalized, ignoreCase = true)
            val matchesGenre = filters.genre == null || anime.genres.any { it.contains(filters.genre!!, ignoreCase = true) }
            val matchesYear = filters.year == null || anime.year == filters.year
            matchesQuery && matchesGenre && matchesYear
        }
    }

    override fun getAnimeById(id: String): Anime? = animeList.find { it.id == id }

    override fun getFavorites(): List<Anime> = animeList.filter { it.id in favorites }

    override fun getContinueWatching(): List<Anime> = animeList.take(2)

    override fun toggleFavorite(id: String) {
        if (favorites.contains(id)) {
            favorites.remove(id)
        } else {
            favorites.add(id)
        }
    }
}
