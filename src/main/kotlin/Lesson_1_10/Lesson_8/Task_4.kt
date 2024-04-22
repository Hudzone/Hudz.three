package Lesson_1_10.Lesson_8

fun main() {
    var recipeList = arrayOf("картофель", "соль", "лук")

    printArray(recipeList)

    print("Введите ингридиент, который хотите заменить: ")
    val userChoice: String = readln().lowercase()

    if (recipeList.contains(userChoice)) {
        print("Ингредиент \"${userChoice}\" в рецепте есть. Какой новый ингридиент вы бы хотели добавить: ")
        val addItem: String = readln().lowercase()

        recipeList = recipeList.plus(addItem)

        println("Ингридиент \"${addItem}\" добавлен!")
        printArray(recipeList)

    } else {
        println("Такого ингридиента в рецепте нет!")
    }
}

fun printArray(ourArray: Array<String>) {
    println("СПИСОК ИНГРИДИЕНТОВ: ")
    for (i in ourArray) {
        println(i)
    }
}