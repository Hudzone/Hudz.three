package lessons_11_20.lesson_13

fun main() {
    val obj = ContactItem("Ростислав", 89123456789)
    obj.print()
}

class ContactItem(val name: String, val number: Long ) {
    val company: String? = null

    fun print() {
        println("Имя: $name\nНомер: $number\nКомпания: ${company ?: "<не указано>"}")
    }
}