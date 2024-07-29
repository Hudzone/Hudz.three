package lesson_16

fun main() {

    val mikha = Hero("Михалыч", 50)
    val golem = Hero("Каменный голем", 30)

    golem.getDamage(mikha)
    golem.healPotion()
    golem.getDamage(mikha)
    golem.getDamage(mikha)
    golem.healPotion()

}

abstract class Player {
    abstract val name: String
    abstract var health: Int
    abstract var damage: Int
    abstract fun getDamage(bully: Player)
    abstract fun healPotion()
}

class Hero(
    override val name: String,
    override var damage: Int,
    override var health: Int = 100,
) : Player() {

    private var isHeroDead: Boolean = false

    override fun getDamage(bully: Player) {
        val wounds = bully.damage
        this.health -= wounds

        println("${bully.name} атакует ${this.name}. Получено ${bully.damage} урона.\nЗдоровье ${this.name}: $health\n")

        if (this.health <= 0) {
            death()
        }

    }

    override fun healPotion() {

        if (!isHeroDead) {
            this.health += 30
            println("Использовано зелье здоровья. Текущее здоровье ${this.name}: $health\n")
        } else {
            println("Персонаж мёртв, лечение $name невозможно!\n")
        }
    }

    private fun death() {

        health = 0
        damage = 0
        isHeroDead = true

        println("$name мёртв!")

    }
}