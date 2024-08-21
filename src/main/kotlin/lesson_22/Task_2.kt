package lesson_22

fun main() {

    val book1 = JustBook("Какое то название", "Какой то автор")
    val book2 = JustDataBook("Какое то название", "Какой то автор")

    println(book1)
    // В данном варианте выводится полное название созданного обьекта

    println(book2)
    // В данном случае используется особая реализация toString() для data class
    // Которая по умолчанию выводится следующим образом Класс(параметр1 = значение...)

}

class JustBook(
    val title: String,
    val author: String,
)

data class JustDataBook(
    val title: String,
    val author: String,
)