package br.com.digitalhouse.exercicio2

class Normal (valor: Float) : Ingresso(valor) {
    override fun imprimeValor(valor: Float, valorAdicional:Float) {
        println("valor normal")
    }
}