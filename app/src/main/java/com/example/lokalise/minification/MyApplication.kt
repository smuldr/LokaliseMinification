package com.example.lokalise.minification

import android.app.Application
import android.util.Log
import com.lokalise.sdk.Lokalise
import com.lokalise.sdk.LokaliseCallback
import com.lokalise.sdk.LokaliseUpdateError

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.i("MyApplication", "Initializing Lokalise")
        Lokalise.init(appContext = this, sdkToken = BuildConfig.SDK_TOKEN, projectId = BuildConfig.PROJECT_ID)
        Lokalise.addCallback(object : LokaliseCallback {
            override fun onUpdateFailed(error: LokaliseUpdateError) {
                Log.w(LOG_TAG, "Translations update failed")
            }

            override fun onUpdateFailedNotEnoughSpace() {
                Log.w(LOG_TAG, "Translations update failed: not enough space")
            }

            override fun onUpdateNotNeeded() {
                Log.i(LOG_TAG, "Translations update not needed")
            }

            override fun onUpdated(oldBundleId: Long, newBundleId: Long) {
                Log.i(LOG_TAG, "Translations updated")
            }

            private val LOG_TAG = "LokaliseCallback"
        })
        Lokalise.logsEnabled = true
        Lokalise.isPreRelease = true
        Log.i("MyApplication", "Update Lokalise translations")
        Lokalise.updateTranslations()
    }
}
