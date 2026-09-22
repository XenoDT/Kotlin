package org.ies.tierno

import org.ies.tierno.model.Student

class Colleccioneeeeeees {
//    fun createList(): List<String>{
//        var a = mutableListOf<String>()
//        a.add("As")
//        a.add("A41")
//        a.add("Aads")
//        a.add("Ajfp")
//        a.add("asfs")
//        for (ac in a){
//            println(ac)
//        }
//        return a
//    }
    fun createAndPrintList() {
        listOf("As", "A41", "Aads", "Ajfp", "asfs").forEach { println(it) }
    }
    fun findFirstOne(a: List<String>): String = a.first()

    fun findLastOne(a: List<String>): String= a.last()

    fun sum10(a: List<Int>): List<Int> = a.map { b -> b + 10}

    fun mapToEmails(students: List<Student>): List<String> = students.map { student -> student.email }

    fun filterByZipCode(students: List<Student>, zipCode: Int): List<Student> = students.filter { student -> student.zipCode == zipCode }.map { student -> student }

    fun evenNumber(numbers: List<Int>): List<Int> = numbers.filter { n -> n / 2 == 0 }
        .map { n -> n }
    fun suma(numbers: List<Double>): Double = numbers.reduce { acc, d -> acc + d }

    fun avg(numbres: List<Double>): Double = numbres.let { numbres.average() }
        //if (numbres.isEmpty()) null else numbres.average()

    fun max(numbers: List<Double>): Double =  numbers.max()

    fun min(numbers: List<Double>): Double =  numbers.min()

    fun junction(numbers1: List<Double> , numbers2: List<Double>): List<Double> = numbers1.intersect(numbers2).toList()

    fun preciodePedidos(orders: List<Order>): List<Double> = orders.map { order -> order.price }

    fun precioTotal(orders: List<Order>): Double = orders.map { order -> order.price }.reduce { acc, d -> acc + d }

    fun getItems(orders: List<Order>): List<OrderItem> = orders.flatMap { order -> order.items }

}
data class Order(val id: Int, val price: Double, val items: List<OrderItem>)
data class OrderItem(val itemId: Int, val price: Double)