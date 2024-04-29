package com.example.taller_1_kotlin

fun main() {
    val estudiante = Estudiante("12º", "Juan", 18)
    println(estudiante)
    estudiante.realizarTarea()

    val empleado = Empleado()
    empleado.realizarTarea()


    val rectangulo = Rectangulo(5.0, 3.0, "Rectángulo", "Azul")
    println(rectangulo)

    val Circulo= Circulo(10.0,5.0,6.0,"Rojo","circulo")
    println(Circulo)

    val gerente = Gerente("Kevin", "Sanmartin", 50000, 10000)
    val vendedor = Vendedor("Juan", "Garcia", 30000, 200, 100.0)
    println(gerente)
    println(vendedor)

}