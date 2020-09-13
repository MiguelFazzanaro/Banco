package br.com.digitalhouse.exercicioaula

class ContaP(var juros: Float, cliente: Clientes, saldo: Float) : Contas (cliente, saldo) {

    override fun depositar(valor: Float) {
        saldo += valor
        println("Deposito realizado no valor de $valor. Saldo atual é $saldo")
    }

    override fun sacar (valor: Float) {
        if (saldo > valor){
            saldo -= valor
            println("Saque realizado no valor de $valor. Saldo atual é $saldo")
        } else {
            println("Não é possivel sacar. Saldo insuficiente")
        }
    }

    fun recolheJuros () {
        var jurosmensal: Float = ((juros/100)+1) * saldo
        jurosmensal -= saldo
        println("Juros de ${jurosmensal} recolhidos. Saldo atual é $saldo")
    }
}