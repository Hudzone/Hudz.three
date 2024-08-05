package lesson_18

fun main() {

    val list1 = listOf("пельмени")
    val list2 = listOf("лимонад", "макароны", "котлеты")

    val order1 = Order(1, list1)
    val order2 = Order(2, list2)

    order1.printButton()
    order2.printButton()

}

class Order(
    val orderNumber: Int,
    private val items: List<String>,
) {

    private var singleItem: String = " "
    private var multipleItems: List<String> = mutableListOf()

    init {
        if (items.size == 1) {
            singleItem = items[0]
        } else {
            multipleItems = items
        }
    }

    private fun printItem(
        item: String,
    ) {
        println("Заказан товар: $item")
    }

    private fun printItem(
        item: List<String>,
    ) {
        print("Заказаны следующие товары: ")

        item.forEach { it ->
            print("$it ")
        }
    }

    fun printButton() {
        if (multipleItems.isEmpty()) {
            printItem(singleItem)
        } else {
            printItem(multipleItems)
        }
    }

}

