package lesson_12


fun main() {

    var day1 = WeatherInfo(32, 25, false)
    var day2 = WeatherInfo(20, 18, true)

}

class WeatherInfo(var dayTemp: Int, var nightTemp: Int, var isRainyToday: Boolean) {


    init {
        println("""
            МЕТРИКИ:
            Дневная температура: ${dayTemp}
            Ночная температура: ${nightTemp}
            Есть ли осадки: ${isRainyToday}
        """.trimIndent())
    }

}