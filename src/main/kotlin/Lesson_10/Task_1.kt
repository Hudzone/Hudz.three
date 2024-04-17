package Lesson_10

fun main() {
    val player = playerTurn()
    println("Игрок выбросил ${player} очков!")
    val computer = botTurn()
    println("Компьютер выбросил ${computer} очков!")

    results(player, computer)

}

fun randomValue() : Int = (1..6).random()

fun playerTurn() : Int {
    val score = randomValue()
    return score
}

fun botTurn() : Int {
    val score = randomValue()
    return score
}

fun results(human: Int, bot: Int) {
    if (human > bot) {
        val goodEnd = println("Победило человечество!")
        return goodEnd
    } else if (human == bot) {
        val neutralEnd = println("Хрупкое перемирие")
        return neutralEnd
    } else {
        val badEnd = println("Победила машина :( ")
        return badEnd
    }
}