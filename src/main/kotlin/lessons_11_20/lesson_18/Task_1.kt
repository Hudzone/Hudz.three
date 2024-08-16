package lessons_11_20.lesson_18

fun main() {

    val list1 = "пельмени"
    val list2 = listOf("лимонад", "макароны", "котлеты")

    val order1 = Order(1, list1)
    val order2 = Order(2, list2)

    order1.printButton()
    order2.printButton()

}

class Order<T>(
    val orderNumber: Int,
    private val items: T,
) {

    private fun printItem(
        item: String,
    ) {
        println("Заказан товар: $item")
    }

    private fun printItem(
        item: List<*>,
    ) {
        print("Заказаны следующие товары: ")

        item.forEach { it ->
            print("$it ")
        }
    }

    fun printButton() {
        when (items) {
            is String -> printItem(items)
            is List<*> -> printItem(items)
        }
    }

}