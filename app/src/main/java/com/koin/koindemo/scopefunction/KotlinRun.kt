package com.koin.koindemo.scopefunction

fun main(){
    performRunOperator()
}

var names: String? = "Umar Auna"
private fun performRunOperator(){
    Person().run {
        name = "Umar"
        contactNumber = "+2347063055189"
        return@run "The details of the Person is: ${displayInfo()}"
    }

  /*  val name = Person().name.run {
      "This name of the Person is $this"
    }
    print(name)*/
}