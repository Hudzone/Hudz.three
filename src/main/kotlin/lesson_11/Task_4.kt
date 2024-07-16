package lesson_11


class Recipe(
    var title: String,
    var recipeCover: String,
    var servings: Int,

//    var ingredients: MutableList<Ingridient> = mutableListOf(),
    var chosenRecipe: String,
) {
    fun servingsBar(value: Int) {
        println("Отображаем логику выбора количества порций")

    }

    fun displayIngredients(servings: Int) {
        println("Отображаем ингридиенты и грамовки, в зависимости от количества порций")
    }

    fun displayRecipe() {
        // отображаем сам рецепт
        println(chosenRecipe)
    }

}

class RecipeCategoryScreen(
    val category: List<String>,
    val categoryName: String,
    val pageCover: String,
) {
    fun displayCategories() {
        println("Отображаем список с категориями")
    }
}

class Ingredient(
    val title: String,
    val servingValue: Int,
    val measureUnit: String,
) {

}