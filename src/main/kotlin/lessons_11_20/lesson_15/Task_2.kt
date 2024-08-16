package lessons_11_20.lesson_15

fun main() {

    val servak = WeatherServer()

    val temp = Temperature(32)
    val blabla = PrecipitationAmount(131.12)

    servak.get(temp)
    servak.get(blabla)

}

abstract class WeatherStationStats {

    abstract val value: String
    abstract fun infoType(): String

}

class Temperature(val temp: Int) : WeatherStationStats() {
    override val value: String = "Текущая температура: $temp C"

    override fun infoType(): String {
        return "Temperature"
    }

}

class PrecipitationAmount(val precipitation: Double) : WeatherStationStats() {
    override val value: String = "Текущее количество осадков: $precipitation mm"

    override fun infoType(): String {
        return "PrecipitationAmount"
    }
}

class WeatherServer {

    fun get(data: WeatherStationStats) {

        when (data) {

            is Temperature -> println("${data.value}")
            is PrecipitationAmount -> println("${data.value}")

        }

    }
}