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

    // 1. Filter tasks based on priority
    val highPriorityTasks = filterTasks(tasks) { task -> task.priority > 2 }
    printTasks("High Priority Tasks:", highPriorityTasks)

    // 2. Transform task descriptions to uppercase
    val uppercaseDescriptions = transformTasks(tasks) { task -> task.description.toUpperCase() }
    printTasks("Uppercase Descriptions:", uppercaseDescriptions)

    // 3. Find a task with the highest priority
    val highestPriorityTask = ffindHighestPriorityTaskk(tasks)
    println("Task with the highest priority: $highestPriorityTask")


    printFormattedTasks(tasks){  task -> "${task.id}: ${task.description} [Priority: ${task.priority}]"}

    

        // testing a basic higher-order function
    higherOrderFunction { a, b -> a + b}

    // another example of higherOrder function
    val output = operateNumbers(5, 3, ::add)
    println(" This is the output: ${output}")

    // see the even numbers
    println("See all the even numbers: ${evenNumbers}")
    // see the odd numbers
    println("See all the odd numbers: ${oddNumbers}")
    // filtered names
    println("original names: ${names}")
    println("Filtered names (starting with letter) 'O': ${filteredName}")

}

fun filterTasks(tasks: List<Task>, predicate: (Task) -> Boolean) : List<Task>{
    return tasks.filter(predicate)
}

fun transformTasks(tasks: List<Task>, transformL:(Task) -> String): List<String> {
    return tasks.map(transformL)
}

// Higher-order function to find the task with the highest priority
fun ffindHighestPriorityTaskk(tasks: List<Task>) : Task?{
    return tasks.maxByOrNull { it.priority }
}

// Higher-order function to print tasks with a custom formatter
fun printFormattedTasks(tasks: List<Task>, formatter: (Task) -> String) {
    return tasks.forEach { task ->
        println(formatter(task))
    }

}

fun  printTasks(header: String, tasks: List<*>) {
    println(header)
    tasks.forEach { println(it)}
    println()

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
/**
 * Lambda
 */
// filtering a list
val numbers = listOf(1,2,3,4,5,6)
val evenNumbers = numbers.filter { it % 2 == 0 }
val oddNumbers = numbers.filter { it % 2  != 0 }

// using a list of names example
val names = listOf("Osehiase", "Ehizokhale", "Oseghale", "Oseremen", "Emoiyua")
val filteredName = names.filter { name -> name.startsWith("O") }