package Lesson_6

import kotlin.ranges.random as random

const val CURRENT_ATTEMPTS: Int = 5
fun main() {
    println("===ПАЖИЛАЯ=УГАДАЙКА===")
    val randNumber: Int = (1..9).random()
    var attempts: Int = 1

    println("Угадай число от 1 до 9 =P")
    while (attempts <= 5) {
        val attemptsLeft: Int = CURRENT_ATTEMPTS - attempts
        println("Попытка ${attempts++}")
        print("Ваше предположение: ")
        val userChoice: Int = readln().toInt()

        if (userChoice != randNumber) {
            println("Неверно! Осталось $attemptsLeft попыток.")
        } else {
            println("Это была великолепная игра!")
            return
        }

    }

    println("Было загадано число $randNumber.")

}