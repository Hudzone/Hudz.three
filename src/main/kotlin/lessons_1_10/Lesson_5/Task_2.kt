package lessons_1_10.Lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = 2024

    print("Введите ваш год рождения: ")
    val yearOfBirth: Int = readln().toInt()
    val calculateAge: Int = currentYear - yearOfBirth

    if (calculateAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен")
    }

}