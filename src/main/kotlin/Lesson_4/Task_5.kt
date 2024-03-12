package Lesson_4

const val MIN_SHIP_CREW = 55
const val MAX_SHIP_CREW = 70
const val MIN_FOOD_SUPPLY = 50
const val REQUIRED_SHIP_CREW = 70

fun main() {
    val isDamaged: Boolean = true
    val shipCrew: Int = 40
    val foodSupply: Int = 60
    val isWeatherGood: Boolean = true

    val isDepartureAvailable: Boolean =
        (isDamaged == false && shipCrew in MIN_SHIP_CREW..MAX_SHIP_CREW
                && foodSupply > MIN_FOOD_SUPPLY && isWeatherGood == true || false) ||
                (isDamaged == true && shipCrew == REQUIRED_SHIP_CREW
                        && foodSupply >= MIN_FOOD_SUPPLY && isWeatherGood == true)

    println("Благоприятны ли условия для отправки корабля: $isDepartureAvailable")
}