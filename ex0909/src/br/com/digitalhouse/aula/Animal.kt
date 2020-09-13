package br.com.digitalhouse.aula

abstract class Animal (open val idade: Int = 0, val especie: String) {
    open fun locomover(){

    }

    open fun idade(){
        println("a idade é de $idade, e é da especie $especie")
    }

    abstract fun come(comida: String): String
}