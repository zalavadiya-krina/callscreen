pluginManagement {
    repositories {
        google()
        mavenCentral()
        jcenter()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
        classpath ("com.android.tools.build:gradle:3.2.1")

    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()

        jcenter()
        mavenCentral()
    }
}

rootProject.name = "callscreen"
include(":app")

fun classpath(s: String) {

}
