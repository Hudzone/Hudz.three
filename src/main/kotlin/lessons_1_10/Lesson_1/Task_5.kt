// В первой реализации столкнулся с тем что из-за формата у меня остаток оставался
// И я не мог точно вычислить остаток секунд, но нашел способ через BigDecimals

package lessons_1_10.Lesson_1
import java.math.BigDecimal
import java.math.RoundingMode

// Ввожу константы для расчётов:
const val SEC_MIN: Int = 60 // Константа для работы со временем
const val SEC_IN_HOUR: Int = 3600 // Константа означаяющая количество секунд в часе

fun main() {
    // Ввожу переменную с секундами
    val secondsGiven: Short = 6480

    // 1.Вычисляем часы
    val hours: Float = secondsGiven / SEC_IN_HOUR.toFloat()

    // Перевожу в строку чтобы извлечь полный час и остаток
    val resultToString: String = hours.toString()
    val fullHour = resultToString[0].toString().toInt()
    val completeHours = "%02d".format(fullHour)
    val timeLeft = hours - fullHour

    // 2.Вычисляем минуты
    // Узнаем сколько в остатке от вычисления часа минут
    val minutes: Float = timeLeft * SEC_MIN.toFloat()

    // Узнаю можно ли округлить результат или нет, и нужно ли нам секунды вычислять
    if (isRoundable(minutes.toDouble())) {
        val countMin = BigDecimal(minutes.toString())
        val countTrueResult = countMin.setScale(0, RoundingMode.UP)

        // Тогда сразу вывожу результат
        println("Гагарин провел в космосе $completeHours:$countTrueResult:00")

    } else {
        val seconds = minutes.toInt() // Получаем целое число
        val afterPoint = (minutes - seconds) * SEC_MIN // Получаем остаток после плавающей точки и конвертируем в секунды
    }

}

// пришлось ввести функцию чтобы узнать можно ли округлить
fun isRoundable(number: Double): Boolean {
    val counting = number - number.toInt() // Вычисляем дробную часть числа
    return counting != 0.0
}