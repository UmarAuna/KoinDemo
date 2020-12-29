package com.koin.koindemo.scopefunction

fun main(){
    performAlsoOperation()
}

private fun performAlsoOperation(){
    val name = Person().also { currentPerson ->
        print("Current name is: ${currentPerson.name}\n")
        currentPerson.name = "modifiedName"
        //let accepts a return statement whereas “also” does not accept a return statement
        //return@also "Returning a string"
    }.run {

        "Modified name is: $name\n"
    }
    print(name)
}