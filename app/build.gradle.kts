plugins {
    id("core-application")
    id("compose-core")
    id("unit-tests")
    id("logger")
}

android {
    namespace = "com.midnight.danger.cellcascades"
}

dependencies {
    implementation(project(":feature-modules:home"))
    implementation(project(":feature-modules:settings"))

    debugImplementation(libs.leak.canary)
}