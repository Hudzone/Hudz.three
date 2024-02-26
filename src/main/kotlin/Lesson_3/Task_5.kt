package Lesson_3

fun main() {
    val action: String = "D2-D4;0"

    val (from, to, step) = action.split("-", ";")
    println("Ячейка отправки: $from")
    println("Ячейка прибытия: $to")
    println("Шаг: $step")
}