package com.example.myapplicationaaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val l = findViewById<TextView>(R.id.text)
        val loh = findViewById<Button>(R.id.but)
        val Z = findViewById<Button>(R.id.button)
        val A = findViewById<Button>(R.id.button4)
        val C = findViewById<Button>(R.id.button5)
        val K = findViewById<Button>(R.id.button6)
        var polniy = 1
        Z.setOnClickListener{
         if (polniy >= 100) {   polniy * 10}
         else {polniy = 1}
        }
        A.setOnClickListener {

        }
        C.setOnClickListener {

        }
        K.setOnClickListener {

        }
    }
}



















