package com.example.lokalise.minification

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lokalise.sdk.LokaliseContextWrapper

class MainActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LokaliseContextWrapper.wrap(newBase))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
