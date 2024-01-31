package extensions

import BuildOptions.Flavours.DEVELOP
import BuildOptions.Flavours.PRODUCTION
import BuildOptions.Flavours.STAGING
import ProjectConfig
import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Project

fun Project.configureProductFlavors(
    appExtension: ApplicationExtension
) {
    appExtension.apply {
        buildFeatures.buildConfig = true
        flavorDimensions.addAll(listOf("build"))
        productFlavors {
            create(PRODUCTION) {
                dimension = "build"
                buildConfigField("int", "VERSION_CODE", "${ProjectConfig.versionCode}")
                buildConfigField("String", "VERSION_NAME", "\"${ProjectConfig.versionName}\"")
            }
            create(STAGING) {
                dimension = "build"
                buildConfigField("int", "VERSION_CODE", "${ProjectConfig.versionCode}")
                buildConfigField("String", "VERSION_NAME", "\"${ProjectConfig.versionName}\"")
            }
            create(DEVELOP) {
                dimension = "build"
                buildConfigField("int", "VERSION_CODE", "${ProjectConfig.versionCode}")
                buildConfigField("String", "VERSION_NAME", "\"${ProjectConfig.versionName}\"")
            }
        }
    }
}