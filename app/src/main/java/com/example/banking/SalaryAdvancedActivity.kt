package com.example.banking

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.salaryadvanced.*

class SalaryAdvancedActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.salaryadvanced)
        sendSalaryAdvanced.setOnClickListener{
            when {
                amount.text.toString()=="" -> amount.error="Amount required."
                description.text.toString()=="" -> description.error="Description required."
                else -> {
                    //read values and store in DB
                }
            }
        }


    }
}