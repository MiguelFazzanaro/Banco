package br.com.digitalhouse.ola_mundo

fun main (){
    println (quem("miguel", 22))
}

fun quem(pessoa: String, idade: Int):String {
    val idadeRec = when (idade) {
        18 -> "tem 18 anos"
        28 -> "tem 28 anos"
        else -> "idade desconhecida"
    }

    return " ola $pessoa e idade $idadeRec"

}
