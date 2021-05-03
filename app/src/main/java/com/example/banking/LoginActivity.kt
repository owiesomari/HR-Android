package com.example.banking

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main. layout_login.*
import kotlinx.android.synthetic.main.layout_login.btn
import kotlinx.android.synthetic.main.layout_login.signUpText


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

btn.setOnClickListener {
    val intent = Intent(this@LoginActivity, Dashboard::class.java)
    startActivity(intent)
}

        signUpText.setOnClickListener {
            val intent =
                Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}
