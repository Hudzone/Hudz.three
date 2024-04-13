package Lesson_8

fun main() {
    var recipeList = emptyArray<String>()

    println("====RECIPE BUILDER====")
    print("Сколько ингридиентов планируется: ")

    val numOfItems: Int = readln().toInt()

    for (i in 1..numOfItems) {
        print("Введите ингридиент: ")

        val userChoice = readln().lowercase()
        recipeList = recipeList.plus(userChoice)

    }

    println("ВАШ РЕЦЕПТ: ")

    for (i in recipeList) {
        println(i)
    }
}