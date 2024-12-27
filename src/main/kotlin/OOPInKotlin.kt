

fun main() {
    val person1 = Person("John", 25)
    println("Name: ${person1.name}, Age:${person1.age}")
    SingletonObject.doSomething()
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