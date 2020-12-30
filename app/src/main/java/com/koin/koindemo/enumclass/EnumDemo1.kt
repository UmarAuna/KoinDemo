package com.koin.koindemo.enumclass

fun main(){
    val color = Cards.Diamond.color
    println(color)
}

enum class Cards(val color: String){
    Diamond("black"),
    Heart("red")
}

