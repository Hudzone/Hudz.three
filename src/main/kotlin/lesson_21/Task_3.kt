package lesson_21


fun main() {

    val user = Player("John Doe", 50)
    val user2 = Player("Samuel Doe", 100)

    println(user.isHealthy())
    println(user2.isHealthy())

}

class Player(
    val name: String,
    var currentHp: Int,
    val maxHp: Int = 100,
)

fun Player.isHealthy(): Boolean {

    if (currentHp == maxHp) {
        return true
    } else {
        return false
    }

}