package lesson_12

fun main() {

    val july16 = WeatherMetrics(26, 20, false)
    val july17 = WeatherMetrics(35, 26, true)
    
}

class WeatherMetrics(_dayTemp: Int, _nightTemp: Int, _isRainyToday: Boolean) {

    var dayTemp: Int = _dayTemp
    var nightTemp: Int = _nightTemp
    var isRainyToday: Boolean = _isRainyToday

    init {
        println("""
            МЕТРИКИ:
            Дневная температура: ${dayTemp}
            Ночная температура: ${nightTemp}
            Есть ли осадки: ${isRainyToday}
        """.trimIndent())
    }

}