package com.example.kotlinintronadiavinabal

// 1. Herencia y polimorfismo básicos
open class Animal(val name: String) {
    open fun makeSound() {
        // TODO: Imprimir "El animal hace un sonido"
        println("El animal hace un sonido")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        // TODO: Imprimir "$name ladra"
        println("$name ladra")
    }
}

// 2. Colecciones en Kotlin
fun collectionOperations() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    // TODO: Agregar el número 6 a la lista
    numbers.add(6)
    println(numbers)
    // TODO: Remover el número 2 de la lista
    numbers.remove(2)
    println(numbers)
    // TODO: Usar map para duplicar los valores
    val duplicados = numbers.map { it * 2 }
    println(duplicados)
    // TODO: Usar filter para obtener solo los números impares
    val impares = numbers.filter { num -> num % 2 != 0 }
    println(impares)
}

// 3. Clases de datos y destructuración
data class Person(val name: String, val age: Int)

fun dataClassExample() {
    val person1 = Person("Juan", 30)
    // TODO: Crear una copia de person1 con otro nombre
    val persona2 = person1.copy("nadia")
    println(persona2)
    // TODO: Comparar person1 con su copia
    println(persona2.equals(person1))
    println(persona2 == person1)
    // TODO: Usar destructuración para obtener name y age
    val (name, age) = person1
    println("Name: $name Age $age")

    val (name1, age1) = persona2
    println("Name: $name1 Age $age1")
}

fun main() {
    // Herencia y polimorfismo
    val dog = Dog("Firulais")
    dog.makeSound()

    // Colecciones
    collectionOperations()

    // Clases de datos y destructuración
    dataClassExample()
}
