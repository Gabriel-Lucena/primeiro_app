package com.example.primeiroapp.ui

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import com.example.primeiroapp.R
import java.util.*

class NovoUsuarioActivity : AppCompatActivity() {

    lateinit var editEmail: EditText
    lateinit var editSenha: EditText
    lateinit var editNome: EditText
    lateinit var editProfissao: EditText
    lateinit var editAltura: EditText
    lateinit var editData: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_usuario)

        editEmail = findViewById(R.id.editEmail)
        editSenha = findViewById(R.id.editSenha)
        editNome = findViewById(R.id.editNome)
        editProfissao = findViewById(R.id.editProfissao)
        editAltura = findViewById(R.id.editAltura)
        editData= findViewById(R.id.editData)


        // supportActionBar!!.title = "Perfil"

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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

    if (validarCampos()) {

        // Salvar o registro

    }

        return true

    }

    fun validarCampos() : Boolean {

        var valido = true

        if (editEmail.text.isEmpty()) {

            editEmail.error = "E-mail é obrigatório"
            valido = false

        } else if (editSenha.text.isEmpty()) {

            editSenha.error = "Senha é obrigatória"
            valido = false

        } else if (editNome.text.isEmpty()) {

            editNome.error = "Nome é obrigatório"
            valido = false

        } else if (editProfissao.text.isEmpty()) {

            editProfissao.error = "Profissão é obrigatória"
            valido = false

        } else if (editAltura.text.isEmpty()) {

            editAltura.error = "Altura é obrigatória"
            valido = false

        } else if (editData.text.isEmpty()) {

            editData.error = "Data é obrigatória"
            valido = false

        }

        return valido
    }
}
