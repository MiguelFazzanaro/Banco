package br.com.digitalhouse.aula0409


fun main(){
    val cliente1 = Cliente("Jose", "Santos")
    val cliente2 = Cliente("Joao", "Silva")

    val contaCl1 = Conta(1,0F, cliente1)
    val contaCl2 = Conta(2,2000F, cliente2)

    contaCl1.depositar(10000F)
    contaCl1.sacar(150F)

    contaCl2.depositar(100F)
    contaCl2.sacar(1500F)

}