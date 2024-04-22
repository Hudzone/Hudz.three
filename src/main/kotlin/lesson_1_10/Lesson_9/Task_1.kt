package lesson_1_10.Lesson_9

fun main() {
    val listOfIngridients = listOf("картофель", "лук", "соль")

    println("В рецепте есть следующие ингредиенты: ")
    listOfIngridients.forEach() { product ->
        println(product)
    }
}