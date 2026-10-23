# Anime Rift

Anime Rift is an open-source Android anime application built with Kotlin, Jetpack Compose, Material 3, Room, Retrofit, OkHttp, Coroutines, Flow, and Media3 ExoPlayer. The project aims to provide a polished anime streaming and offline library experience with a clean MVVM + repository architecture, mock-ready source architecture, and a maintainable foundation for future real metadata and media integrations.

This repository currently contains a functional MVP foundation for the app experience, including theme, navigation, mock anime data, detailed screens, favorites, local library views, and player integration using ExoPlayer.

## Features

### Implemented in the MVP
- Dark cinematic UI with purple/blue accents
- Home screen with featured anime and recently updated titles
- Anime detail screen with poster, description, genres, rating, and episode list
- Favorite and library flows
- Continue Watching style views
- Settings screen for common playback and UI options
- Media3 ExoPlayer-ready player screen
- Source-provider contract and mock source implementation
- Mock torrent provider interface
- Room database scaffolding for favorites, watch history, downloads, and playback positions
- Multi-package app structure for clean project organization
- Gradle Kotlin DSL project setup

### Planned / intentionally deferred
- Full Arabic RTL localization
- Real metadata provider integration
- Authentic source integrations with configuration and API credential handling
- Subtitle import and rendering system
- Download manager and offline playback implementation
- Torrent support for authorized content only
- Advanced translation architecture with tested providers
- Production analytics and crash reporting
- Large-scale CI/CD and signing configuration

## Tech Stack
- Kotlin
- Jetpack Compose
- Material 3
- Android Media3 ExoPlayer
- Room database
- Kotlin Coroutines + Flow
- Retrofit + OkHttp
- MVVM + Repository architecture
- Gradle Kotlin DSL

## Project Structure

```
app/
  src/main/java/com/animerift/app/
    data/
    database/
    domain/
    downloads/
    player/
    settings/
    sources/
    torrent/
    ui/
      navigation/
      screens/
      theme/
```

## Build Requirements
- Android Studio Ladybug or newer recommended
- JDK 17
- Android SDK 34
- Gradle 8.7+

## Setup

1. Clone the repository:

```bash
git clone https://github.com/Moustafa-devloper/AnimeRiftg.git
cd AnimeRiftg
```

2. Open the project in Android Studio.

3. Let Gradle sync and install the required Android SDK components.

4. Ensure the Android SDK path is configured correctly in Android Studio.

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

### Clean build
```bash
./gradlew clean build
```

## Local Configuration and Secrets

This project intentionally avoids committing API keys, source credentials, or private tokens. Any real metadata provider or source integration should store credentials in local app configuration or user-managed secure storage rather than in committed source code.

## Source and Media Policy

- The app architecture supports authorized sources and official APIs.
- No unauthorized streaming sites or copyrighted media are bundled in this project.
- Torrent and source integrations are designed to be optional and modular.
- Any real deployment should only use legally authorized content and properly licensed data sources.

## Application Architecture

The project follows a modularized MVVM + Repository style:

- UI layer: Compose screens and navigation
- Domain layer: business models and repository contracts
- Data layer: mock repository and future API-backed implementations
- Database layer: Room entities and DAO access
- Sources layer: metadata and playback source interfaces
- Player layer: ExoPlayer-ready architecture
- Settings layer: preferences and playback-related configuration
- Torrent layer: optional, modular torrent integration

## Running the App

After opening in Android Studio:

1. Select the `app` module
2. Choose a connected Android device or emulator
3. Click Run

The app launches with mock data so the main user flow is functional without a live source configuration.

## Design Notes

The visual direction is intentionally dark and cinematic with purple/blue accents, optimized for anime browsing and media discovery. The UI is designed to be extensible for RTL and LTR locales as the localization work advances.

## Roadmap

### Near-term
- Real source-provider implementation
- App settings persistence
- Subtitle system design and file support
- Download manager and offline library
- Arabic localization + RTL testing

### Medium-term
- Real metadata provider integration
- Source configuration import/export
- More robust player controls and quality selection
- Background download lifecycle management

### Long-term
- Optional authorized torrent support
- Translation subsystem with tested provider adapters
- Expanded tests for repositories, database logic, and UI flows

## License

This project is licensed under the Boost Software License 1.0. See the LICENSE file for details.

## Contribution

Contributions are welcome. Please keep changes focused, modular, and testable. Avoid hardcoded secrets, fake success flows, or placeholder screens in completed work.

## Status

This repository currently contains a working MVP foundation and project architecture, but it is not yet a full production-ready anime platform. Real source integrations, downloads, subtitle systems, and localization remain as planned future work.
