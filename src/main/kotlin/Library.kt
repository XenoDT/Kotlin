package org.ies.tierno

import com.sun.org.apache.xpath.internal.operations.Bool
import javax.swing.Box

data class Library(
    var nombre: String,
    var libros: List<Book>
) {
    fun hasBook(isbn: String): Boolean{
        for (libro in libros){
            if (libro.isbn == isbn){
                return true
            }
        }
        return false
    }
    fun hasAuthor(nif: String): Boolean{
        for(libro in libros){
            if (libro.hasAuthor(nif)){
                return true
            }
        }
        return false
    }
    fun countBooks(nif: String): Int{
        var count = 0
        for (l in libros){
            if (l.hasAuthor(nif)){
                count++
            }
        }
        return count
    }
    fun countYearBooks(year :Int):Int{
        var count = 0
        for(l in libros){
            if (l.year == year){
                count++
            }
        }
        return count
    }
}