package com.example.banking

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.incometax.*

class IncomeTaxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.incometax)
        calculateIncomeTax.setOnClickListener {

            var statusRadioButton: RadioGroup = findViewById(R.id.status)
            val selectedId: Int = statusRadioButton.checkedRadioButtonId
            var radioButton : RadioButton
            val income=IncomeYear.text.toString()

            if (income !="" && selectedId!=-1)
            {
               var radioButton = findViewById<View>(selectedId) as RadioButton
                IncomeTaxValue.text= "IncomeTax "+calculateIncomeTax(income.toDouble(),radioButton.text.toString())+" JOD."
            }
             if (income==""){
                 IncomeYear.error="Enter the income"
                 Toast.makeText(baseContext, " Enter the income", Toast.LENGTH_LONG).show()
             }
           else if (selectedId ==-1)
                 Toast.makeText(baseContext, " select the status", Toast.LENGTH_LONG).show()
        }
    }
  private fun calculateIncomeTax(income:Double, status:String):Double{
        var yearlyTaxableIncome:Double
        var tax:Double=0.0
        var exemptedValue :Int = if(status=="single")
            9000
        else  18000

        if (income<exemptedValue)
             tax=0.0
        else{
            yearlyTaxableIncome=income-exemptedValue
            if(yearlyTaxableIncome>=1 && yearlyTaxableIncome<=5000)
                tax=yearlyTaxableIncome*0.05;
            else if (yearlyTaxableIncome>5000 && yearlyTaxableIncome<=10000)
                tax=(5000*0.05)+ (0.10*(yearlyTaxableIncome-5000))
            else if (yearlyTaxableIncome>10000 && yearlyTaxableIncome<=15000)
                tax=(5000*0.05)+ (0.10*5000)+(0.15*(yearlyTaxableIncome-10000))
            else if (yearlyTaxableIncome>15000 && yearlyTaxableIncome<=20000)
                tax=(5000*0.05)+ (0.10*5000)+(0.15*5000)+(0.20*(yearlyTaxableIncome-15000))
            else if (yearlyTaxableIncome>20000 && yearlyTaxableIncome<=1000000)
                tax=(5000*0.05)+ (0.10*5000)+(0.15*5000)+(0.20*5000)+(0.25*(yearlyTaxableIncome-20000))
        }
    return tax
    }
}