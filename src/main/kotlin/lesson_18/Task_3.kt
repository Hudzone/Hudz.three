package lesson_18

fun main() {

    val foxy = Fox("Алиса")
    val bobik = Dog("Бобик")
    val barsik = Cat("Барсик")

    val tamagochiCollection: List<Tamagochi> = listOf(foxy, bobik, barsik)

    tamagochiCollection.forEach { tamagochi ->
        tamagochi.getFavoriteMeal()
    }

}

open class Tamagochi(
    val name: String,
) {

    open fun getFavoriteMeal() {}

}

class Fox(
    name: String,
) : Tamagochi(name) {

    private val favouriteMeal: String = "ягоды"

    override fun getFavoriteMeal() {
        println("$name -> ест $favouriteMeal")
    }

}

class Dog(
    name: String,
) : Tamagochi(name) {

    private val favouriteMeal: String = "кости"

    override fun getFavoriteMeal() {
        println("$name -> ест $favouriteMeal")
    }

}

class Cat(
    name: String,
) : Tamagochi(name) {

    private val favouriteMeal: String = "рыба"

    override fun getFavoriteMeal() {
        println("$name -> ест $favouriteMeal")
    }

}

