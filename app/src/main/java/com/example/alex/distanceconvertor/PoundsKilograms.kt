package com.example.alex.distanceconvertor

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.TextView

class PoundsKilograms : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pounds_kilograms)

    }

    fun convertToPounds(view: View) {
        val editText = findViewById<EditText>(R.id.et_val_pk)
        val pounds = editText.text.toString().toDouble() * 2.20
        val textBox = findViewById<TextView>(R.id.tv_res_convert_p_k)
        textBox.text = "$pounds " + getString(R.string.pounds)
    }

    fun convertToKilograms(view: View) {
        val editText = findViewById<EditText>(R.id.et_val_pk)
        val kilograms = editText.text.toString().toDouble() * 0.45
        val textBox = findViewById<TextView>(R.id.tv_res_convert_p_k)
        textBox.text = "$kilograms " + getString(R.string.kilograms)

    }
}
