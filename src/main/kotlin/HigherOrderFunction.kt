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
}

fun filterTask(tasks: List<Task>, predicate: (Task) -> Boolean) : List<Task>{
    return tasks.filter(predicate)
}