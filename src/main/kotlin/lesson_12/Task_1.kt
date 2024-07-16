package lesson_12

fun main() {

    val july16 = WeatherMetrics()
    july16.dayTemp = 26
    july16.nightTemp = 20
    july16.isRainyToday = false

    println("""
            МЕТРИКИ:
            Дневная температура: ${july16.dayTemp}
            Ночная температура: ${july16.nightTemp}
            Есть ли осадки: ${july16.isRainyToday}
        """.trimIndent())

    val july17 = WeatherMetrics()
    july17.dayTemp = 35
    july17.nightTemp = 29
    july17.isRainyToday = true

    println("""
            МЕТРИКИ:
            Дневная температура: ${july17.dayTemp}
            Ночная температура: ${july17.nightTemp}
            Есть ли осадки: ${july17.isRainyToday}
        """.trimIndent())

}

class WeatherMetrics() {

    var dayTemp: Int = 10
    var nightTemp: Int = 0
    var isRainyToday: Boolean = true

}