package com.example.alex.distanceconvertor

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.TextView

class InchCentimeter : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inch_centimeter)
        }

    fun convertInchToCentimeter(view: View) {
        val editText = findViewById<EditText>(R.id.et_val_ic)
        val centimeters = editText.text.toString().toDouble() * 2.54
        val textView = findViewById<TextView>(R.id.tv_res_convert_i_c)
        textView.text = "$centimeters " + getString(R.string.centimeters)
    }

    fun convertCentimeterToInch(view: View){
        val editText = findViewById<EditText>(R.id.et_val_ic)
        val inches = editText.text.toString().toDouble() * 0.39
        val textView = findViewById<TextView>(R.id.tv_res_convert_i_c)
        textView.text = "$inches " + getString(R.string.inches)
    }
}


