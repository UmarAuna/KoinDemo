package com.koin.koindemo.scopefunction

fun main(){
    performWithOperation()
}

private fun performWithOperation(){
    val person = with(Person()){
        return@with "THe name of the Person is: ${this.name}"
    }
    print(person)
}