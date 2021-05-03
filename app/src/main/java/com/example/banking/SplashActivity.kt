package com.example.banking

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        Handler().postDelayed({
            val intent =
                Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(intent)

        }, 3000)
    }}