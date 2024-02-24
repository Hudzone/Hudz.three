package Lesson_3

fun main () {
    print("Введите число из которого необходимо вывести таблицу умножения: ")
    var value: Int = readLine()!!.toInt()
    println()
    val countingData = arrayOf(1,2,3,4,5,6,7,8,9)

    for (i in countingData) {
        println("$value x $i = ${value*i}")
    }
}