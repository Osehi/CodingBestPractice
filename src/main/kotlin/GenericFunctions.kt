

fun main() {
    val maxInt = findMAx(5, 10)
    val maxString = findMAx("apple", "banana")

    println("MaxInt is ${maxInt}")
    println("MaxString is ${maxString}")

    // Generuc
    val inBox = Box(42)
    val stringBox = Box("Kotlin how are you")

    // print
    println("inBox: ${inBox.getValue()} ")
    println("StringBox: ${stringBox.getValue()} ")

    workingWithGenericList()


}

// etring a generic function that take two parameters and return the maximum of the two

/*
fun <T> sumTwoValues(a: T, b: T) : T{
    return  (a+b)
}

 */

fun <T: Comparable<T>> findMAx(a: T, b: T): T {
    return if (a > b) a else b
}

// working with generic list
fun workingWithGenericList() {
    val genericList = mutableListOf<Any>()
    genericList.add(42)
    genericList.add("Hello Jotlin!")

    for (item in genericList) {
        println("${item}")
    }
}



//create a class
class Box<T>(private val value: T) {
    fun getValue(): T{
        return value
    }

}