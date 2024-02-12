package plugins

import ProjectConfig
import extensions.applicationExtension
import extensions.configureAndroidKotlin
import extensions.configureBuildTypes
import extensions.configureProductFlavors
import org.gradle.api.Plugin
import org.gradle.api.Project

class AppCoreConventionPlugin: Plugin<Project> {

    override fun apply(project: Project) {
        with(project) {
            // Apply Gradle & Kotlin plugins
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

            applicationExtension.apply {
                defaultConfig.apply {
                    minSdk = ProjectConfig.minSdk
                    targetSdk = ProjectConfig.targetSdk
                }
                configureAndroidKotlin(this)
                configureProductFlavors(this)
                configureBuildTypes(this)
            }
        }
    }
}