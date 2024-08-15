package lesson_20

fun main() {

    val robot = Robot()
    robot.say()
    robot.sayModifier { it.reversed() }
    robot.say()

}

enum class Phrases(val phrase: String) {
    FIRST("привет"),
    SECOND("пока"),
    THIRD("ничего личного"),
    FOURTH("подзаряди меня"),
    FIFTH("я разряжен")
}

class Robot {

    private var modifier: ((String) -> String)? = null

    fun sayModifier(mod: (String) -> String) {
        this.modifier = mod
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

        val message: String = speechRandomizer().phrase

        val finalMessage = modifier?.invoke(message) ?: message
        println(finalMessage)
    }

}