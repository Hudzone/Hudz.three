package Lesson_1_10.Lesson_7

fun main() {
    print("Введите количество секунд: ")
    val userInput: Int = readln().toInt()

    for (i in userInput downTo 1) {
        print("Осталось $i сек.\r")
        Thread.sleep(1000)
    }

    println("Время вышло.")

}