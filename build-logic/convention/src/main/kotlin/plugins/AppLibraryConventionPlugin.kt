package plugins

import com.android.build.api.dsl.LibraryExtension
import extensions.configureAndroidKotlin
import extensions.versionCatalog
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

class AppLibraryConventionPlugin: Plugin<Project> {

    override fun apply(project: Project) {
        with(project) {
            // Apply Gradle & Kotlin plugins
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<LibraryExtension> {
                defaultConfig.apply {
                    minSdk = ProjectConfig.minSdk
                }
                configureAndroidKotlin(this)
            }
        }
    }
}