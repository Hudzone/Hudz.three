package Lesson_10

fun main() {
    var gamesCounter = 0
    var humanScore = 0
    var botScore = 0

    while (true) {
        ++gamesCounter
        val player = playerTurn()
        println("Игрок выбросил ${player} очков!")
        val computer = botTurn()
        println("Компьютер выбросил ${computer} очков!")

        val (updatedHumanScore, updatedBotScore) = results(player, computer, humanScore, botScore)
        humanScore = updatedHumanScore
        botScore = updatedBotScore


        if (gamesCounter >= 1) {
            print("Хотите бросить кости еще раз? Введите Да или Нет: ")
            val userChoice = readln()

            if (userChoice.equals("да", ignoreCase = true)) {
                continue
            } else {
                println("Результаты: человек - ${humanScore} очков, машина - ${botScore} очков.")
                break
            }
        }
    }

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

fun results(human: Int, bot: Int, humanScore: Int, botScore: Int) : Pair<Int, Int>{

    var updatedHumanScore = humanScore
    var updatedBotScore = botScore

    if (human > bot) {
        println("Победило человечество!")
        updatedHumanScore++
    } else if (human == bot) {
        println("Хрупкое перемирие")
    } else {
        println("Победила машина :( ")
        updatedBotScore++
    }

    return Pair(updatedHumanScore,updatedBotScore)
}