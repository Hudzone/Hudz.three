package lesson_22

fun main() {

    val rb1 = RegularBook("Книга 1", "Автор 1")
    val rb2 = RegularBook("Книга 1", "Автор 1")
    val rb3 = DataBook("Книга 2", "Автор 2")
    val rb4 = DataBook("Книга 2", "Автор 2")

    println(rb1 == rb2)
    println(rb3 == rb4)

    // в случае обычного класса сравниваются ссылки на созданный обьект в памяти,
    // поэтому они всегда будут false
    // в случае же data класса сравниваются данные зашитые в классе, поэтому при том условии
    // что параметры у одного класса равны - значение будет true

}

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)