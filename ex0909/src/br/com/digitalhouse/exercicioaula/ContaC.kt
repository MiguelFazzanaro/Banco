package br.com.digitalhouse.exercicioaula

class ContaC (var chequeEspecial: Float, cliente: Clientes, saldo: Float): Contas(cliente, saldo){

    override fun depositar(valor: Float) {
        saldo += valor
        println("Deposito realizado no valor de $valor. Saldo atual é $saldo")
    }

    fun depositarCheque(valor: Float, banco: String, data: String){
        saldo += valor
        println("Deposito em cheque do banco $banco na data de $data no valor de $valor. Saldo atual é $saldo")
    }

    override fun sacar (valor: Float) {
        if (saldo >= valor){
            saldo -= valor
            println("Saque realizado no valor de $valor. Saldo atual é $saldo")
        } else {
            saldoInsuficiente(valor)
        }
    }

    fun saldoInsuficiente (valor: Float) {
        var valorLis: Float = 0F
        if (valor >= (saldo + chequeEspecial)){
            println("Não é possivel sacar, valor acima do limite do cheque especial. Faça um emprestimo")
        }
        else {
            if (saldo > 0){
                valorLis = (valor - saldo)
            }
            else{
                valorLis = (chequeEspecial - (valor - saldo) )
            }

            saldo -= valor
            println("Saque realizado no valor de $valor utilizando $valorLis do limite do cheque especial. Saldo atual é $saldo")
        }
    }
}