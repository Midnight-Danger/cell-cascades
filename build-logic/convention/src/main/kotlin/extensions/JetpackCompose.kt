package extensions

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureJetpackCompose(
    commonExtension: CommonExtension<*, *, *, *, *>
) {
    commonExtension.apply {
        buildFeatures.compose = true // enable compose
        composeOptions {
            kotlinCompilerExtensionVersion =
                versionCatalog().findVersion("compose-compiler").get().toString()
        }

        dependencies {
            add("implementation", platform(versionCatalog().findLibrary("compose-bom").get()))
            add("implementation", versionCatalog().findBundle("compose").get())
            add("debugImplementation", versionCatalog().findBundle("compose-tooling").get())
            add("androidTestImplementation", platform(versionCatalog().findLibrary("compose-bom").get()))
        }
    }
}