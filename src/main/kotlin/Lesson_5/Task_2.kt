package Lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2024

fun main() {
    print("Введите ваш год рождения: ")
    val yearOfBirth: Int = readLine()!!.toInt()
    val calculateAge: Int = CURRENT_YEAR - yearOfBirth

    if (calculateAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен")
    }

}