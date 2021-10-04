package com.example.primeiroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val marcos = findViewById<TextView>(R.id.editCriarConta)

        marcos.setOnClickListener {

            val abrir = Intent(this, DatePickerActivity::class.java)

            startActivity(abrir)

        }
    }
}