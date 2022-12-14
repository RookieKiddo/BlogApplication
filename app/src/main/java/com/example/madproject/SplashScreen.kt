package com.example.madproject

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        setContentView(R.layout.activity_splash_screen)
        val handler= Handler(Looper.getMainLooper())
        handler.postDelayed({

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 8000)


    }
}