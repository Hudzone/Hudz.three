package Lesson_1_10.Lesson_7

fun main() {
    val authCodeSource = 1000..9999

    do {
        val randomCode = authCodeSource.random()
        println("Ваш код авторизации: $randomCode")

        print("Введите код: ")
        val userConfirmation: Int = readln().toInt()

        if (userConfirmation != randomCode) {
            println("Код введен неверно!")
            continue
        }

    } while (userConfirmation != randomCode)

    println("Код введен верно!")
}