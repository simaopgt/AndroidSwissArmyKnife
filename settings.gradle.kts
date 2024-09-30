pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AndroidSwissArmyKnife"
include(":app")
include(":core")
include(":domain")
include(":data")
include(":features")
include(":core:core-ui")
include(":core:core-utils")
include(":core:core-data")
include(":data:data-network")
include(":data:data-db")
include(":features:feature-authentication")
include(":features:feature-profile")
include(":features:feature-settings")
include(":features:feature-home")
