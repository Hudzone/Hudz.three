package Lesson_9

fun main() {
    val recipe = mutableListOf<Int>(2, 50, 15)

    print("Сколько порций вам потребуется: ")
    val userInput = readln().toInt()

    val updatedRecipe = recipe.map { it * userInput}
    recipe.clear()
    recipe.addAll(updatedRecipe)

    println("На ${userInput} порций вам понадобится яиц – ${recipe[0]} шт., молока – ${recipe[1]} мл., сливочного масла – ${recipe[2]} гр.")

}