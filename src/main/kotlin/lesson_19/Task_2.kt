package lesson_19

fun main() {

    val adidasSneakers = Item("Кросовки", Items.CLOTHES)
    val pencil = Item("Карандаш", Items.STATIONERY)
    val tuner = Item("Гитарный тюнер", Items.OTHER)

    adidasSneakers.printInfo()
    pencil.printInfo()
    tuner.printInfo()

}

enum class Items {
    CLOTHES {
        override fun getItemName(): String {
            return "Одежда"
        }
    },
    STATIONERY {
        override fun getItemName(): String {
            return "Канцелярские товары"
        }
    },
    OTHER {
        override fun getItemName(): String {
            return "Разное"
        }
    };

    abstract fun getItemName(): String

}

class Item(
    private val name: String,
    private val category: Items,
) {

    fun printInfo() {
        println("Название бренда: $name")
        println("Категория: ${category.getItemName()}")
    }

}