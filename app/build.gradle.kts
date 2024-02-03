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
    debugImplementation(libs.leak.canary)
}