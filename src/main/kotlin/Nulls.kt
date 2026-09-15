package org.ies.tierno

class Nulls {
    fun getOrZero(a:Int?): Int? = a ?: 0
    fun printName(nombre: String?){
        nombre.let { println((nombre)) }
        println("Nombre Desconocido")
    }
    fun getLength(nombre: String?):Int? = nombre?.length
    fun firstOrNull(number: List<Int>): Int? = return if (number.isEmpty()) null else number.first()
}