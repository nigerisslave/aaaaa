package com.example.myapplicationaaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val l = findViewById<TextView>(R.id.text)
        val loh = findViewById<Button>(R.id.but)
        val loh1 = findViewById<Button>(R.id.button2)
        val dodik = findViewById<Button>(R.id.valera)
        var polniy = 0


        loh.setOnClickListener {
            polniy++
            l.text = polniy.toString()
        }
        loh1.setOnClickListener {
            polniy -= 1
            l.text = polniy.toString()
        }
        dodik.setOnClickListener {
            var intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }


    }
}