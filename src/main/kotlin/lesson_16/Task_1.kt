package lesson_16


fun main() {

    val dice = DiceThrower()
    dice.rollDice()

}

class DiceThrower() {

    private val diceValue: Int = (1..6).random()

    fun rollDice() {
        println("Выпало $diceValue")
    }
}