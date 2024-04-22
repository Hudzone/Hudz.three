package Lesson_1_10.Lesson_8

const val DAYS_IN_THE_WEEK = 7

fun main() {
    val viewProg = 1..1000
    var viewsOfWeek = emptyArray<Int>()

    for (i in 1..DAYS_IN_THE_WEEK) {
        val numOfViews = viewProg.random()
        viewsOfWeek = viewsOfWeek.plus(numOfViews)
    }

    var sumOfViews: Int = 0

    for (i in viewsOfWeek) {
        sumOfViews += i
        println("Количество просмотров за ${viewsOfWeek.indexOf(i) + 1} день: ${i}")
    }

    println("Количество просмотров за неделю: ${sumOfViews}")
}