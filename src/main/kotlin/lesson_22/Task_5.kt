package lesson_22

fun main() {

    val battle1 = GalacticGuide(
        "Alpha Centauri",
        "Тройная звёздная система в созвездии Центавра",
        "16:30 12.12.2404",
        4.36
    )

    println(battle1)

}

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String,
    val distanceFromEarth: Double,
) {
    override fun toString(): String {
        return """
            Название места/события: $name
            Описание места/события: $description
            Дата и время события: $dateTime г.
            Расстояние от Земли: $distanceFromEarth световых лет
        """.trimIndent()
    }
}