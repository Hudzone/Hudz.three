package Lesson_4

const val HUMIDIDTY_PASS: Int = 20
const val TOY_NON_PASS: String = "зима"
fun main() {
    val isSunny: Boolean = true
    val isProtected: Boolean = true
    val humidity: Int = 20
    val timeOfYear: String = "зима"

    val growthCondition: Boolean = isSunny && isProtected && humidity == HUMIDIDTY_PASS && timeOfYear != TOY_NON_PASS

    println("Благоприятные ли условия сейчас для роста бобовых: $growthCondition")
}