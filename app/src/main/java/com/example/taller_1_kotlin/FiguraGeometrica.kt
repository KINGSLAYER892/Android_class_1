package com.example.taller_1_kotlin

//4.Encapsulamiento y Herencia:

//Crea una clase base FiguraGeometrica con propiedades privadas para el nombre y el color de la figura.
//Implementa métodos públicos establecerNombre(), obtenerNombre(), establecerColor()y obtenerColor()
// para manipular estas propiedades de manera segura.

//Crea subclases como Rectangulo, Circulo, etc., que hereden de FiguraGeometrica y tengan propiedades
//adicionales como longitud, ancho, radio, etc.



open class FiguraGeometrica(private var _nombre: String, private var _color: String) {

    public fun setNombre(nombre: String) {
        this._nombre = nombre
    }
    public fun getNombre(): String {
        return this._nombre
    }


    public fun setColor(color: String) {
        this._color = color
    }
    public fun getColor(): String {
        return this._color
    }

    override fun toString(): String {
        return "Nombre: ${this._nombre}, Color: ${this._color}"
    }
}