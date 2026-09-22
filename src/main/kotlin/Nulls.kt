package org.ies.tierno

class Nulls {
    fun getOrZero(a:Int?): Int = a ?: 0
//    fun printName(nombre: String?){
//        nombre.let { println((nombre)) }
//        println("Nombre Desconocido")
//    }
    fun printName2(nombre: String?) =
        println(nombre ?: "Nombre desconocido")
    fun printName(nombre: String?) =
        println(nombre ?: "Nombre desconocido")
    fun getLength(nombre: String?):Int? =
        nombre?.length
    fun nullOrfirst(numbers: List<Int>):Int? =
        numbers.firstOrNull()
//    fun firstOrNull(number: List<Int>): Int? =  if (number.isEmpty()) null else number.first()
    fun avg(numbres: List<Double>): Double? =
        if (numbres.isEmpty()) null else numbres.average()

    fun max(numbers: List<Double>): Double? =
        if (numbers.isEmpty()) null else numbers.max()

    fun min(numbers: List<Double>): Double? =
        if (numbers.isEmpty()) null else numbers.min()
}
