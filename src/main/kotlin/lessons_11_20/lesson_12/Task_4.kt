package lessons_11_20.lesson_12

const val KELVIN_OPR = 273

fun main() {

    var day1 = WeatherInformer(273, 73, true)

}

class WeatherInformer(_dayTemp: Int, _nightTemp: Int, _isRainyToday: Boolean ) {

    var dayTemp: Int = _dayTemp - KELVIN_OPR
    var nightTemp: Int = _nightTemp - KELVIN_OPR
    var isRainyToday: Boolean = _isRainyToday

    init {
        println("""
            Информация о погоде
            Дневная температура( С ): $dayTemp
            Ночная температура ( C ): $nightTemp
            Осадки: $isRainyToday
        """.trimIndent())
    }

}