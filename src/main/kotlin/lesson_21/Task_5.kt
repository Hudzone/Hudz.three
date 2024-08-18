package lesson_21

fun main() {

    val abilityMap: Map<String, Int> = mapOf(
        "Фаербол" to 12,
        "Молния" to 1251131,
        "Щит" to 220
    )

    println(abilityMap.maxCategory())

}

fun Map<String, Int>.maxCategory(): String {

    val wrappedMap = this.toList()
    val sortedList = wrappedMap.sortedByDescending { it.second }
    val wrappedList = sortedList.toMap()

    val maxValue = wrappedList.maxByOrNull { it.value }
    val printor: String = "Навык: ${maxValue?.key}\nXP: ${maxValue?.value}"

    return printor

}