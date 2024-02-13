package plugins

import extensions.androidExtension
import extensions.applicationExtension
import extensions.configureJetpackCompose
import extensions.ksp
import extensions.vcLibrary
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class ComposeCoreConventionPlugin: Plugin<Project> {

    override fun apply(project: Project) {
        with(project) {
            pluginManager.apply("com.google.devtools.ksp")

            configureJetpackCompose(androidExtension)

            dependencies {
                ksp(vcLibrary("compose-destinations-ksp"))
            }
        }
    }
}