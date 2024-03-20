package Lesson_5

fun main() {
    val firstNum: Int = 13
    val secondNum: Int = 40

    println("Угадайте два числа от 0 до 42 и получите приз!")
    print("Первое число: ")
    val firstUserNum: Int = readLine()!!.toInt()
    print("Второе число: ")
    val secondUserNum: Int = readLine()!!.toInt()

    when {
        (firstUserNum == firstNum || firstUserNum == secondNum) &&
                (secondUserNum == firstNum || secondUserNum == secondNum) ->
            println("Поздравляю! Вы выиграли главный приз!")

        (firstUserNum == firstNum || firstUserNum == secondNum) ||
            (secondUserNum == firstNum || secondUserNum == secondNum) ->
            println("Вы выиграли утешительный приз!")

        else -> println("Неудача!")
    }
}