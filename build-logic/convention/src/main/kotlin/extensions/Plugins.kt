package extensions

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.LibraryExtension
import com.android.build.gradle.BaseExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

internal val Project.androidExtension: ApplicationExtension
    get() = extensions.getByType<ApplicationExtension>()

internal val Project.libraryExtension: LibraryExtension
    get() = extensions.getByType<LibraryExtension>()