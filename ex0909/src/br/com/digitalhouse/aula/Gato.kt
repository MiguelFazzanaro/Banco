package br.com.digitalhouse.aula

class Gato : Felino("amarelo", 4, "maltes") {
    override val cor: String = "amarelo"

    fun gatoAndando(){
        super.locomover()
        println("A cor é $cor")
    }
}