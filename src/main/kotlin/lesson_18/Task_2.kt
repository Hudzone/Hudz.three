package lesson_18

fun main() {

    val fourDice: FourSidedDice = FourSidedDice()
    val sixDice: StandartDice = StandartDice()
    val eightDice: EightSidedDice = EightSidedDice()

    val dicesCollection: List<Dice> = listOf(fourDice, sixDice, eightDice)

    dicesCollection.forEach { dice ->
        dice.rollDice()
    }

}

abstract class Dice {
    abstract val diceSides: Int
    abstract val diceValue: List<Int>
    abstract fun rollDice()
}

open class StandartDice(
) : Dice() {

    override val diceSides: Int = 6
    override val diceValue: List<Int> = listOf(1, 2, 3, 4, 5, 6)

    override fun rollDice() {

        val resultIndex = (0..diceValue.size - 1).random()
        val result = diceValue[resultIndex]

        println("Результат броска: $result")

    }

}

class FourSidedDice(
) : Dice() {

    override val diceSides: Int = 4
    override val diceValue: List<Int> = listOf(1, 2, 3, 4)

    override fun rollDice() {

        val resultIndex = (0..diceValue.size - 1).random()
        val result = diceValue[resultIndex]

        println("Результат броска: $result")

    }

}

class EightSidedDice(
) : Dice() {

    override val diceSides: Int = 8
    override val diceValue: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    override fun rollDice() {

        val resultIndex = (0..diceValue.size - 1).random()
        val result = diceValue[resultIndex]

        println("Результат броска: $result")

    }

}