package com.example.alex.distanceconvertor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MilesKilometers : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_miles_kilometers) }

    fun convertToMiles(view: View):Unit {
        var km = findViewById<EditText>(R.id.et_val_mk)
        var miles = km.text.toString().toDouble() * 0.6
        var textRes = findViewById<TextView>(R.id.tv_res_convert_m_k)
        textRes.text = "$miles miles"
    }

    fun convertToKm(view: View):Unit {
        var miles = findViewById<EditText>(R.id.et_val_mk)

        var km = miles.text.toString().toDouble() * 1.6
        var textRes = findViewById<TextView>(R.id.tv_res_convert_m_k)
        textRes.text= "$km kilometers"

    }
}
