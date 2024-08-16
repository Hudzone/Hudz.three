package lessons_11_20.lesson_19

fun main() {

    val adidasSneakers = Item("Кросовки", Items.CLOTHES)
    val pencil = Item("Карандаш", Items.STATIONERY)
    val tuner = Item("Гитарный тюнер", Items.OTHER)

    adidasSneakers.printInfo()
    pencil.printInfo()
    tuner.printInfo()

}

//В интернет-магазине товары делятся на несколько категорий: одежда, канцелярские товары и разное.
//
//– создай enum класс с категориями;
//– создай метод внутри enum, который вернет текстовое название категории для пользователя;
//– создай класс, описывающий товар (с полями название, id, категория), в классе должен быть метод,
//который выводит инфо о товаре. Вызови его для нескольких созданных товаров;
//– для вывода информации о товаре, для категории используй метод определения категории.

enum class Items {
    CLOTHES,
    STATIONERY,
    OTHER;

    fun getItemName(): String {

        return when (this) {
            CLOTHES -> "одежда"
            STATIONERY -> "канцелярия"
            OTHER -> "разное"
        }

    }
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