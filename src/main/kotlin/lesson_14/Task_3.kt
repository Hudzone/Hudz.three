package lesson_14

const val DEFAULT_MULTIPLIER: Int = 2

fun main() {

    val figureList: MutableList<Figure> = mutableListOf()

    val whiteCircle = Circle("white", 5)
    val blackCircle = Circle("black", 10)
    val whiteRectangle = Rectangle("white", 5, 3)
    val blackRectangle = Rectangle("black", 10, 5)

    figureList.add(whiteCircle)
    figureList.add(blackCircle)
    figureList.add(whiteRectangle)
    figureList.add(blackRectangle)

    var summOfPerimeters: Double = 0.0
    var summOfAreas: Double = 0.0

    figureList.forEach { it ->

        if (it.color == "black") {
            summOfPerimeters += it.calculatePerimeter()
        }

    }

    figureList.forEach { it ->
        if (it.color == "white") {

            summOfAreas += it.calculateArea()

        }
    }

    println("Сумма периметров черных фигур: $summOfPerimeters")
    println("Сумма площадей белых фигур: $summOfAreas")


}

abstract class Figure(open val color: String) {

    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double

}

class Circle(
    override val color: String,
    val circleRadius: Int,
    val pi: Double = 3.14,
) : Figure(color) {

    override fun calculateArea(): Double {
        return (circleRadius * circleRadius) * pi
    }

    override fun calculatePerimeter(): Double {
        return (DEFAULT_MULTIPLIER * circleRadius) * pi
    }
}

class Rectangle(
    override val color: String,
    val length: Int,
    val width: Int,
) : Figure(color) {

    override fun calculateArea(): Double {
        return length.toDouble() * width.toDouble()
    }

    override fun calculatePerimeter(): Double {
        return (length.toDouble() + width.toDouble()) * DEFAULT_MULTIPLIER.toDouble()
    }
}