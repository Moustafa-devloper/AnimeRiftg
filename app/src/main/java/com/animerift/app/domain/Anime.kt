package com.animerift.app.domain

data class Anime(
    val id: String,
    val title: String,
    val englishTitle: String? = null,
    val description: String,
    val genres: List<String>,
    val status: String,
    val year: Int,
    val rating: Float,
    val posterUrl: String,
    val bannerUrl: String,
    val sourceName: String,
    val episodes: List<Episode>
)

data class Episode(
    val id: String,
    val title: String,
    val number: Int,
    val runtimeMinutes: Int,
    val thumbnailUrl: String,
    val videoUrl: String,
    val subtitleUrl: String? = null
)

data class AnimeFilters(
    val genre: String? = null,
    val year: Int? = null,
    val popularity: String? = "Popular"
)

interface AnimeRepository {
    fun getFeaturedAnime(): List<Anime>
    fun getRecentlyUpdated(): List<Anime>
    fun searchAnime(query: String = "", filters: AnimeFilters = AnimeFilters()): List<Anime>
    fun getAnimeById(id: String): Anime?
    fun getFavorites(): List<Anime>
    fun getContinueWatching(): List<Anime>
    fun toggleFavorite(id: String)
}
