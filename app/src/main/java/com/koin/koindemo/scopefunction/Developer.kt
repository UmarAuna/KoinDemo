package com.koin.koindemo.scopefunction

class Developer() {
    var developperName: String = "Umar Saidu Auna"
    var developerContactNumber: String = "07063055189"
    var developerAddress: String = "Tarauni"
    fun displayInfo() = print("\n Name: $developperName " +
            "\n Contact Number: $developerContactNumber \n" +
            " Address: $developerAddress"
    )
}