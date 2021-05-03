package com.example.banking

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.dashboard.*
import kotlinx.android.synthetic.main. dashboard.*

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
        incomeTaxImage.setOnClickListener {
           // Toast.makeText(baseContext, " Income Tax!", Toast.LENGTH_LONG).show()
            val intent = Intent(this@Dashboard, IncomeTaxActivity::class.java)
            startActivity(intent)
        }
        SSC.setOnClickListener {
            val intent = Intent(this@Dashboard, SSCActivity::class.java)
            startActivity(intent)
        }

        salaryAdvanced.setOnClickListener {
            val intent = Intent(this@Dashboard,SalaryAdvancedActivity::class.java)
            startActivity(intent)
        }
        loanRequest.setOnClickListener {
            val intent = Intent(this@Dashboard,LoanRequestActivity::class.java)
            startActivity(intent)
        }
        vacationRequest.setOnClickListener {
            val intent = Intent(this@Dashboard,VacationRequestActivity::class.java)
            startActivity(intent)
        }
        logout.setOnClickListener {
            val intent = Intent(this@Dashboard,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}