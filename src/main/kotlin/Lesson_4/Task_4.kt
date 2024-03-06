package Lesson_4

const val wholeNum: Int = 2
fun main() {
    val trainingDay: Int = 5

    println("""
        Упражнения для рук: ${trainingDay % wholeNum != 0}
        Упражнения для ног: ${trainingDay % wholeNum == 0}
        Упражнения для спины: ${trainingDay % wholeNum == 0}
        Упражнения для пресса: ${trainingDay % wholeNum != 0}
    """.trimIndent())

}