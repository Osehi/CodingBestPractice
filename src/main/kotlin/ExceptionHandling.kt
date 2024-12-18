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

// Custom exception for insufficient funds
class InsufficientFundsException(accountNumber: String, requiredNumber: Double, availableBalance: Double):
    Exception("Account ${accountNumber} does not have sufficient fund. Required: ${requiredNumber} , Available balance: ${availableBalance}" )

// Custom exception for invalid account number
class InvalidAccountNumberException(accountNumber: String) :
    RuntimeException("Invalid account number: $accountNumber")

// Custom exception for transaction limit exceeded
class TransactionLimitExceededException(limit: Double) :
    RuntimeException("Transaction limit exceeded. Maximum allowed: $limit")

/**
 * You can handle the following exceptions:
 * 1. File I/O Exception
 * 2. Kotlin Network Operations and Exception handling.
 * 3. Kotlin Database Interaction Exception.
 */