package com.koin.koindemo.scopefunction

fun main(){
    performApplyOperation()
    println()
    getDeveloper()
}

fun getDeveloper(): Developer{
    return Developer().apply {
        developperName = "Auna Saidu"
        developerAddress = "Kano State"
        developerContactNumber = "+2347063055189"
        displayInfo()
    }
}

private fun performApplyOperation(){
    val person = Person().apply{
        name ="Umar Auna"
        contactNumber = "234"
        address = "Hotoro"
        displayInfo()
       //run accepts a return statement whereas “apply” does not accept a return statement
        //return@apply "Returning a string instead of the Person Object"
    }
    print(person)
}