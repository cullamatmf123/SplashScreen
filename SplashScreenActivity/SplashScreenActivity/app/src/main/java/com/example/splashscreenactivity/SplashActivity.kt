package com.example.splashscreenactivity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Handler to transition to MainActivity after a delay
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish() // Close SplashActivity
        }, 2000) // 2000 milliseconds = 2 seconds
    }
}
