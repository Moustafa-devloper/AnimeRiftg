# Anime Rift

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-1.9.24-7F52FF?logo=kotlin&logoColor=white" alt="Kotlin" />
  <img src="https://img.shields.io/badge/Compose-UI-3D7AF0?logo=jetpackcompose&logoColor=white" alt="Jetpack Compose" />
  <img src="https://img.shields.io/badge/Android-Media3-34A853?logo=android&logoColor=white" alt="Media3" />
  <img src="https://img.shields.io/badge/Language-Arabic%20%2B%20English-FF8A00" alt="Arabic + English" />
  <img src="https://img.shields.io/badge/Status-MVP%20Foundation-orange" alt="Status" />
</p>

<p align="center">
  <strong>Open-source Android anime streaming and offline library app</strong>
</p>

Anime Rift is a modern Android anime app built with Kotlin, Jetpack Compose, Material 3, Room, Retrofit, OkHttp, Coroutines, Flow, and Media3 ExoPlayer. It is designed as a clean, maintainable foundation for anime discovery, playback, favorites, local library management, and future real metadata/source integrations.

This repository currently contains a working MVP foundation for the app experience, with a cinematic dark UI, mock anime data, detail screens, favorites, library flow, settings, and ExoPlayer-based playback integration.

## Why Anime Rift?

- Clean, modern dark anime UI with purple and blue cinematic styling
- Flexible architecture for multiple content sources
- Room-powered local library and user data persistence
- Modular structure for future source integrations and downloads
- Built with performance in mind for a wide range of Android devices
- Designed with Arabic RTL and English LTR compatibility in mind

## Screens and Features

### Included in the current MVP
- Home screen with featured and recently updated anime
- Anime detail screen with descriptions, ratings, genres, and episodes
- Favorites and Continue Watching style library screens
- Settings screen with common playback and UI preferences
- Media3 ExoPlayer-ready player screen
- Mock anime repository and mock source provider
- Room database scaffolding for favorites, history, downloads, and positions
- Clean package architecture for future expansion

### Planned and intentionally deferred
- Full Arabic localization and RTL testing
- Real metadata provider integration
- Authorized source integration with credential handling
- Subtitle import/rendering system
- Offline downloads and playback management
- Torrent support for legally distributable content only
- Translation subsystem with secure provider configuration
- Production-grade CI/CD and signing flows

## Technology Stack

- Kotlin
- Jetpack Compose
- Material 3
- Android Media3 ExoPlayer
- Room Database
- Kotlin Coroutines + Flow
- Retrofit + OkHttp
- MVVM + Repository architecture
- Gradle Kotlin DSL

## Architecture

The app is organized around a modular, maintainable structure:

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

## Project Structure

```text
AnimeRiftg/
├─ app/
│  ├─ build.gradle.kts
│  ├─ proguard-rules.pro
│  └─ src/
├─ build.gradle.kts
├─ settings.gradle.kts
├─ gradle.properties
├─ README.md
├─ LICENSE
└─ .gitignore
```

## Prerequisites

- Android Studio Ladybug or newer recommended
- JDK 17
- Android SDK 34
- Gradle 8.7+

## Quick Start

### 1) Clone the project

```bash
git clone https://github.com/Moustafa-devloper/AnimeRiftg.git
cd AnimeRiftg
```

### 2) Open in Android Studio

Open the repository in Android Studio and let Gradle sync the project.

### 3) Run the app

Choose a connected device or emulator, then run:

```bash
./gradlew assembleDebug
```

Or build from Android Studio directly.

## Build Commands

### Debug build

```bash
./gradlew assembleDebug
```

### Release build

```bash
./gradlew assembleRelease
```

### Run unit tests

```bash
./gradlew test
```

### Run instrumentation tests

```bash
./gradlew connectedAndroidTest
```

### Clean project

```bash
./gradlew clean build
```

## Local Configuration and Security

This project does not include committed API keys, secrets, or private credentials.

Any real source or metadata provider integration should keep credentials in local configuration files or secure device storage instead of checked-in code.

## Content and Source Policy

- Official and authorized APIs should be preferred.
- No unauthorized copyrighted content is bundled in the repository.
- Torrent support is kept modular and optional.
- The source framework is designed to allow legal, configurable integrations only.

## MVP Status

This repository is currently in a working MVP foundation stage with a functional app shell and mock-ready architecture. It is not yet a complete production-ready anime platform, but the codebase is structured for rapid extension into a full product.

## Roadmap

### Near-term goals
- Real metadata provider integration
- Authoritative source adapters
- Player controls and quality switching
- App settings persistence
- Arabic + English localization
- Database and repository tests

### Medium-term goals
- Download manager and offline playback
- Subtitle import and rendering
- Background download lifecycle handling
- Local library management refinement

### Long-term goals
- Optional authorized torrent support
- Translation provider adapters
- Advanced analytics and monitoring
- Deployment-ready quality and release flows

## Contributing

Contributions are welcome. Please keep changes focused, testable, and aligned with the project’s maintainable architecture.

Key expectations:
- no placeholders in completed screens
- no fake success messages
- no hardcoded secrets
- no unnecessary permissions
- honest status reporting on partial implementations

## License

This project is licensed under the Boost Software License 1.0. See the LICENSE file for more information.

## Acknowledgments

This project is built with Android Jetpack, Compose, Room, Media3, and modern Kotlin tooling, and is designed as an open-source foundation for anime platforms that respect legal and technical quality standards.
