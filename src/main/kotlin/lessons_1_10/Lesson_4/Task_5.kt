package lessons_1_10.Lesson_4

const val MIN_SHIP_CREW = 55
const val MAX_SHIP_CREW = 70
const val MIN_FOOD_SUPPLY = 50
const val REQUIRED_SHIP_CREW = 70
const val IS_WEATHER_GOOD = true
const val IS_SHIP_DAMAGED = false

fun main() {
    val isDamaged: Boolean = true
    val shipCrew: Int = 40
    val foodSupply: Int = 60
    val isWeatherGood: Boolean = true

    val isDepartureAvailable: Boolean =
        (isDamaged == IS_SHIP_DAMAGED && shipCrew in MIN_SHIP_CREW..MAX_SHIP_CREW
                && foodSupply > MIN_FOOD_SUPPLY) ||
                (shipCrew == REQUIRED_SHIP_CREW && foodSupply >= MIN_FOOD_SUPPLY && isWeatherGood == IS_WEATHER_GOOD)

    println("Благоприятны ли условия для отправки корабля: $isDepartureAvailable")
}