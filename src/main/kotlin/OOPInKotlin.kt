

fun main() {
    val person1 = Person("John", 25)
    println("Name: ${person1.name}, Age:${person1.age}")
    SingletonObject.doSomething()

        // an instance of a citizen
    val firstCitizenName = Citizen().name
    val firstObjectCitizen = Citizen().introduce()
    println("Here is the name of the Citizen: ${firstCitizenName}")
    println("Here is the introduction: ${Citizen().introduce()}")
}

class Person(
    val name: String,
    val age:Int
)
/**
 * Kotlin Class and OOP
 * The keyword - object, is used to create a singleton.
 * A singleton has only one instance.
 * => What are the ways of creating  object in kotlin.
 * 1. Use object -keyword to create a Singleton , just one instance of an object needed throughout the lifecycle of an app
 * 2. Dependency Injection = DI
 * 3. Basic Class Instantiation. [ for a usecase where a multiple instance are needed.]
 * 4. Anonymous Class Instantiation. => just for a one time usage.
 * 4.
 */

object SingletonObject {
    fun doSomething() {
        println("Singlet object is doing something")
    }
}

/**
 * Inheritance = is the transfer of properties and functions
 */

open class Animal {

}

class Dog : Animal() {

}

class Citizen {

    var name: String = "John"
        private set


    fun introduce() {
        println("Hello, my name is $name")
    }

}

/**
 * Polymorphysm -  as the name implies many forms.
 * a method or function can be used to perform many actions - different actions. Through overriding and overloading.
 */

open class Shape {
    open fun draw() {
        println("Draw a shape")
    }
}

class Circle: Shape() {
    override fun draw() {
        println("Draw a Circle")
    }
}

/**
 * Abstraction - it tis uded to hide complexities and expose only neccessary functionalities.
 * Interface abd abstract classes are used to implement this feature
 */