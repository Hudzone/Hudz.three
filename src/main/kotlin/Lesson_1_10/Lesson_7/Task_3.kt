package Lesson_1_10.Lesson_7

fun main() {
    print("Введите число: ")
    val userInput: Int = readln().toInt()

    for (i in 0..userInput step 2) {
        print("$i ")
        }
    }
