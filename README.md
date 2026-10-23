# Anime Rift

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-1.9.24-7F52FF?logo=kotlin&logoColor=white" alt="Kotlin" />
  <img src="https://img.shields.io/badge/Compose-UI-3D7AF0?logo=jetpackcompose&logoColor=white" alt="Jetpack Compose" />
  <img src="https://img.shields.io/badge/Android-Media3-34A853?logo=android&logoColor=white" alt="Media3" />
  <img src="https://img.shields.io/badge/Room-Database-8B5CF6?logo=android&logoColor=white" alt="Room" />
  <img src="https://img.shields.io/badge/Status-MVP%20Foundation-orange" alt="Status" />
</p>

<p align="center">
  <strong>Android anime streaming and offline library app</strong>
</p>

Anime Rift is an open-source Android application for discovering, browsing, and watching anime with a modern streaming-library experience. Built with Kotlin, Jetpack Compose, Material 3, Room, and Media3 ExoPlayer, it is designed as a clean and extensible foundation for anime catalogs, local library management, playback, and future authorized source integrations.

This repository currently contains a working MVP foundation with a dark cinematic UI, mock anime data, detail pages, favorites and library views, settings, navigation, and an ExoPlayer-ready player screen.

## Highlights

- Cinematic dark theme with purple and blue accents
- Home feed with featured and recently updated titles
- Search-friendly anime browsing structure
- Detail pages with metadata and episodes
- Favorites and Continue Watching-style library views
- Settings screen for playback and app behavior
- Room-based persistence scaffolding
- Source-provider architecture for future metadata and streaming integrations
- Media3 ExoPlayer-ready playback layer
- Arabic RTL and English LTR-friendly structure

## Current Status

<p align="center">
  <img src="https://img.shields.io/badge/Project%20State-MVP%20Foundation-FF8A00" alt="MVP Foundation" />
  <img src="https://img.shields.io/badge/Production%20Ready-No-red" alt="Not production ready" />
</p>

Anime Rift is currently in an MVP foundation stage. The app shell and core app flow are implemented, but real source integrations, subtitles, downloads, localization, and full production features are still planned work.

## Tech Stack

- Kotlin
- Jetpack Compose
- Material 3
- AndroidX
- Media3 ExoPlayer
- Room database
- Coroutines + Flow
- Retrofit + OkHttp
- MVVM + Repository pattern
- Gradle Kotlin DSL

## App Architecture

```text
app/
├─ src/
│  ├─ main/
│  │  ├─ java/com/animerift/app/
│  │  │  ├─ data/
│  │  │  ├─ database/
│  │  │  ├─ domain/
│  │  │  ├─ downloads/
│  │  │  ├─ player/
│  │  │  ├─ settings/
│  │  │  ├─ sources/
│  │  │  ├─ torrent/
│  │  │  └─ ui/
│  │  │     ├─ navigation/
│  │  │     ├─ screens/
│  │  │     └─ theme/
```

The application intentionally keeps a clean separation between UI, domain logic, repositories, data persistence, and provider interfaces so the project can evolve without major rewrites.

## Features in the Current MVP

### User-facing app flow
- Home screen with featured anime and recently updated entries
- Anime detail view with genres, rating, description, and episode list
- Favorites and library browsing
- Playback screen using Media3 ExoPlayer
- Settings panel with common user options

### Data and architecture
- Mock anime repository for a working app experience
- Source-provider interfaces for metadata and playback integration
- Room database scaffolding for favorites, watch history, downloads, and positions
- Future-friendly support for authorized external source providers

## Planned Features

### Near-term
- Real metadata and source integrations
- Improved app settings persistence
- Arabic localization and RTL testing
- Subtitle system foundation and file support

### Medium-term
- Download manager and offline playback
- Better source configuration import/export
- Player quality selection and resume management

### Long-term
- Authorized torrent support module
- Translation provider adapters
- Full offline library experience with robust storage handling

## Screenshots

> Add screenshots here when available for a more polished GitHub project page.

```text
[Home Screen]  [Anime Detail]  [Player Screen]
```

## Requirements

- Android Studio Ladybug or newer recommended
- JDK 17
- Android SDK 34
- Gradle 8.7+

## Quick Start

### Clone the repo

```bash
git clone https://github.com/Moustafa-devloper/AnimeRiftg.git
cd AnimeRiftg
```

### Open in Android Studio

Open the project in Android Studio and sync Gradle.

### Build the app

```bash
./gradlew assembleDebug
```

### Run the app

Choose a connected device or emulator and launch the project from Android Studio.

## Build Commands

```bash
./gradlew assembleDebug
./gradlew assembleRelease
./gradlew test
./gradlew connectedAndroidTest
./gradlew clean build
```

## Local Configuration and Security

This project does not commit API credentials or secrets. Any real metadata or source provider should store credentials in local app configuration or secure storage instead of checked-in source code.

## Source and Media Policy

- Prioritize authorized APIs and legal content sources
- Do not bundle unauthorized media or copyrighted content
- Keep torrent support optional and modular
- Implement provider interfaces in a way that can be disabled safely

## Contributing

Contributions are welcome as long as they stay focused, secure, and aligned with the project’s architecture.

Please avoid:
- hardcoded secrets
- fake success flows
- placeholder screens in final work
- unnecessary dependencies
- unauthorized content or media bundling

## License

This project is licensed under the Boost Software License 1.0. See the LICENSE file for details.

## Final Note

Anime Rift is designed as a modern, clean, and extensible Android anime app foundation. The current repository reflects a real MVP implementation with a solid base for future source integrations, player improvements, offline downloads, and multilingual support.
