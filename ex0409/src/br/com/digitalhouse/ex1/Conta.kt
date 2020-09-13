package br.com.digitalhouse.aula0409

class Conta(val nroconta: Int, var saldo: Float, val titular: Cliente) {
    init{
        println("Novo cliente cadastrado: Cliente $nroconta, saldo atual $saldo")
    }

    fun depositar (valorDepositado: Float) {
        saldo += valorDepositado
        println(saldo)
    }

    fun sacar (valorSacado: Float) {
        saldo -= valorSacado
        println(saldo)
    }
}