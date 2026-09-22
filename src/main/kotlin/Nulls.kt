package org.ies.tierno

class Nulls {
    fun getOrZero(a:Int?): Int = a ?: 0
//    fun printName(nombre: String?){
//        nombre.let { println((nombre)) }
//        println("Nombre Desconocido")
//    }
//    fun printName(nombre: String?) = nombre.let {(println(it))} ?: println("Nombre desconocido")
    fun printName(nombre: String?) = println(nombre ?: "Nombre desconocido")
    fun getLength(nombre: String?):Int? = nombre?.length
    fun nullOrfirst(numbers: List<Int>):Int? = numbers.firstOrNull()
//    fun firstOrNull(number: List<Int>): Int? =  if (number.isEmpty()) null else number.first()
}