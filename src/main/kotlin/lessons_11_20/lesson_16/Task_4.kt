package lessons_11_20.lesson_16

fun main() {

    val airPods = Order(1)
    val manager = Manager(airPods)

    manager.changeStatus(true)

}

class Order(
    private val orderNumber: Int,
    private var orderStatus: Boolean = false,
) {

    fun statusOperator(status: Boolean) {
        changeOrder(status)
    }

    private fun changeOrder(changeStatus: Boolean) {
        orderStatus = changeStatus

        if (orderStatus) {
            println("Статус заказа ${orderNumber}: готово")
        } else {
            println("Статус заказа ${orderNumber}: не готово")
        }
    }

}

class Manager(
    val orderObj: Order,
) {

    fun changeStatus(changeStatus: Boolean) {
        orderObj.statusOperator(changeStatus)
    }

}