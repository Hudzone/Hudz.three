package lessons_1_10.Lesson_9

fun main() {
    var listOfIngredients = mutableListOf<String>("Картофель", "Лук", "Соль")

    println("В рецепте есть базовые ингридиенты: ")
    listPrinting(listOfIngredients)

    print("Желаете добавить еще (да или нет)?: ")
    val userChoice = readln()

    if (userChoice.equals("да", ignoreCase = true)) {
        print("Какой ингридиент вы бы хотели добавить: ")
        val addIngridient = readln().replaceFirstChar { it.uppercase() }

        listOfIngredients.add(addIngridient)

        println("Теперь в рецепте есть следующие ингридиенты: ")
        listPrinting(listOfIngredients)

    } else {
        return
    }
}

fun listPrinting(item: MutableList<String>) {
    var i = 0
    item.forEach { ingredient ->
        println("${++i}. ${ingredient}")
    }
}