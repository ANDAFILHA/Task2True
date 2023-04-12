package com.example.task2true

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val textView = findViewById<TextView>(R.id.textView)
        val text = intent.getStringExtra("text")
        textView.text = text
    }
}