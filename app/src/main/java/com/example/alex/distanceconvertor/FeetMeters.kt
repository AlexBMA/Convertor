package com.example.alex.distanceconvertor

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.TextView

class FeetMeters : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feet_meters)
    }

    fun convertFeetToMeters(view: View) {
        val editText = findViewById<EditText>(R.id.et_val_fm)
        val meters = editText.text.toString().toDouble() * 0.3
        val textView = findViewById<TextView>(R.id.tv_res_convert_f_m)
        textView.text = "$meters " + getString(R.string.meters)
    }

    fun convertMetersToFeet(view: View) {
        val editText = findViewById<EditText>(R.id.et_val_fm)
        val feet = editText.text.toString().toDouble() * 3.28
        val textView = findViewById<TextView>(R.id.tv_res_convert_f_m)
        textView.text = "$feet " + getString(R.string.feet)

    }
}
