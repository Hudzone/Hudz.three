package Lesson_6

fun main() {
    println("===ТАЙМЕР===")
    print("Сколько секунд нужно засечь: ")
    var seconds = readLine()?.toInt() ?: return

    while (seconds > 0) {
        print("Осталось секунд: ${seconds--} \r")
        Thread.sleep(1000)
    }

    println("Время вышло!")
}