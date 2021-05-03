package com.example.banking

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.incometax.*
import kotlinx.android.synthetic.main.ssc.*

class SSCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ssc)

        calculateSSC.setOnClickListener{
            val salaryvalue=salary.text.toString()
            if (salaryvalue !="")
                SSCValue.text="SSC Deduction: "+salaryvalue.toString().toDouble()*0.075+" JOD."
            else
                salary.error="Enter your salary"
        }


    }
}