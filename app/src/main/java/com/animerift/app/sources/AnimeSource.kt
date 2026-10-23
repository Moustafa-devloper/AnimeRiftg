package com.animerift.app.sources

import com.animerift.app.domain.Anime
import com.animerift.app.domain.AnimeFilters
import com.animerift.app.domain.Episode

enum class SourceStatus {
    ONLINE,
    OFFLINE,
    DEPRECATED,
    ERROR
}

data class SourceConfig(
    val name: String,
    val version: String,
    val status: SourceStatus,
    val enabled: Boolean = true,
    val baseUrl: String = "",
    val apiKey: String? = null
)

interface MetadataProvider {
    suspend fun fetchAnimeMetadata(id: String): Anime?
    suspend fun searchAnime(query: String, filters: AnimeFilters = AnimeFilters()): List<Anime>
}

interface AnimeSource : MetadataProvider {
    val config: SourceConfig
    suspend fun fetchEpisodeList(animeId: String): List<Episode>
    suspend fun fetchPlaybackFormats(animeId: String, episodeId: String): List<String>
    suspend fun importConfig(rawConfig: String)
    suspend fun exportConfig(): String
}

interface TorrentProvider {
    val isSupported: Boolean
    suspend fun loadMagnet(magnet: String): String
    suspend fun loadTorrentFile(path: String): String
}

interface DownloadManager {
    fun getDownloadQueue(): List<String>
    fun markAsDownloading(id: String)
    fun markAsComplete(id: String)
}

class MockAnimeSource : AnimeSource {
    override val config = SourceConfig(
        name = "Mock anime source",
        version = "1.0.0",
        status = SourceStatus.ONLINE,
        enabled = true,
        baseUrl = "https://mock.animerift.app/api",
        apiKey = null
    )

    override suspend fun fetchAnimeMetadata(id: String): Anime? = null

    override suspend fun searchAnime(query: String, filters: AnimeFilters): List<Anime> = emptyList()

    override suspend fun fetchEpisodeList(animeId: String): List<Episode> = emptyList()

    override suspend fun fetchPlaybackFormats(animeId: String, episodeId: String): List<String> = listOf("720p", "1080p")

    override suspend fun importConfig(rawConfig: String) = Unit

    override suspend fun exportConfig(): String = "{\"source\":\"mock\"}"
}

class MockTorrentProvider : TorrentProvider {
    override val isSupported: Boolean = false

    override suspend fun loadMagnet(magnet: String): String = "Mock torrent metadata loaded for $magnet"

    override suspend fun loadTorrentFile(path: String): String = "Mock torrent file loaded from $path"
}
