package br.com.digitalhouse.exercicios

fun main (){
    println (parImpar(2))
    println (parImpar(1))
    println (parImpar(1123))
}

fun parImpar (numero: Int) : Boolean{
    return numero % 2 == 0
}