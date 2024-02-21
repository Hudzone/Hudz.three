package Lesson_2

fun main() {
    val deposit: Int = 70000
    val percentPerYear: Double = 16.7
    val years: Int = 20

    val calc = deposit * Math.pow(1 + percentPerYear / 100, years.toDouble())
    val result = String.format("%.3f", calc) // Форматирую строку согласно ТЗ

    println("===Калькулятор сложного процента===")
    println("Депозит: $deposit тыс. руб.")
    println("Годовая процентная ставка: $percentPerYear %")
    println("Срок вклада: $years лет")


    // Так просто небольшая анимация загрузки :D
    val load = arrayOf("$", "₽", "¥", "€"," ")
    var index = 0
    var iter = 0

    while (iter <= 59) {
        ++iter
        print("\r${load[index]}")
        Thread.sleep(50)
        index = (index + 1) % load.size
    }
    println() // Ввел новую строку, возможно это можно сделать удобнее, но не понял как

    println("Через $years лет будет накоплено $result руб.")
}