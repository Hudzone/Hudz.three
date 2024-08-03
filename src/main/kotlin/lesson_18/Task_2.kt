package lesson_18

fun main() {

    val fourDice: FourSidedDice = FourSidedDice()
    val sixDice: StandartDice = StandartDice()
    val eightDice: EightSidedDice = EightSidedDice()

    val dicesCollection: List<StandartDice> = listOf(fourDice, sixDice, eightDice)

    dicesCollection.forEach { dice ->
        dice.rollDice()
    }

}

open class StandartDice(
) {

    open val diceSides: Int = 6
    open val diceValue: List<Int> = listOf(1, 2, 3, 4, 5, 6)

    fun rollDice() {

        val resultIndex = (0..diceValue.size - 1).random()
        val result = diceValue[resultIndex]

        println("Результат броска: $result")

    }

}

class FourSidedDice(
) : StandartDice() {

    override val diceSides: Int = 4
    override val diceValue: List<Int> = listOf(1, 2, 3, 4)

}

class EightSidedDice(
) : StandartDice() {

    override val diceSides: Int = 8
    override val diceValue: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8)

}