package com.example.alex.distanceconvertor

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MilesKilometers : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_miles_kilometers) }

    fun convertToMiles(view: View):Unit {
        val km = findViewById<EditText>(R.id.et_val_mk)
        val miles = km.text.toString().toDouble() * 0.6
        val textRes = findViewById<TextView>(R.id.tv_res_convert_m_k)
        textRes.text = "$miles " + getString(R.string.miles)
    }

    fun convertToKm(view: View):Unit {
        val miles = findViewById<EditText>(R.id.et_val_mk)
        val kilometers = miles.text.toString().toDouble() * 1.6
        val textRes = findViewById<TextView>(R.id.tv_res_convert_m_k)
        textRes.text = "$kilometers " + getString(R.string.kilometers)

    }
}
