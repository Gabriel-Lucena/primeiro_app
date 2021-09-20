package com.example.primeiroapp

import kotlin.math. *

fun calcular_imc(peso: Int, altura: Double) : Double {

    val imc = peso / (altura * altura)

    return imc

}


fun calcular_imc_de_outra_maneira(peso: Int, altura: Double) : Double {

    val imc = peso * altura.pow(-2)

    return imc

}
