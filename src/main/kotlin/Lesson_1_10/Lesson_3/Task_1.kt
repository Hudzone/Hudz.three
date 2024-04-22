package Lesson_1_10.Lesson_3

fun main() {
    val userName: String = "Пользователь"
    val dayGreeting: String = "Добрый день"
    val eveningGreeting: String = "Добрый вечер"

    var greeting: String = "$dayGreeting, $userName!"
    println(greeting)
    greeting = "$eveningGreeting, $userName!"
    println(greeting)
}