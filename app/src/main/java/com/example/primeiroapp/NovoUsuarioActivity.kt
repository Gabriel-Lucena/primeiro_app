package com.example.primeiroapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.Toast
import java.util.*

class NovoUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_usuario)


        // Criar um calenário.

        val calendario = Calendar.getInstance()

        // Determinar os dados (dia, mês e ano) do calendário.

        val ano = calendario.get(Calendar.YEAR)
        val mes = calendario.get(Calendar.MONTH)
        val dia = calendario.get(Calendar.DAY_OF_MONTH)

        // Abrir o componente DatePicker.

        val etDataNascimento = findViewById<EditText>(R.id.editData)

        etDataNascimento.setOnClickListener {

            val dp = DatePickerDialog(this,

                DatePickerDialog.OnDateSetListener{ view, _ano, _mes, _dia ->
                    etDataNascimento.setText("$_dia/${_mes + 1}/$_ano")
                }, ano, mes, dia)

            dp.show()

        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean{
        menuInflater.inflate(R.menu.menu_salvar, menu)
        return true
    }

}
