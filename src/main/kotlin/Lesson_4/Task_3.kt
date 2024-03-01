package Lesson_4

fun main() {
    val sunnyWeather: Boolean = true
    val sunProtection: Boolean = true
    val humidity: Int = 20
    val timeOfYear: String = "зима"

    val growthCondition: Boolean = sunnyWeather && sunProtection && humidity == 20 && timeOfYear != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых: $growthCondition")
}