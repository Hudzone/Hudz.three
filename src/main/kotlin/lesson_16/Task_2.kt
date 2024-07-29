package lesson_16

fun main() {

    val radius: Double = 5.0

    val circle = Round(radius)
    circle.roundLength()
    circle.roundArea()

}


class Round(
    val radius: Double,
) {

    private val pi: Double = 3.14

    fun roundLength() {
        val result = 2 * (pi * radius)
        println("Длина окружности с радиусом $radius: $result")
    }

    fun roundArea() {
        val result = pi * (radius * radius)
        println("Площадь окружности с радиусом $radius: $result")
    }

}