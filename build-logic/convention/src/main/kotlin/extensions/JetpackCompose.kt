package extensions

import com.android.build.gradle.BaseExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureJetpackCompose(
    baseExtension: BaseExtension?
) {
    baseExtension?.apply {
        buildFeatures.compose = true // enable compose
        composeOptions {
            kotlinCompilerExtensionVersion = vcVersion("compose-compiler").toString()
        }

        dependencies {
            implementation(platform(vcLibrary("compose-bom")))
            implementation(vcBundle("compose"))
            implementation(vcLibrary("compose-destinations"))

            debugImplementation(vcBundle("compose-tooling"))
            androidTestImplementation(platform(vcLibrary("compose-bom")))
        }
    }
}