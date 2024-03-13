package Lesson_4

const val MIN_SHIP_CREW = 55
const val MAX_SHIP_CREW = 70
const val MIN_FOOD_SUPPLY = 50
const val REQUIRED_SHIP_CREW = 70
const val GOOD_WEATHER = true
const val BAD_WEATHER = false
const val SHIP_DAMAGED = true
const val SHIP_NON_DAMAGED = false

fun main() {
    val isDamaged: Boolean = true
    val shipCrew: Int = 40
    val foodSupply: Int = 60
    val isWeatherGood: Boolean = true

    val isDepartureAvailable: Boolean =
        (isDamaged == SHIP_NON_DAMAGED && shipCrew in MIN_SHIP_CREW..MAX_SHIP_CREW
                && foodSupply > MIN_FOOD_SUPPLY) ||
                (shipCrew == REQUIRED_SHIP_CREW && foodSupply >= MIN_FOOD_SUPPLY && isWeatherGood == GOOD_WEATHER)

    println("Благоприятны ли условия для отправки корабля: $isDepartureAvailable")
}