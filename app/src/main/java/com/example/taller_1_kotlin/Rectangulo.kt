package com.example.taller_1_kotlin

//4.Encapsulamiento y Herencia:

//Crea una clase base FiguraGeometrica con propiedades privadas para el nombre y el color de la figura.
//Implementa métodos públicos establecerNombre(), obtenerNombre(), establecerColor()y obtenerColor()
// para manipular estas propiedades de manera segura.

//Crea subclases como Rectangulo, Circulo, etc., que hereden de FiguraGeometrica y tengan propiedades
//adicionales como longitud, ancho, radio, etc.


class Rectangulo(longitud: Double, ancho: Double, nombre: String, color: String) : FiguraGeometrica(nombre, color) {
    private var _longitud: Double = longitud
    private var _ancho: Double = ancho


    public fun setLongitud(longitud: Double) {
        this._longitud = longitud
    }
    public fun getLongitud(): Double {
        return this._longitud
    }


    public fun setAncho(ancho: Double) {
        this._ancho = ancho
    }
    public fun getAncho(): Double {
        return this._ancho
    }

    override fun toString(): String {
        return "${super.toString()}, la Longitud es: ${this._longitud}, Ancho: ${this._ancho}"
    }
}