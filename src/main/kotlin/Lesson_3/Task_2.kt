package Lesson_3

fun main() {
    val userName: String = "Татьяна"
    val userSecondName: String = "Сергеевна"
    var userSureName: String = "Андреева"
    var userAge: Int = 20

    println("Данные до замужества: ")
    println("$userName $userSecondName $userSureName, $userAge лет.")
    println()

    userSureName = "Сидорова"
    userAge = 22
    println("Данные после замужества: ")
    println("$userName $userSecondName $userSureName, $userAge года.")
}