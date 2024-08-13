package lesson_20

fun main() {

    val player = Hero()

    val openTheDoor: (Hero) -> Unit = { hero: Hero ->
        if (hero.isKeyCollected) {
            println("Дверь открыта!")
        } else {
            println("Ключа нет! Дверь открыть нельзя!")
        }
    }

    openTheDoor(player)
    player.collectKey()
    openTheDoor(player)

}

class Hero(
    var isKeyCollected: Boolean = false
) {

    fun collectKey() {
        isKeyCollected = true
    }

}