package Lesson_1_10.Lesson_2

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11

    println("Бонусная кристаллическая руда: ${miningRushBonus(crystalOre)}")
    println("Бонусная железная руда: ${miningRushBonus(ironOre)}")

}

fun miningRushBonus(item: Int): Int {
    val persentCalculation: Int = 100
    val miningBuff: Int = 20
    val buffValue: Int = (item * miningBuff) / persentCalculation
    return buffValue
}