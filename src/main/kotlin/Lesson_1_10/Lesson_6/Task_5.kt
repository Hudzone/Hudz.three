package Lesson_1_10.Lesson_6

const val ZERO_ATTEMPTS: Int = 0

fun main() {
    var userAttempts: Int = 3
    println("Докажите, что не робот :D. У вас $userAttempts попытки.")

    while (userAttempts > ZERO_ATTEMPTS) {
        userAttempts -= 1
        val numGen1: Int = (1..9).random()
        val numGen2: Int = (1..9).random()

        print("$numGen1 + $numGen2 = ")

        val userAnswer: Int = readln().toInt()

        if (userAnswer == (numGen1 + numGen2)) {
            println("Добро пожаловать!")
            return
        } else {
            println("Неверно! Осталось $userAttempts попытки.")
            continue
        }

    }

    println("Доступ запрещен!")
}