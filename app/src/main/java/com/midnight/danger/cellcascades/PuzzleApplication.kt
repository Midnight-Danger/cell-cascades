package com.midnight.danger.cellcascades

import android.app.Application
import timber.log.Timber

open class PuzzleApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            // plant a debug logger
            Timber.plant(Timber.DebugTree())
        }
    }
}