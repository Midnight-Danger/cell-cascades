package plugins

import ProjectConfig
import com.android.build.api.dsl.ApplicationExtension
import extensions.configureAndroidKotlin
import extensions.configureBuildTypes
import extensions.configureProductFlavors
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AppCoreConventionPlugin: Plugin<Project> {

    override fun apply(project: Project) {
        with(project) {
            // Apply Gradle & Kotlin plugins
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<ApplicationExtension> {
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