package com.example.taller_1_kotlin

//2.Herencia:

//Crea una clase Estudiante que herede de la clase Persona.
//Agrega una propiedad adicional para el grado del estudiante.
//Sobrescribe el método toString()para incluir el grado del estudiante al describirlo.


class Estudiante(grado: String, Nombre: String, Edad: Int) : Persona(Nombre, Edad), Trabajador {
    private var _grado: String = grado

    override fun toString(): String {
        return "${super.toString()}, Grado: $_grado"
    }

    override fun realizarTarea() {
        println("Realizando tarea escolar")
    }
}