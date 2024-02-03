package plugins

import com.android.build.api.dsl.ApplicationExtension
import extensions.androidExtension
import extensions.configureJetpackCompose
import extensions.versionCatalog
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class ComposeCoreConventionPlugin: Plugin<Project> {

    override fun apply(project: Project) {
        with(project) {
            configureJetpackCompose(androidExtension)
        }
    }
}