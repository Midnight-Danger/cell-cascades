package plugins

import extensions.androidExtension
import extensions.configureJetpackCompose
import org.gradle.api.Plugin
import org.gradle.api.Project

class ComposeCoreConventionPlugin: Plugin<Project> {

    override fun apply(project: Project) {
        with(project) {
            configureJetpackCompose(androidExtension)
        }
    }
}