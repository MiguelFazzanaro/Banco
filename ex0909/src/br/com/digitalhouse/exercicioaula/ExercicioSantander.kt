package br.com.digitalhouse.exercicioaula

fun main() {
    var cliente1 = Clientes(1234, "José", "Silva", "11.123.456-x", "123.123.123-12")
    var cliente2 = Clientes(4567, "João", "Santos", "22.123.456-x", "456.456.456-45")
    var contacl1 = ContaP(10F, cliente1,1000F)
    var contacl2 = ContaC(500F,cliente2, 2000F)

    contacl1.mostrarSaldo()
    contacl1.recolheJuros()
    contacl1.depositar(1000F)
    contacl1.sacar(1000F)
    contacl1.sacar(2300F)

    println("-----------------------------------")

    contacl2.mostrarSaldo()
    contacl2.depositarCheque(500F,"Banco X", "10/09/20")
    contacl2.depositar(500F)
    contacl2.sacar(2000F)
    contacl2.sacar(1300F)
    contacl2.sacar(100F)
    contacl2.depositar(1500F)

}