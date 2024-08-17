package lessons_1_10.Lesson_9

fun main() {
    println("Введите ингридиенты!")

    var listOfIngridients = mutableSetOf<String>()

    var i = 0
    while (listOfIngridients.size < 5) {
        print("${++i} ингридиент: ")

        val userInput = readln().lowercase()
        listOfIngridients.add(userInput)

    }

    val sortedList = listOfIngridients.sorted()

    println("СПИСОК ИНГРИДИЕНТОВ: ")

    val string =
        sortedList.joinToString(separator = ", ", postfix = ".").replaceFirstChar { it.uppercase() }
    println(string)

}
