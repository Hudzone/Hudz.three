package Lesson_10

fun main() {
    var gameCounter = 0
    var humanWins = 0
    var botWins = 0

    while (true) {
        gameCounter++
        val player = (1..6).random()
        println("Игрок выбросил ${player} очков!")
        val computer = (1..6).random()
        println("Компьютер выбросил ${computer} очков!")

        val (updatedHumanScore, updatedBotScore) = results(player, computer, humanWins, botWins)
        humanWins = updatedHumanScore
        botWins = updatedBotScore

        if (gameCounter >= 1) {
            print("Хотите бросить кости еще раз? Введите Да или Нет: ")
            val userChoice = readln()

            if (userChoice.equals("да", ignoreCase = true)) {
                continue
            } else {
                println("Результаты: человек - ${humanWins} очков, машина - ${botWins} очков.")
                break
            }
        }

    }
}


fun results(human: Int, bot: Int, humanScore: Int, botScore: Int): Pair<Int, Int> {

    var updatedHumanScore = humanScore
    var updatedBotScore = botScore

    when {
        human > bot -> {
            println("Победило человечество!")
            updatedHumanScore++
        }

        human == bot -> println("Хрупкое перемирие")
        else -> {
            println("Победила машина 🙁")
            updatedBotScore++
        }
    }

    return Pair(updatedHumanScore, updatedBotScore)
}