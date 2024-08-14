package lesson_20

fun main() {

    fun sayModifier(): (Robot) -> Unit = { robot ->
        robot.modifierEnabled = true
    }

    val robot = Robot()
    robot.say()
    sayModifier()(robot)
    println()
    robot.say()

}

enum class Phrases(val phrase: String) {
    FIRST("привет"),
    SECOND("пока"),
    THIRD("ничего личного"),
    FOURTH("подзаряди меня"),
    FIFTH("я разряжен")
}

class Robot(
    var modifierEnabled: Boolean = false
) {

    private fun speechRandomizer(): Phrases {
        val phrase = (1..5).random()

        return when (phrase) {
            1 -> Phrases.FIRST
            2 -> Phrases.SECOND
            3 -> Phrases.THIRD
            4 -> Phrases.FOURTH
            else -> Phrases.FIFTH
        }

    }

    fun say() {

        var message: String = speechRandomizer().phrase

        if (modifierEnabled) {

            val sayMod = {
                message = message.reversed()
                println(message)
            }

            sayMod()

            modifierEnabled = false

        } else {
            print(message)
        }

    }

}