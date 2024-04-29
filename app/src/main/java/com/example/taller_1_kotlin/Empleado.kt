package com.example.taller_1_kotlin


//3.Polimorfismo:

//Define una interfaz Trabajador con un método realizarTarea().
//Implementa la interfaz en las clases Estudiante y Empleado.
//En la implementación de realizarTarea()de Estudiante, imprime "Realizando tarea escolar".
//En la implementación de realizarTarea()de Empleado, imprime "Realizando tarea laboral".


class Empleado : Trabajador {
    override fun realizarTarea() {
        println("Realizando tarea laboral")
    }
}