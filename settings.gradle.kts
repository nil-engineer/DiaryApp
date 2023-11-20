pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven{ setUrl("https://jitpack.io")}
    }
}

rootProject.name = "DiaryApp"
include(":app")
include(":core:ui")
include(":core:util")
include(":data:mongo")
include(":feature:auth")
