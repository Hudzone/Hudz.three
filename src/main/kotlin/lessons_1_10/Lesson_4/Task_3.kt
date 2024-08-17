package lessons_1_10.Lesson_4

const val HUMIDIDTY_PASS: Int = 20
const val TOY_NON_PASS: String = "зима"
const val IS_SUNNY: Boolean = true
const val IS_PROTECTED: Boolean = true

fun main() {
    val humidity: Int = 20
    val timeOfYear: String = "зима"

    val growthCondition: Boolean = IS_SUNNY && IS_PROTECTED && humidity == HUMIDIDTY_PASS && timeOfYear != TOY_NON_PASS

    println("Благоприятные ли условия сейчас для роста бобовых: $growthCondition")
}