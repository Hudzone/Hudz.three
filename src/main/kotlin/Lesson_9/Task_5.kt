package Lesson_9

//Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).
//
//- результат должен исключать повторы;
//- список должен выводиться в алфавитном порядке;
//- все элементы списка выведены в одну строку, разделяя слова запятыми;
//- первый элемент должен быть распечатан с заглавной буквы.


fun main() {
    println("Введите ингридиенты!")

    var listOfIngridients = mutableSetOf<String>()

    var i = 0
    while (listOfIngridients.size < 5) {
        print("${++i} ингридиент: ")

        val userInput = readln().lowercase()
        listOfIngridients.add(userInput)

    }

    val sortedList = listOfIngridients.sorted()

    println("СПИСОК ИНГРИДИЕНТОВ: ")

    sortedList.mapIndexed { index, ingridient ->

        if (index == 0) {
            print("${ingridient.replaceFirstChar { it.uppercase() }}, ")
        } else if (index == sortedList.lastIndex) {
            print("${ingridient}.")
        } else
            print("${ingridient}, ")
         }
}