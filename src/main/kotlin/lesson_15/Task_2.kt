package lesson_15

import kotlin.jvm.Throws

//Необходимо разработать простую систему мониторинга погодных условий,
//которая будет собирать данные о температуре и количестве осадков.
//
//Создай абстрактный класс WeatherStationStats.
//Он будет служить родителем для классов-объектов погодных данных: Temperature и PrecipitationAmount.
//
//Реализуй логику имитации отправки сообщения на сервер в классе WeatherServer.
//Метод отправки сообщения должен определять тип переданного сообщения
//и в зависимости от результата передавать соответствующие данные.
//
//Создай по одному объекту для разных типов погодных данных и протестируй работу программы.

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

    fun get(data : WeatherStationStats) {

        when (data.infoType()) {

            "Temperature" -> println("${data.value}")
            "PrecipitationAmount" -> println("${data.value}")

        }

    }
}