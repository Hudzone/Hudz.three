package Lesson_4

const val WHOLE_NUM: Int = 2
fun main() {
    val trainingDay: Int = 5

    println("""
        Упражнения для рук: ${trainingDay % WHOLE_NUM != 0}
        Упражнения для ног: ${trainingDay % WHOLE_NUM == 0}
        Упражнения для спины: ${trainingDay % WHOLE_NUM == 0}
        Упражнения для пресса: ${trainingDay % WHOLE_NUM != 0}
    """.trimIndent())

}