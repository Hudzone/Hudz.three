package Lesson_1

fun main() {
    println("=====Информация о полёте Гагарина=====")

    val length: Long = 40_868_600_000
    val age: Byte = 27
    val partOfDay: Float = 0.075F
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000

    println("Расстояние полёта: $length мм")
    println("Апогей орбиты составил: " + apogee)
    println("Возраст Юрия на тот момент: $age")

    println("Он провел в космосе: ")
    println("* $partOfDay часть дня")
    println("* $partOfYear часть года")
    println("* $seconds секунд")
}