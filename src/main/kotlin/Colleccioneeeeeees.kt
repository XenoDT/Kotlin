package org.ies.tierno

class Colleccioneeeeeees {
    fun createList(): List<String>{
        var a = mutableListOf<String>()
        a.add("As")
        a.add("A41")
        a.add("Aads")
        a.add("Ajfp")
        a.add("asfs")
        for (ac in a){
            println(ac)
        }
        return a
    }
    fun findFirstOne(a: List<String>): String{
        return  a.first()
    }
    fun findLastOne(a: List<String>): String{
        return a.last()
    }
    fun sum10(a: List<Int>): List<Int> {
        return a.map { b -> b + 10}
    }
    fun mapToEmails(students: List<Student>): List<String>{
        return students.map { student -> student.email }
    }
    fun filterByZipCode(students: List<Student>,  zipCode: Int): List<Student>{
        return students.filter { student -> student.zipCode == zipCode }
            .map { student -> student }
    }
    fun evenNumber(numbers: List<Int>): List<Int> = numbers.filter { n -> n / 2 == 0 }
        .map { n -> n }
    fun suma(numbers: List<Double>): Double{
        if (numbers.isEmpty()){
            return 0.0
        }
        var sum = 0.0
        for (n in numbers){
            sum += n
        }
        return numbers.sum()
    }
    fun avg(numbres: List<Double>): Double?{
        return if (numbres.isEmpty()) null else numbres.average()
    }
    fun max(numbers: List<Double>): Double?{
        return numbers.max()
    }
    fun min(numbers: List<Double>): Double?{
        return numbers.min()
    }
    fun junction(numbers1: List<Double> , numbers2: List<Double>): List<Double>{
        return numbers1.intersect(numbers2).toList()
    }
    fun preciodePedidos(orders: List<Order>): List<Double>{
        return orders.map { order -> order.price }
    }
    fun precioTotal(orders: List<Order>): Double{
        var sum = 0.0
        for (o in orders){
            sum += o.price
        }
        return sum
    }
    fun getItems(orders: List<Order>): List<OrderItem> = orders.flatMap { order -> order.items }

}
data class Order(val id: Int, val price: Double, val items: List<OrderItem>)
data class OrderItem(val itemId: Int, val price: Double)