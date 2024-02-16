package Lesson_1

fun main() {
    // Ввожу переменную с секундами
    val fullSeconds: Short = 6480
    val fullMinutes: Int = fullSeconds / 60

    // Вычисляю количество полных часов
    val hours: Float = fullSeconds / 3600F
    val findHours = hours.toInt()
    val completeHours = "%02d".format(findHours)

    // Вычисляю количество полных минут
    val completeMinutes: Int = fullMinutes - 60

    // Вычисляю количество полных секунд
    val seconds: Float = fullSeconds.toFloat() - ((completeMinutes * 60F) + (60F * 2))
    val counting: Float = seconds / 100F
    val completeSeconds = counting.toInt()

    println("Гагарин провел в космосе $completeHours:$completeMinutes:$completeSeconds")
}