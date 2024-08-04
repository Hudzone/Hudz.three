package lesson_18

fun main() {

    val circle = Circle(20)
    val square = Square(12)
    val point = Point()

    val screenExample = Screen()

    screenExample.draw(10, 20, circle)
    screenExample.draw(10.5f, 20.1f, circle)
    screenExample.draw(5, 10, square)
    screenExample.draw(5.4f, 10.3f, square)
    screenExample.draw(1, 2, point)
    screenExample.draw(1.4f, 2.6f, point)

}

open class Figure(
    open val name: String,
) {}

class Circle(
    val circleRadius: Int,
    name: String = "круг",
) : Figure(name) {
}

class Square(
    val squareSide: Int,
    name: String = "квадрат",
) : Figure(name) {
}

class Point(
    name: String = "точка",
) : Figure(name) {
}

class Screen(
) {

    fun draw(
        x: Int,
        y: Int,
        obj: Circle
    ) {

        println("Нарисован ${obj.name} по координатам x = $x, y = $y с радиусом ${obj.circleRadius}")

    }

    fun draw(
        x: Float,
        y: Float,
        obj: Circle
    ) {

        println("Нарисован ${obj.name} по координатам x = $x, y = $y с радиусом ${obj.circleRadius}")

    }

    fun draw(
        x: Int,
        y: Int,
        obj: Square
    ) {

        println("Нарисован ${obj.name} по координатам x = $x, y = $y со стороной ${obj.squareSide}")

    }

    fun draw(
        x: Float,
        y: Float,
        obj: Square
    ) {

        println("Нарисован ${obj.name} по координатам x = $x, y = $y со стороной ${obj.squareSide}")

    }

    fun draw(
        x: Int,
        y: Int,
        obj: Point
    ) {

        println("Нарисована ${obj.name} по координатам x = $x, y = $y")

    }

    fun draw(
        x: Float,
        y: Float,
        obj: Point
    ) {

        println("Нарисована ${obj.name} по координатам x = $x, y = $y")

    }


}
