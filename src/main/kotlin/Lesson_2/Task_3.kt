package Lesson_2

import kotlin.math.roundToInt

const val MIN_IN_HOUR: Int = 60
const val ROUND_FLOAT_NUMBERS: Int = 10

fun main() {
    val departureHour: Int = 9
    val completeHour = "%02d".format(departureHour)
    val departureMinute: Int = 39
    val timeForWay: Int = 457

    val timeForWayInDTF: Float = timeForWay / MIN_IN_HOUR.toFloat()

    val fullHoursForWay = timeForWayInDTF.toInt()
    val completeWayHour = "%02d".format(fullHoursForWay)


    val leftTimeForWay = timeForWayInDTF - fullHoursForWay
    val roundedNumber = (leftTimeForWay * ROUND_FLOAT_NUMBERS).roundToInt() / ROUND_FLOAT_NUMBERS.toFloat()
    val minutes: Float = roundedNumber * MIN_IN_HOUR
    val finalMinutes = minutes.toInt()

    var arrivalHour: Int = departureHour + fullHoursForWay
    val completeArivalHour = "%02d".format(arrivalHour)

    if (departureMinute.toFloat() + minutes >= MIN_IN_HOUR) {
        arrivalHour += 1
        val completeArHour = "%02d".format(arrivalHour)
        var fullMin: Int = departureMinute + finalMinutes
        val finalArrivalMinutes: Int = fullMin - MIN_IN_HOUR

        println("Время отбытия: $completeHour:$departureMinute")
        println("Время в пути: $completeWayHour:$finalMinutes")
        println("Время прибытия: $completeArHour:$finalArrivalMinutes")

    } else {
        val finalArrivalMinutes: Int = departureMinute + finalMinutes

        println("Время отбытия: $departureHour:$departureMinute")
        println("Время в пути: $completeWayHour:$finalMinutes")
        println("Время прибытия: $completeArivalHour:$finalArrivalMinutes")
    }

}