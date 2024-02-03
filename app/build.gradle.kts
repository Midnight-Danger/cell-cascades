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
    with(Modules.Base) {
        implementation(project(neumorphicDesignSystem))
    }

    debugImplementation(libs.leak.canary)
}