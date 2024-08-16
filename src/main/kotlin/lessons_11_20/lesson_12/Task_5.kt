package lessons_11_20.lesson_12

import kotlin.random.Random
import kotlin.math.round
import kotlin.math.roundToInt

const val KELVIN_I = 273

fun main() {

    val days: MutableList<WeatherInform> = mutableListOf()

    var i = 0

    while (i < 30) {
        ++i
        val day = WeatherInform()

        days.add(day)
    }

    val dayTempList: MutableList<Int> = mutableListOf()
    val nightTempList: MutableList<Int> = mutableListOf()
    val rainyDays: MutableList<Boolean> = mutableListOf()

    days.forEach { it ->
        dayTempList.add(it.dayTemp)
        nightTempList.add(it.nightTemp)

        if (it.isRainyToday == true) {
            rainyDays.add(it.isRainyToday)
        }
    }

    val averageDayTemp = (dayTempList.average()).roundToInt()
    val averageNightTemp = (nightTempList.average()).roundToInt()
    val daysWithRain = rainyDays.size


    println(
        """
        ===ИНФОРМАЦИЯ О ПОГОДЕ ЗА 30 ДНЕЙ===
        Средняя дневная температура: $averageDayTemp °С
        Средная ночная температура: $averageNightTemp °С
        Количество дней с осадками: $daysWithRain
    """.trimIndent()
    )

}

class WeatherInform() {

    val randomTemp = (KELVIN_I..330).random()
    val randomNightTemp = (KELVIN_I..300).random()

    var dayTemp: Int = randomTemp - KELVIN_I
    var nightTemp: Int = randomNightTemp - KELVIN_I
    var isRainyToday: Boolean = Random.nextBoolean()


}