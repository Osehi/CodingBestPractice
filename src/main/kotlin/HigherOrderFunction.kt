data class Task(
    val id: Int,
    val description: String,
    val priority: Int
)

fun main() {
    val tasks = listOf(
        Task(1, "Complete project", 2),
        Task(2, "Read a book", 1),
        Task(3, "Go for a run", 3),
        Task(4, "Write a report", 2)
    )

    // testing a basic higher-order function
    higherOrderFunction { a, b -> a + b}

    // another example of higherOrder function
    val output = operateNumbers(5, 3, ::add)
    println(" This is the output: ${output}")
}

fun filterTask(tasks: List<Task>, predicate: (Task) -> Boolean) : List<Task>{
    return tasks.filter(predicate)
}

/**
 * Fundamentals of HigherOrderFunction
 * a higher-order functions can take other functions as parameters
 */

fun higherOrderFunction(operation: (Int, Int) -> Int) {
    val result = operation(5,3)
    println("Result is ${result}")

}

/**
 * Another example
 */

fun operateNumbers(a: Int, b: Int, operation: (Int, Int) -> Int) : Int{
    val result = operation(a, b)
    return result

}

fun add(a: Int, b:Int): Int {
    return a + b
}

fun multiply(a: Int, b:Int) : Int {
    return  a * b
}