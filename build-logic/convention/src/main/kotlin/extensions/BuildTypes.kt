package extensions

import BuildOptions
import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Project

internal fun Project.configureBuildTypes(
    appExtension: ApplicationExtension
) {
    appExtension.apply {
        buildTypes {
            getByName(BuildOptions.Types.RELEASE) {
                isShrinkResources = true
                isMinifyEnabled = true
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
            create(BuildOptions.Types.BETA) {
                applicationIdSuffix = "-beta"
                isShrinkResources = true
                isMinifyEnabled = true
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
            create(BuildOptions.Types.MINIFIED_ALPHA) {
                isDebuggable = true
                applicationIdSuffix = "-alpha"
                isMinifyEnabled = true
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
            create(BuildOptions.Types.ALPHA) {
                isDebuggable = true
                applicationIdSuffix = "-alpha"
            }
            create(BuildOptions.Types.MINIFIED_DEBUG) {
                isDebuggable = true
                isMinifyEnabled = true
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
            getByName(BuildOptions.Types.DEBUG) {
                isMinifyEnabled = false
            }
        }
    }
}