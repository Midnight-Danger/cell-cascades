package plugins

import ProjectConfig
import extensions.configureAndroidKotlin
import extensions.libraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class AppLibraryConventionPlugin: Plugin<Project> {

    override fun apply(project: Project) {
        with(project) {
            // Apply Gradle & Kotlin plugins
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
            }

            libraryExtension.apply {
                defaultConfig.apply {
                    minSdk = ProjectConfig.minSdk
                }
                configureAndroidKotlin(this)
            }
        }
    }
}