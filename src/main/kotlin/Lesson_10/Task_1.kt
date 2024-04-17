package Lesson_10

fun main() {

    val player = (1..6).random()
    println("Игрок выбросил ${player} очков!")
    val computer = (1..6).random()
    println("Компьютер выбросил ${computer} очков!")

    val result = printResult(player, computer)
    println(result)

}


fun printResult(human: Int, bot: Int): String {
    return when {
        human > bot -> "Победило человечество!"
        human == bot -> "Хрупкое перемирие"
        else -> "Победила машина 🙁"
    }
}
