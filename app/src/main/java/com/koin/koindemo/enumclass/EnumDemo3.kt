package com.koin.koindemo.enumclass

fun main(){
    //https://typealias.com/start/kotlin-enum-classes/
    val breed: SchnauzerBreed = SchnauzerBreed.GIANT
    println(breed)
    println(describe(SchnauzerBreed.MINIATURE))
    println(SchnauzerBreed.MINIATURE.height)

    println()

    println(SchnauzerBreed.STANDARD.family)
    println(SchnauzerBreed.STANDARD.isShorterThan(40))
    describes(SchnauzerBreed.STANDARD)

    //When this code runs, if you were to call valueOf() with a string that doesn’t match any entries, you’ll get an error.
    val nameofBread = "STANDARD"
    val breed2 = SchnauzerBreed.valueOf(nameofBread)
    println(breed2.height)



}

fun describes(breed: SchnauzerBreed){
    println(breed.name)
    println(breed.height)
}

fun describe(breed: SchnauzerBreed) = when(breed){
    SchnauzerBreed.MINIATURE -> "Small"
    SchnauzerBreed.STANDARD -> "Medium"
    SchnauzerBreed.GIANT    -> "large"
}

enum class SchnauzerBreed(val height: Int){
    MINIATURE(33),
    STANDARD(47),
    GIANT(65);

    val family: String = "Schnauzer"

    fun isShorterThan(centimeters: Int) = height <  centimeters
}
