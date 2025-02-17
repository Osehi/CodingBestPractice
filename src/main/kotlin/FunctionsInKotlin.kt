

fun main() {
    val userList = listOf(
        User(1, "Alice", 25),
        User(2, "Bob", 30),
        User(3, "Charlie", 22),
        User(4, "David", 35)
    )

    val olderThan25 = userList.filterUsers { it.age > 25 }
    println("Users older than 25: ${olderThan25}")

    val nameStartsWithA = userList.filterUsers { it.name.startsWith("A", ignoreCase = true) }
    println("Print users with name starting with A: ${nameStartsWithA}")

}

/**
 * Topic: Functions
 * =>> What sre the types of functions
 * a. public, private, internal, local, higher-Order, extension function,
 */

data class User(
    val id: Int,
    val name: String,
    val age: Int
)

fun List<User>.filterUsers(condition:(User) -> Boolean): List<User> {
    return  this.filter(condition)

}