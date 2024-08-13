package lesson_20

fun main() {

    val robot = Robot()
    robot.say()
    robot.sayModifier()
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
    private var modifierEnabled: Boolean = false
) {

    fun sayModifier() {
        modifierEnabled = true
    }

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

            println(sayMod())

            modifierEnabled = false

        } else {
            print(message)
        }

    }

}