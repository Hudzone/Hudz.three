package lesson_17

fun main() {

    val jabroniOutfit = Package(1, "Гуаньджоу")
    jabroniOutfit.geoPosition = "Владивосток"
    jabroniOutfit.geoPosition = "Сортировочный центр"
    jabroniOutfit.geoPosition = "Владимир"
    jabroniOutfit.geoPosition = "Москва"

    jabroniOutfit.getMovesQuantity()

}

class Package(
    val packageNumber: Int,
    private val _geoPosition: String
) {

    private var movingInterface: Int = 0

    var geoPosition = _geoPosition
        get() = field
        set(value) {
            movingInterface += 1
            field = value
        }

    fun getMovesQuantity() {
        println("Товар перемещали $movingInterface раз")
    }

}
