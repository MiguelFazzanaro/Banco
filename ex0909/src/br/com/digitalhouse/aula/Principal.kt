package br.com.digitalhouse.aula

fun main() {
    fun main() {

        println("OBJETO PESSOA------------------------------------------------")
        val brasileiro = Pessoa(19, "ser humano", "João")

        brasileiro.locomover()
        brasileiro.idadePessoa()

        println("OBJETO FELINO------------------------------------------------")
        val pantera = Felino("preto",3,"pantera")
        pantera.locomover()

        println("OBJETO GATO------------------------------------------------")
        val gatinhoPelucia = Gato()
        gatinhoPelucia.gatoAndando()
    }
}