package lessons_1_10.Lesson_9

fun main() {
    println("Введите пять ингридиентов одной строкой разделяя их \",\":")
    val userInput = readln()

    val listOfIngridients = userInput.split(", ", ",")

    val sortedList = listOfIngridients.sorted()

    for (i in sortedList) println(i)
}

