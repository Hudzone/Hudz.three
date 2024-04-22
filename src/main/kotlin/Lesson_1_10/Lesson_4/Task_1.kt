package Lesson_1_10.Lesson_4

const val TABLES: Int = 13
fun main() {
    val freeForToday: Int = 0
    val freeForTomorrow: Int = 4

    val availabilityToday: Boolean = (TABLES - freeForToday) != TABLES
    val availabilityTomorrow: Boolean = (TABLES - freeForTomorrow) != TABLES

    println("[Доступность столиков на сегодня: $availabilityToday],\n" +
            "[Доступность столиков на завтра: $availabilityTomorrow]")
}