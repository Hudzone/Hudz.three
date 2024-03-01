package Lesson_4

const val LOW_EDGE_WEIGHT: Int = 35
const val HIGH_EDGE_WEIGHT: Int = 100
const val HIGH_EDGE_VOLUME: Int = 100
fun main() {
    var weight: Int = 20
    var volume: Int = 80
    println("Груз весом $weight кг и объемом $volume соответствует категории Average: ${((weight >= LOW_EDGE_WEIGHT && weight <= HIGH_EDGE_WEIGHT) && volume < HIGH_EDGE_VOLUME)}")

    weight = 50
    volume = 100
    println("Груз весом $weight кг и объемом $volume соответствует категории Average: ${((weight >= LOW_EDGE_WEIGHT && weight <= HIGH_EDGE_WEIGHT) && volume < HIGH_EDGE_VOLUME)}")
}