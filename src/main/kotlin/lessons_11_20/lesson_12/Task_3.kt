package lessons_11_20.lesson_12

const val KELVIN_OP = 273

fun main() {

    var day1 = WeatherInformation(273, 73, true)
    day1.displayInfo()
}

class WeatherInformation(_dayTemp: Int, _nightTemp: Int, _isRainyToday: Boolean ) {

    var dayTemp: Int = _dayTemp - KELVIN_OP
    var nightTemp: Int = _nightTemp - KELVIN_OP
    var isRainyToday: Boolean = _isRainyToday

    fun displayInfo() {
        println("""
            Информация о погоде
            Дневная температура( С ): $dayTemp
            Ночная температура ( C ): $nightTemp
            Осадки: $isRainyToday
        """.trimIndent())

    }

}