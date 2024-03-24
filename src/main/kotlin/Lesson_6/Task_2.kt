package Lesson_6

fun main() {
    println("===ТАЙМЕР===")
    print("Сколько секунд нужно засечь: ")
    var userInput: Int = readln().toInt()

    while (userInput > 0) {
        print("Прошло ${userInput--} сек.\r")
        Thread.sleep(1000)
    }

}