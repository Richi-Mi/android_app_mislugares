package com.example.mislugares.helpers

import com.example.mislugares.model.Lugar

interface RepositorioLugares {
    fun elemento( id : Int ) : Lugar
    fun añade( lugar: Lugar )
    fun nuevo() : Int
    fun borrar( id : Int )
    fun tamaño() : Int
    fun actualizar( id: Int, lugar: Lugar )
}