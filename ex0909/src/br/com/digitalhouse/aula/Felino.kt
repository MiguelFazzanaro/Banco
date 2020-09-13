package br.com.digitalhouse.aula

open class Felino(open val cor: String = "", idade: Int = 0, especie: String) : Animal(idade, especie) {

    final override fun locomover() {
        for (passos in 0..2) {
            println("O felino está se locomovendo com a cor: $cor")
            super.locomover()
        }
    }

    override fun come(comida: String): String {
        return comida
    }
}