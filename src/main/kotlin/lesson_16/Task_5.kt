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


class Hero(
    val name: String,
    var damage: Int,
    private var health: Int = 100,
) {

    private var isHeroDead: Boolean = false

    fun getDamage(bully: Hero) {
        val wounds = bully.damage
        this.health -= wounds

        println("${bully.name} атакует ${this.name}. Получено ${bully.damage} урона.\nЗдоровье ${this.name}: $health\n")

        if (this.health <= 0) {
            death()
        }

    }

     fun healPotion() {

        if (!isHeroDead) {
            this.health += 30

            if (health > 100) {
                this.health = 100
            }

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