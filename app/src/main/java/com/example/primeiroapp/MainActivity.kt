package com.example.primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val buttonCalcular =
            findViewById<Button>(R.id.button_calcular) 

        val editTextPeso = findViewById<EditText>(R.id.edit_text_peso)

        val editTextAltura = findViewById<EditText>(R.id.edit_text_altura)

        val editTextImc = calcular_imc_de_outra_maneira(editTextPeso.text.toString().toInt(),editTextAltura.text.toString().toDouble())

        val textViewResultado = findViewById<TextView>(R.id.edit_text_resultado)

        buttonCalcular.setOnClickListener {
            Toast.makeText(this, "Clicou!" , Toast.LENGTH_SHORT).show()
        }

        buttonCalcular.setOnClickListener {
            textViewResultado.text = String.format("%.1f", editTextImc)
        }
        
    }
}