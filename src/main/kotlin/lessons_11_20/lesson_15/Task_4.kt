package lessons_11_20.lesson_15

fun main() {

    val guitar = Instrument("Gibson LesPaul Standart", 12)
    val strings_10 = InstrumentPart(guitar, "Струны 10 мм", 33)
    val strings_12 = InstrumentPart(guitar, "Струны 12 мм", 22)
    val tuner = InstrumentPart(guitar, "Тюнер цифровой Sony", 10)

    guitar.search()

}

interface Searchable {

    fun search()

}

abstract class Item {
    abstract val name: String
    abstract val quantity: Int
}

class Instrument(
    override val name: String,
    override val quantity: Int,
    var parts: MutableList<InstrumentPart> = mutableListOf(),
) : Item(), Searchable {
    override fun search() {
        val animationUnit = listOf(".", ".", ".", ".", ".\n")
        print("Выполняется поиск")
        for (i in animationUnit) {
            print(i)
            Thread.sleep(500)
        }
        println("Комплектующие: ")
        parts.forEach { it ->
            println("Товар: ${it.name} Количество на складе: ${it.quantity}")
        }
    }
}

class InstrumentPart(
    val fatherLayer: Instrument,
    override val name: String,
    override val quantity: Int,
) : Item() {
    init {
        fatherLayer.parts.add(this)
    }
}

