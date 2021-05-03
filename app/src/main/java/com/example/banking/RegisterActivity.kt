package com.example.banking

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_register)
        alreadyHaveAccount.setOnClickListener{
            val intent = Intent(this@RegisterActivity,LoginActivity::class.java)
            startActivity(intent)
        }


    }
}