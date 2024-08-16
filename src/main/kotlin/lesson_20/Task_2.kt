package lesson_20

fun main() {

    val player = Player("Lancelot", 50, 100)

    val getHeroInfo: (Player) -> Unit =
        fun(player: Player) = println("У ${player.name} сейчас ${player.currentHp} очков здоровья")

    getHeroInfo(player)

    val healthPotion = { hero: Player ->
        hero.currentHp = hero.maxHp
    }

    healthPotion(player)
    getHeroInfo(player)

}

class Player(
    val name: String,
    var currentHp: Int,
    val maxHp: Int,
)