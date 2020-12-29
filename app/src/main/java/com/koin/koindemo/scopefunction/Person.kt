package com.koin.koindemo.scopefunction

class Person {
    var name: String = "Umar Saidu Auna"
    var contactNumber: String = "07063055189"
    var address: String = "Tarauni"
    fun displayInfo() = print("\n Name: $name " +
            "\n Contact Number: $contactNumber \n" +
            " Address: $address"
    )
}