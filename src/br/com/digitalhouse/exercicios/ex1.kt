package br.com.digitalhouse.exercicios

fun main (){
    println (analise(4,7,2))
}

fun analise (num1: Int, num2: Int, num3: Int): Int {
    if (num1 > num2 && num1 > num3){
        return num1
    }
    else if (num2 > num1 && num2 > num3){
        return num2
    }
    else if (num3 > num1 && num3 > num2){
        return num3
    }
    else {
        return 0
    }
}