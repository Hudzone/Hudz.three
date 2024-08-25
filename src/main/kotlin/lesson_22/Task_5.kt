package lesson_22

fun main() {

    val battle1 = GalacticGuide(
        "Alpha Centauri",
        "Тройная звёздная система в созвездии Центавра",
        "16:30 12.12.2404",
        4.36
    )

    val name = battle1.component1()
    val decr = battle1.component2()
    val dateTime = battle1.component3()
    val distance = battle1.component4()

    println(
        """
            Название места/события: $name
            Описание места/события: $decr
            Дата и время события: $dateTime г.
            Расстояние от Земли: $distance световых лет
        """.trimIndent()
    )
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String,
    val distanceFromEarth: Double,
)