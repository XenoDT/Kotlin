package org.ies.tierno

import org.ies.tierno.model.Autor
import org.ies.tierno.model.Library
import org.ies.tierno.model.Book

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    var colect = Colleccioneeeeeees()
    var nuull = Nulls()
//    colect.createList()
    val a = listOf<Int>(43534,2,3,4)
    val a2 = listOf<Double>(2.0,3.0,3.0,2.0)
    val aNull = listOf<Double>()
    val aNull2 = listOf<Int>()
    nuull.getOrZero(2)
    val b = nuull.getLength("Pepe")
    nuull.printName("Pepe")
    val c = nuull.nullOrfirst(aNull2)
    println(b)
    println(c)
    val d = nuull.avg(aNull)
    println(d)
//    extracted1()
}

private fun extracted1() {
    var library = Library(
        "JuanCosta", listOf(
            Book(
                "1x", "DragonBall", 1984, setOf(
                    Autor("1x", "Toriyama", "Akira")
                )
            ),
            Book(
                "2x", "La aventura de pepito", 2004, setOf(
                    Autor("1x", "Toriyama", "Akira"),
                    Autor("2x", "V", "V")
                )
            )
        )
    )
    var a = library.hasAuthor("1x")
    var b = library.hasBook("1x")
    var c = library.countBooks("1x")
    var d = library.countYearBooks(2004)
    var nums = listOf<Int>(c, d)
    printNumbers(nums)
    println(a)
    println(b)
    val sum4: (Int, Int) -> Int = { a, b ->
        println("operando con $a y $b")
        a + b
    }
    println(sum4(2, 1))
}

private fun extracted() {
    var x = 6
    var y = 9
    val sum = sumar(x, y)
    val suma = sumatorio(x)
    val fact = factorio(x)
    val avg = avg(x, y, x, y)
    var numbers = listOf(sum, suma, fact, avg)
    printNumbers(numbers)
}

fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun printNumber(a: Int) {
    println("El resultado es: $a")
}
fun printNumbers(a: List<Int>){
    for (number in a){
        printNumber(number)
    }
}
fun sumatorio(a: Int): Int {
    var count = 0
    for (i in count..a) {
        count += i
    }
    return count
}
fun factorio(a: Int): Int {
    var count = 1
    for (i in count..a) {
        count *= i
    }
    return count
}
fun avg(a: Int,b: Int,c: Int,d: Int): Int = (a+b+c+d)/4