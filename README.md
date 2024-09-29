## AndroidSwissArmyKnife

**AndroidSwissArmyKnife** is an Android application developed to showcase various functionalities of the Android platform, using best practices and modern libraries such as **Jetpack Compose**, **AndroidX**, and **Kotlin**. The goal is to provide a robust and modular example, incorporating essential concepts of design, architecture, and testing for Android applications.

## Features

- **Jetpack Compose**: Declarative and modern UI for Android.
- **Modularized Architecture**: Clear separation of responsibilities between layers and modules.
- **Push Notifications**: Integration with Firebase for real-time push notifications.
- **Analytics**: Integrated with Google Analytics/Firebase Analytics for tracking user behavior and app performance.
- **Feature Toggle**: Dynamic feature management using feature toggles, enabling or disabling features remotely.
- **Remote Config**: Utilize Firebase Remote Config to update app behavior and appearance without requiring a new version release.
- **Design System**: Implementation of a scalable and consistent design system across the app, ensuring a cohesive user experience.
- **Reusable Components with Jetpack Compose**: Efficiently built reusable UI components to ensure consistency and code reuse.
- **Google Maps Integration**: Embedding Google Maps for location-based services and enhanced map interactions.
- **Firebase Authentication**: User authentication with Firebase.
- **App Settings**: User-friendly settings screen for customizing app preferences and configurations.
- **Dynamic Themes**: Support for dynamic themes, allowing users to switch between light, dark, or custom themes based on user preference.

## Requirements

- **Android Studio** Arctic Fox or newer
- **JDK 1.7** or newer
- **Gradle 8.7** or newer
- **Android SDK**: Compile SDK 34 (Android 14)

## Environment Setup

1. Make sure you have **Android Studio** installed.
2. Clone this repository: ```git clone https://github.com/simaopgt/AndroidSwissArmyKnife.git```
3. Open the project in **Android Studio**.
4. Sync Gradle and download the dependencies.
5. Build and run the application.

## Project Structure

- **`app/`**: Main module of the Android project, containing the application's source code and resources.
- **`core/`**: Contains shared logic and utilities used throughout the application to ensure consistency and avoid code duplication.
- **`data/`**: Responsible for data management, including external APIs and local databases, handling repositories and caching.
- **`domain/`**: Contains the core business logic, including domain models and use cases, abstracting the data layer for better modularity and testability.
- **`features/`**: Includes submodules that represent different functionalities of the app, such as authentication or user profile, allowing for independent development and maintenance.
### Additional Elements

- **Gradle Scripts**: These include project-level and module-level Gradle scripts that define build configurations, dependencies, tasks, and plugins. The main Gradle scripts are:
  - **`settings.gradle.kts`**: Defines the modules included in the project and manages dependency resolution through global repository settings.
  - **`gradle-wrapper.properties`**: Ensures that all developers are using the same Gradle version to build the project, increasing consistency.
  - **`gradle.properties`**: Contains properties that customize the behavior of the Gradle build system, such as JVM arguments or project-wide configurations.

- **GitHub Actions Script**: 
  - Automates tasks like building, testing, and deploying the project through continuous integration (CI). Stored in `.github/workflows/`, it ensures code quality by triggering builds and tests on every push or pull request.

- **Version Catalog**:
  - The **Version Catalog** (defined in `libs.versions.toml`) centralizes the management of dependencies across the project. It stores the versions of libraries and plugins in a single location, making it easier to maintain consistency and update dependencies. This approach helps avoid hardcoding versions in individual `build.gradle.kts` files and improves maintainability, especially in multi-module projects.

## Main Dependencies

The project uses the following main dependencies:

- **Jetpack Compose**: Declarative and responsive UI creation.
- **Material 3**: Implementation of Material Design 3 in Android.
- **AndroidX Lifecycle**: Lifecycle management of Android components.
- **JUnit 5**: Unit testing framework.
- **Espresso**: UI testing framework.

All dependencies are centrally managed in the `libs.versions.toml` file using the **Version Catalog**.
