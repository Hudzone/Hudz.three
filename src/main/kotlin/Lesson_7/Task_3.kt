package Lesson_7

fun main() {
    print("Введите число: ")
    val userInput: Int = readln().toInt()

    for (i in 0..userInput) {
        if (i % 2 <= 0) {
            print("$i ")
        }
    }

}