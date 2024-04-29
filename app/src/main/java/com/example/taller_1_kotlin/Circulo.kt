package com.example.taller_1_kotlin

//4.Encapsulamiento y Herencia:

//Crea una clase base FiguraGeometrica con propiedades privadas para el nombre y el color de la figura.
//Implementa métodos públicos establecerNombre(), obtenerNombre(), establecerColor()y obtenerColor()
// para manipular estas propiedades de manera segura.

//Crea subclases como Rectangulo, Circulo, etc., que hereden de FiguraGeometrica y tengan propiedades
//adicionales como longitud, ancho, radio, etc.

class Circulo(Diametro: Double, Radio: Double, Cuerda: Double, color: String, nombre: String) : FiguraGeometrica(nombre, color) {
    private var _Diametro: Double = Diametro
    private var _Radio: Double = Radio
    private var _Cuerda: Double = Cuerda


    public fun setDiametro(Diametro: Double) {
        this._Diametro = Diametro
    }
    public fun getDiametro(): Double {
        return this._Diametro
    }


    public fun setRadio(Radio: Double) {
        this._Radio =  Radio
    }
    public fun getRadio(): Double {
        return this._Radio
    }

    public fun setCuerda(Cuerda: Double) {
        this._Cuerda =  Cuerda
    }
    public fun getCuerda(): Double {
        return this._Cuerda
    }

    override fun toString(): String {
        return "${super.toString()}, el diametro es: ${this._Diametro}, el  Radio es: ${this._Radio}, la Cuerda es: ${this._Cuerda}"
    }
}