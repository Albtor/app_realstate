package com.example.app_realstate

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_forgot_password)

        val email = findViewById<EditText>(R.id.etEmail)
        val button = findViewById<Button>(R.id.btnReset)

        button.setOnClickListener {

            if (email.text.toString().trim().isEmpty()) {

                Toast.makeText(
                    this,
                    "Please enter your email.",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                Toast.makeText(
                    this,
                    "If an account exists with this email, you will receive password reset instructions.",
                    Toast.LENGTH_LONG
                ).show()

            }

        }

    }

}

//ForgotPasswordActivity
//│
//▼
//POST https://yourdomain.com/api/forgot_password.php
//│
//▼
//PHP
//│
//├── Search email
//├── Generate random token
//├── Save token in MySQL
//├── Send email (using PHPMailer)
//└── Return JSON
//│
//▼
//Android shows:
//"If an account exists..."
//
//Someone requested to reset your password.
//
//Click below:
//
//https://yourdomain.com/reset_password.php?token=xxxxxxxx
//
//This link expires in 30 minutes.