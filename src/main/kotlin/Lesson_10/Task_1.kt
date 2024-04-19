package Lesson_10

fun main() {

    val player = throwTheDice()
    println("Игрок выбросил ${player} очков!")
    val computer = throwTheDice()
    println("Компьютер выбросил ${computer} очков!")

    val result = getResult(player, computer)
    println(result)

}

fun throwTheDice(): Int {
    val yourScore = (1..6).random()
    return yourScore
}

fun getResult(human: Int, bot: Int): String {
    return when {
        human > bot -> "Победило человечество!"
        human == bot -> "Хрупкое перемирие"
        else -> "Победила машина 🙁"
    }
}
