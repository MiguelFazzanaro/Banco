package br.com.digitalhouse.ola_mundo

fun main (){
    println (quem("miguel", 18))
}

fun quem(pessoa: String, idade: Int):String {
    val idadeRec = when (idade) {
        18 -> ", voce tem 18 anos!"
        28 -> ", voce tem 28 anos!"
        else -> ", nao sei sua idade :("
    }

    return " ola $pessoa $idadeRec"

}
