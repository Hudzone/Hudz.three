package Lesson_2

fun main() {
    val studentsResult = arrayOf(3,4,3,5)

    var sum = 0
    for (i in studentsResult) {
        sum += i
    }

    val quantity = studentsResult.size

    val arithmeticMean: Float = sum / quantity.toFloat()

    println("======РЕЗУЛЬТАТЫ ПО АНГЛИЙСКОМУ======")

    var index = 0
    for (i in studentsResult) {
        println("Ученик ${++index}. Оценка: $i")
    }

    println("Среднее арифметическое: $arithmeticMean")
}