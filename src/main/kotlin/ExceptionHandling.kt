import java.lang.ArithmeticException

fun main() {

    val userInout = getUserInput()
    println("User entered: ${userInout}")

    /*
    val answer = divide(10,0)
    println("See the answer: ${answer}")

     */

}
/**
 * Handling Exceptions in
 */

fun divide(a: Int, b: Int): Int {
    return try {
        // Code that might cause an issue (e.g., division by zero)
        a/b
    } catch (e: ArithmeticException) {
        // Code to handle the issue (e.g., print an error message)
        // t is used for code that should execute regardless of what happens.
        -1
    } finally {
        // Code that always runs, whether there's an issue or not
    }

}

fun getUserInput() : Int{
    return  try {
        // Attempting to read a number from the user
        print("Enter a number: ")
        readLine()!!.toInt()
    } catch (e:ArithmeticException) {
        println("Error: not a valid number!")
        0
    }

}
