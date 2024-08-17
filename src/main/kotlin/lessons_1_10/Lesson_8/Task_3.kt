package lessons_1_10.Lesson_8

fun main() {
    val recipeList = arrayOf("картофель", "соль", "масло")

    print("Проверка ингридиента. Введите название: ")
    val item: String = readln().lowercase()

    if (item in recipeList) {
        println("Ингредиент \"${item}\" в рецепте есть")
    } else {
        println("Такого ингридиента в рецепте нет!")
    }
}