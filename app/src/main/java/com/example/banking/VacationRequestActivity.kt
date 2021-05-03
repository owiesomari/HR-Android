package com.example.banking

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.vacationrequest.*
import org.w3c.dom.Text

class VacationRequestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vacationrequest)
        val spinner: Spinner = findViewById(R.id.vacationType)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.vacationType,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
        sendVacationRequestbtn.setOnClickListener{
            val fromDate :TextView=findViewById(R.id.fromDate)
            val toDate:TextView=findViewById(R.id.toDate)
            val description:TextView=findViewById(R.id.vacationDescription)
            if (fromDate.text.toString()=="")
                fromDate.error="Required."
            if (toDate.text.toString()=="")
                toDate.error="Required."
            if (description.text.toString()=="")
                description.error="Required."


            if (fromDate.text.toString()!="" && toDate.text.toString()!="" && description.text.toString()!="" ){
                //Read Values and store in DB
                Toast.makeText(baseContext, fromDate.text, Toast.LENGTH_LONG).show()
                fromDate.text=""
                toDate.text=""
                description.text=""

            }
        }

    }
}