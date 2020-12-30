package com.koin.koindemo.enumclass

fun main(){
    for (day in DAYS.values()){
        println("${day.ordinal} = ${day.name}")
    }

    when(DAYS.FRIDAY){
        DAYS.SUNDAY -> println("Today is Sunday")
        DAYS.MONDAY -> println("Today is Monday")
        DAYS.TUESDAY -> println("Today is Tuesday")
        DAYS.WEDNESDAY -> println("Today is Wednesday")
        DAYS.THURSDAY -> println("Today is Thursday")
        DAYS.FRIDAY -> println("Today is Friday")
        DAYS.SATURDAY -> println("Today is Saturday")
        // Adding an else clause will generate a warning
    }
}

enum class DAYS{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}