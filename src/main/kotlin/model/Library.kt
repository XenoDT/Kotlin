package org.ies.tierno.model

data class Library(var nombre: String,var libros: List<Book>) {
    fun hasBook(isbn: String): Boolean = libros.any {libro -> libro.isbn == isbn}

    fun hasAuthor(nif: String): Boolean = libros.any { libro -> libro.hasAuthor(nif)}
    fun countBooks(nif: String): Int = libros.count()
    fun countYearBooks(year :Int):Int = libros.count{  libro -> libro.year == year}
}
data class Book(val isbn: String,val titulo: String,var year: Int,var autores: Set<Autor>) {
    fun hasAuthor(nif: String): Boolean =
        autores.any {autor -> autor.nif == nif }
}

data class Autor(var nif: String,var nombre: String,var apellidos: String) {}