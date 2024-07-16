package lesson_12


fun main() {

    var day1 = WeatherInformation(273, 73, true)
    day1.displayInfo()
}

class WeatherInformation(var _dayTemp: Int, var _nightTemp: Int,var _isRainyToday: Boolean ) {

    var dayTemp: Int = _dayTemp
    var nightTemp: Int = _nightTemp
    var isRainyToday: Boolean = _isRainyToday

    init {
        dayTemp = _dayTemp - 273
        nightTemp = _nightTemp - 273
    }

    fun displayInfo() {
        println("""
            Информация о погоде
            Дневная температура( С ): $dayTemp
            Ночная температура ( C ): $nightTemp
            Осадки: $isRainyToday
        """.trimIndent())

    }

}