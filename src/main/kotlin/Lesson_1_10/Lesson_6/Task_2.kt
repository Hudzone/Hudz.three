package Lesson_1_10.Lesson_6

fun main() {
    println("===ТАЙМЕР===")
    print("Сколько секунд нужно засечь: ")
    val seconds = readLine()?.toInt() ?: return

    println("Таймер запущен на $seconds секунд")

    Thread.sleep(seconds.toLong() * 1000)

    println("Прошло $seconds секунд")
}