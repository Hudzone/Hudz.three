package lessons_1_10.Lesson_2

const val MIN_IN_HOUR: Int = 60

fun main() {
    val departureHour: Int = 9
    val completeDepartureHour = "%02d".format(departureHour)
    val departureMinute: Int = 39
    val timeForWay: Int = 457

    val hoursForWay: Int = timeForWay / MIN_IN_HOUR
    val completeHoursForWay = "%02d".format(hoursForWay)
    val minutesForWay = timeForWay % MIN_IN_HOUR

    val arrivalHours: Int = departureHour + hoursForWay
    val arrivalMinutes: Int = departureMinute + minutesForWay
    val finalInWayHours: Int = arrivalMinutes / MIN_IN_HOUR
    val finalArrivalHours: Int = arrivalHours + finalInWayHours
    val finalArrivalMinutes: Int = arrivalMinutes % MIN_IN_HOUR

    println("Время отбытия: $completeDepartureHour:$departureMinute")
    println("Время в пути: $completeHoursForWay:$minutesForWay")
    println("Время прибытия: $finalArrivalHours:$finalArrivalMinutes")
}