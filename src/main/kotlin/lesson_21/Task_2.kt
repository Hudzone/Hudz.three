package lesson_21

fun main() {

    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 123, 11231, 141232)
    println(numbers.evenNumbersSum())

}

fun List<Int>.evenNumbersSum(): Int {

    var sumOfEven = 0

    this.forEach { number ->

        if (number % 2 == 0) {
            sumOfEven += number
        }

    }

    return sumOfEven

}