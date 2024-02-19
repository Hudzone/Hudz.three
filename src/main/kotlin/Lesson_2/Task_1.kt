package Lesson_2

fun main() {
    val studentsResult = arrayOf(3,4,3,5)

    var sum = studentsResult.sum()

    val arithmeticMean: Float = sum / studentsResult.size.toFloat()

    println("======РЕЗУЛЬТАТЫ ПО АНГЛИЙСКОМУ======")

    var index = 0
    for (i in studentsResult) {
        println("Ученик ${++index}. Оценка: $i")
    }

    println("Среднее арифметическое: $arithmeticMean")
}