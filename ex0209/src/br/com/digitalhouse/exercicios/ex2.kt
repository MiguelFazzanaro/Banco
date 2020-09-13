package br.com.digitalhouse.exercicios

fun main (){
    println(textos("Miguel","Miguel"))
    println(textos("Miguel", "João"))
}

fun textos (texto1: String , texto2: String): Boolean {
    return texto1 != texto2
}