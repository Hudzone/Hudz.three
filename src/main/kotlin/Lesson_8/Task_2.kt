package Lesson_8

fun main() {
    val recipeList = arrayOf("картофель", "соль", "масло")

    print("Проверка ингридиента. Введите название: ")
    val item: String = readln().toLowerCase()

    var isFound = false

    for (i in recipeList) {
        if (i == item) {
            println("Ингредиент \"${i}\" в рецепте есть")
            isFound = true
            break
        }
    }

    if (isFound == false) {
        println("Такого ингридиента в рецепте нет!")
    }
}