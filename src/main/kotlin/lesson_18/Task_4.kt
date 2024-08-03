package lesson_18

fun main() {

    val rectangle = RectanglePack(10, 5, 20)
    val cube = CubePack(5)

    rectangle.getCoverArea()
    cube.getCoverArea()

}

abstract class Package {

    abstract fun getCoverArea()

}

class RectanglePack(
    private val length: Int,
    val width: Int,
    private val height: Int,
) : Package() {

    override fun getCoverArea() {
        val result = length * height
        println("Площадь поверхности прямоугольной коробки: $result")
    }

}

class CubePack(
    private val edgeLength: Int,
) : Package() {

    override fun getCoverArea() {
        val result = 6 * (edgeLength.getSquare())
        println("Площадь поверхности прямоугольной коробки: $result")
    }

    fun Int.getSquare(): Int {
        return this * this
    }
}