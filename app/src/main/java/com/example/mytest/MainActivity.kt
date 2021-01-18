package com.example.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1 : Button = findViewById(R.id.button1)
        b1.setText(R.string.button1)
        b1.setOnClickListener {
            Log.e("#1", "button1 clicked")
        }

        val b2 : Button = findViewById(R.id.button2)
        b2.setText(R.string.button2)
        b2.setOnClickListener {
            Log.e("#2", "button2 clicked")
        }

        val b3 : Button = findViewById(R.id.button3)
        b3.setText(R.string.button3)
        b3.setOnClickListener {
            Log.e("#3", "button3 clicked")
        }
    }
}