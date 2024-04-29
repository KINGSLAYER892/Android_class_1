package com.example.taller_1_kotlin




//1.Encapsulamiento:

//Define una clase Personacon propiedades privadas para el nombre y la edad
//implementa métodos públicos establecerNombre(), obtenerNombre(), establecerEdad()y obtenerEdad()
// para manipular estas propiedades de manera segura.

open class Persona(private var _Nombre: String, private var _Edad: Int) {
    public fun getNombre(): String {
        return this._Nombre
    }

    public fun setNombre(Nombre: String) {
        this._Nombre = Nombre
    }

    public fun getEdad(): Int {
        return this._Edad
    }

    public fun setEdad(Edad: Int) {
        this._Edad = Edad
    }

    override fun toString(): String {
        return "Nombre: ${this._Nombre}, Edad: ${this._Edad}"
    }
}



