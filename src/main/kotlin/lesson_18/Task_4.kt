package lesson_18

import kotlin.math.pow

fun main() {

    val rectangle = RectanglePack(10, 5, 20)
    val cube = CubePack(5)

    rectangle.printData()
    cube.printData()

}

abstract class Package {

    abstract fun getCoverArea(): Int
    abstract fun printData()

}

class RectanglePack(
    private val length: Int,
    private val width: Int,
    private val height: Int,
) : Package() {

    override fun getCoverArea(): Int {
        return 2 * (length * width + length * height + width * height)
    }

    override fun printData() {
        val result = getCoverArea()
        println("Площадь поверхности прямоугольной коробки: $result")
    }

}

class CubePack(
    private val edgeLength: Int,
) : Package() {

    override fun getCoverArea(): Int {
        return 6 * edgeLength.toDouble().pow(2).toInt()
    }

    override fun printData() {
        val result = getCoverArea()
        println("Площадь поверхности квадратной коробки: $result")
    }

}