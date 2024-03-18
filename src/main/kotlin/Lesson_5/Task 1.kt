package Lesson_5

fun main() {
    val firstNum: Int = (1..20).random()
    val secondNum: Int = (1..20).random()

    println("Докажите, что вы не робот :)")
    println("Сколько будет ${firstNum} + ${secondNum}")
    print("Ваш ответ: ")

    val userAnswer = readLine()!!.toInt()

    if (firstNum + secondNum == userAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}