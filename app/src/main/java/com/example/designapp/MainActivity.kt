package com.example.designapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.submitButton)
        button.setOnClickListener {

            Toast.makeText(
                applicationContext,
                "Спасибо за Ваш ответ", Toast.LENGTH_LONG
            ).show()
        }
    }

    fun onClick(view: android.view.View) {}
}