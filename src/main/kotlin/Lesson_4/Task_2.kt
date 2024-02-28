package Lesson_4

fun main() {
    var weight: Int = 20
    var volume: Int = 80
    println("Груз весом $weight кг и объемом $volume соответствует категории Average: ${((weight >= 35 && weight <= 100) && volume < 100)}")
}