package Lesson_8

fun main() {
    val recipeList = arrayOf("картофель", "соль", "масло")

    print("Проверка ингридиента. Введите название: ")
    val item: String = readln().toLowerCase()

    for (i in recipeList) {
        if (i == item) {
            println("Ингредиент \"${i}\" в рецепте есть")
            break
        } else {
            continue
        }
    }

    println("Такого ингредиента в рецепте нет")
}