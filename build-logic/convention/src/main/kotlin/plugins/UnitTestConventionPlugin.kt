package plugins

import extensions.versionCatalog
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class UnitTestConventionPlugin: Plugin<Project> {

    override fun apply(project: Project) {
        with(project) {
            dependencies {
                // Core test dependencies
                add("testImplementation", versionCatalog().findLibrary("junit").get())
                add("androidTestImplementation", versionCatalog().findBundle("androidTests").get())
            }
        }
    }
}