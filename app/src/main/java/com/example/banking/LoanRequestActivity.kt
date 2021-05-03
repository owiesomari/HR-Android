package com.example.banking

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.loanrequest.*

class LoanRequestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loanrequest)

        val spinner: Spinner = findViewById(R.id.reason)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.loanReasons,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

        sendLoanRequestbtn.setOnClickListener{
            val loanReason :Spinner = findViewById(R.id.reason)
            val loanAmount:TextView=findViewById(R.id.loanAmount)
            val loanDescription:TextView=findViewById(R.id.loanDescription)

            if (loanAmount.text.toString()=="")
                loanAmount.error="Required."
            if (loanDescription.text.toString()=="")
                loanDescription.error="Required."

            if (loanAmount.text.toString()!="" && loanDescription.text.toString()!="" ){
                //Read Values and store in DB
                Toast.makeText(baseContext, loanAmount.text, Toast.LENGTH_LONG).show()
                loanAmount.text=""
                loanDescription.text=""

            }





        }

    }
}