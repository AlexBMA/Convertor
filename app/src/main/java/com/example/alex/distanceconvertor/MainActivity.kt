package com.example.alex.distanceconvertor

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun milesToKilometerActivity(view:View) {
        var intent:Intent = Intent(this,MilesKilometers::class.java)
        startActivity(intent)
    }
    fun inchToCentimeterActivity(view: View) {
        var intent:Intent = Intent(this,InchCentimeter::class.java)
        startActivity(intent)
    }

}
