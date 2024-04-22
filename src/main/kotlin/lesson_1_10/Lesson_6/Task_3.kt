package lesson_1_10.Lesson_6

fun main() {
    println("===ТАЙМЕР===")
    print("Сколько секунд нужно засечь: ")
    var seconds = readln().toInt()

    while (seconds > 0) {
        print("Осталось секунд: ${seconds--} \r")
        Thread.sleep(1000)
    }

    println("Время вышло!")
}