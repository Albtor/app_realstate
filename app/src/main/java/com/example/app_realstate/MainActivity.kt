package com.example.app_realstate

import android.os.Bundle
import android.content.Intent
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val houseImage = findViewById<ImageView>(R.id.houseImage)
        houseImage.setOnClickListener {
            val intent = Intent(this, PropertyPageActivity::class.java)
            startActivity(intent)
        }

        val userIcon = findViewById<ImageView>(R.id.imgUser)
        userIcon.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }
    }
}