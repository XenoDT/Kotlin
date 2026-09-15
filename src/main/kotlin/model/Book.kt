package org.ies.tierno.model

import jdk.internal.agent.resources.agent

data class Book(
    val isbn: String,
    val titulo: String,
    var year: Int,
    var autores: Set<Autor>
) {
    fun hasAuthor(nif: String): Boolean{
        for (autor in autores){
            if (autor.nif == nif){
                return true
            }
        }
        return false
    }
}