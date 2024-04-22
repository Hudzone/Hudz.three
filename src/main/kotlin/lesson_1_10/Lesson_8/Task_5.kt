package lesson_1_10.Lesson_8

fun main() {
    println("====RECIPE BUILDER====")
    print("Сколько ингридиентов планируется: ")

    val numOfItems: Int = readln().toInt()

    val recipeList = arrayOfNulls<String>(numOfItems)

    for (i in 0 until numOfItems) {
        print("Введите ингридиент: ")

        val userChoice = readln().lowercase()
        recipeList[i] = userChoice

    }

    println("ВАШ РЕЦЕПТ: ")

    for (i in recipeList) {
        println(i)
    }
}