package com.example.myfirstproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text: TextView = findViewById(R.id.intro)
        text.setOnClickListener{
            openSecondActivity()
        }

        val buttun: Button = findViewById(R.id.button)
        buttun.setOnClickListener{
            openSecondActivity()
        }
    }

    private fun openSecondActivity(){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)

    }
}