package lesson_18

fun main() {

    val order1 = Order(1, "пельмени")
    val order2 = Order(2, "лимонад,макароны котлеты")

    order1.printItems()
    order2.printItems()

}

class Order(
    val orderNumber: Int,
    private val items: String,
) {
    private var itemString: String = ""
    private var itemContainer: MutableList<String> = mutableListOf()

    init {
        if (items.contains(",")) {

            items.split(Regex("[,\\s]")).forEach { item ->
                itemContainer.add(item)
            }

        } else {
            itemString = items
        }
    }

    fun printItems() {
        if (itemContainer.isEmpty()) {
            printItem(itemString)
        } else {
            printItemsContainer(itemContainer)
        }
    }


    private fun printItem(
        itemString: String,
    ) {
        println("Заказан товар: $itemString")
    }

    private fun printItemsContainer(
        itemContainer: MutableList<String>,
    ) {

        print("Заказаны следующие товары: ")

        itemContainer.forEach { it ->
            print("$it ")
        }
    }

}

