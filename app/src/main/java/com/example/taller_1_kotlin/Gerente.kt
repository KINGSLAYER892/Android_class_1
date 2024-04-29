package com.example.taller_1_kotlin
//5.Herencia y Polimorfismo:
//Define una clase Empleado con propiedades como nombre, salario, etc.
//Crea subclases como Gerente, Vendedor, etc., que hereden de Empleado.
//Implementa el método calcularSalario()en cada subclase de la siguiente manera:
// -En Gerente, calcula el salario base más un bono.
//- En Vendedor, calcula el salario base más una comisión sobre las ventas.
//- En otras subclases, define reglas específicas para calcular el salario.

class Gerente(nombre: String, apellido: String, private val salarioBase: Int, private val bono: Int) : Empleado2(nombre, apellido) {
    override fun calcularSalario(): Int {
        return salarioBase + bono
    }

    override fun toString(): String {
        return "${super.toString()}, Salario: ${calcularSalario()}"
    }
}