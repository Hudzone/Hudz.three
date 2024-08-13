package lesson_20

fun main() {

    val listOfStrings: List<String> = listOf("первая", "вторая", "третья", "четвертая", "пятая")

    val lambdaCollection = listOfStrings.map { string ->
        { println("Нажат элемент $string") }
    }

    lambdaCollection.forEachIndexed { index, item ->

        val counter: Int = index + 1

        if (counter % 2 == 0) {
            item()
        }

    }

}