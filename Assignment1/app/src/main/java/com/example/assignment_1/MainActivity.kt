package com.example.assignment_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val screenBtn = findViewById<Button>(R.id.button)


        screenBtn.setOnClickListener {
            intent = Intent(applicationContext, Screen2::class.java)
            startActivity(intent)
        }
    }
}