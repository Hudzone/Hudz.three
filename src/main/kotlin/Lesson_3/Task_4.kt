package Lesson_3

fun main() {
    var fieldLitera: String = "E"
    var fieldNumStart: Int = 2
    var fieldNumEnd: Int = 4
    var actionNum: Int = 0

    println("$fieldLitera$fieldNumStart-$fieldLitera${fieldNumEnd};${++actionNum}")

    fieldLitera = "D"
    fieldNumStart = 2
    fieldNumEnd = 3

    println("$fieldLitera$fieldNumStart-$fieldLitera${fieldNumEnd};${++actionNum}")
}