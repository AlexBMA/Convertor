package com.example.alex.distanceconvertor

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_inch_centimeter.*

class InchCentimeter : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inch_centimeter)
        }

    fun convertInchToCentimeter(view: View) {
       var editText = findViewById<EditText>(R.id.et_val_ic)
       var rez = editText.text.toString().toDouble() * 2.54
       var textView = findViewById<TextView>(R.id.tv_res_convert_i_c)
       textView.text = "$rez centimeters"
    }
    fun convertCentimeterToInch(view: View){
        var editText = findViewById<EditText>(R.id.et_val_ic)
        var rez = editText.text.toString().toDouble() * 0.39
        var textView = findViewById<TextView>(R.id.tv_res_convert_i_c)
        textView.text = "$rez inches"
    }
}


