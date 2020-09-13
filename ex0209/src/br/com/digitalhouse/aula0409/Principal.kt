package br.com.digitalhouse.aula0409

fun main() {

    val eu = Pessoa()

    println("Ola ${eu.nome} ${eu.sobrenome}, voce tem ${eu.idade} anos")

    eu.idade = 32
    eu.sobrenome = "Santos"
    println("Passou um ano...")
    println("Ola ${eu.nome} ${eu.sobrenome}, voce tem agora ${eu.idade} anos")

    val dog = Cachorro("Vira-lata", 5,"Doguinho")

    println("O cachorro ${dog.nome} tem ${dog.idade} anos e é da raça ${dog.raca}")
    dog.idade = 6
    println("Passou um ano...")
    println("O cachorro ${dog.nome} agora tem ${dog.idade} anos")
}