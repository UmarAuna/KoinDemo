package com.koin.koindemo.sealedclass

sealed class Employee


data class Manager(
        val name: String,
        val age: Int,
        val team: List<String>): Employee()

class SeniorDev(
        val name: String,
        val age: Int,
        val projects: Int): Employee()

object JuniorDev: Employee()


interface SealedEnum<T> : Comparator<T> {
    //https://medium.com/livefront/sealed-enum-replacing-enums-in-kotlin-4c513e7e8db
    val values: List<T>

    fun ordinalOf(obj: T): Int

    fun nameOf(obj: T): String

    fun valueOf(name: String): T

    override fun compare(first: T, second: T) = ordinalOf(first) - ordinalOf(second)
}

fun main(){
    //https://blog.mindorks.com/learn-kotlin-sealed-classes
    val employee: Employee = SeniorDev("Umar", 20, 10)
    val message = when (employee){
        is Manager -> "Welcome ${employee.name}! You have ${employee.team.size} employees in your team"
        is SeniorDev -> "Welcome ${employee.name}! You have already ${employee.projects} projects under your belt!"
        //it is not required for SingleTon
        is JuniorDev -> "Welcome aboard! We wish you an awesome Experience!"
        //no else case is required since all cases are handled
    }
    println(message)
}