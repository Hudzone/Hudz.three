package Lesson_1

fun main() {
    val thxLetter: String = "Спасибо за покупку!"
    var ordersAmount: Int = 75
    var shopStaff: Int = 2000

    println("Количество заказов: $ordersAmount. $thxLetter")
//  println("Количество работников: $shopStaff")
    println("Количество работников: ${--shopStaff}")

}