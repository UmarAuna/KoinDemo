package com.koin.koindemo.scopefunction

fun main(){
    callChain()
    performLetOperation()
}

private fun callChain(){
    //“let” can also be used when we want to perform an operation on the result of a call chain.
    val numbers = mutableListOf("One", "Two", "Three", "Four", "Five", "Seven")
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
    }
}

var name: String? = "Abcd"
private fun performLetOperation(){
    val person = Person().let {
        //"The name of the Person is: ${it.name}"
        //personDetails.name = "NewName"
        return@let "The name of the Person is: ${it.name}"
    }
    print(person)

    // is it easily helps in providing null
    /*val name = Person().name?.let {
        "The name of the Person is: $it"
    }
    print(name)*/
}