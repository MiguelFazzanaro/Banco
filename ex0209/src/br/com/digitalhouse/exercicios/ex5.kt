package br.com.digitalhouse.exercicios

fun main (){
    println(abcd(1,2,3,4))
    println(abcd(5,2,3,4))
    println(abcd(1,5,3,4))
}

fun abcd (numA: Int,numB: Int,numC: Int,numD: Int) : Boolean{
    return ((numA > numC && numA > numD) ||(numB > numC && numB > numD))
}