import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "com.midnight.danger.buildlogic"

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidCore"){
            id = "core-application"
            implementationClass = "plugins.AppCoreConventionPlugin"
        }
        register("androidLibrary"){
            id = "core-library"
            implementationClass = "plugins.AppLibraryConventionPlugin"
        }
        register("composeCore"){
            id = "compose-core"
            implementationClass = "plugins.ComposeCoreConventionPlugin"
        }
        register("timber-logger") {
            id = "logger"
            implementationClass = "plugins.LoggerConventionPlugin"
        }
        register("unitTests"){
            id = "unit-tests"
            implementationClass = "plugins.UnitTestConventionPlugin"
        }
    }
}