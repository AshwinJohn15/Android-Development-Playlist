package com.example.assignment_1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val appBtn = findViewById<CardView>(R.id.webButton1)

        appBtn.setOnClickListener {
            intent = Intent(applicationContext,App::class.java)
            startActivity(intent)
        }

        val mlBtn = findViewById<CardView>(R.id.webButton2)

        mlBtn.setOnClickListener {
            intent = Intent(applicationContext,ML::class.java)
            startActivity(intent)
        }

        val webBtn = findViewById<CardView>(R.id.webButton3)

        webBtn.setOnClickListener {
            intent = Intent(applicationContext,Web::class.java)
            startActivity(intent)
        }

        val blockBtn = findViewById<CardView>(R.id.webButton4)

        blockBtn.setOnClickListener {
            intent = Intent(applicationContext,Block::class.java)
            startActivity(intent)
        }

        val iotBtn = findViewById<CardView>(R.id.webButton5)

        iotBtn.setOnClickListener {
            intent = Intent(applicationContext,iot::class.java)
            startActivity(intent)
        }

        val iosBtn = findViewById<CardView>(R.id.webButton6)

        iosBtn.setOnClickListener {
            intent = Intent(applicationContext,ios::class.java)
            startActivity(intent)
        }

        val callBtn = findViewById<Button>(R.id.callbutton)

        callBtn.setOnClickListener {
            val u = Uri.parse("tel:8602277064")
            val intent = Intent(Intent.ACTION_DIAL,u)
            startActivity(intent)

        }
    }
}