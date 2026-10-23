package com.animerift.app.settings

data class AppSettings(
    val language: String = "English",
    val subtitlesEnabled: Boolean = true,
    val subtitleLanguage: String = "English",
    val playbackSpeed: Float = 1.0f,
    val autoplayEnabled: Boolean = true,
    val rememberPositionEnabled: Boolean = true,
    val storageLimitMb: Int = 2048,
    val subtitlesSize: Float = 1.0f
)
