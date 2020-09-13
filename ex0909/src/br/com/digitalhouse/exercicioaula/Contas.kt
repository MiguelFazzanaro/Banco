package br.com.digitalhouse.exercicioaula

abstract class Contas(cliente: Clientes, var saldo: Float) {

    abstract fun depositar(valor: Float)

    fun mostrarSaldo (){
        println("Saldo: $saldo")
    }

   open fun sacar (valor: Float){}
}