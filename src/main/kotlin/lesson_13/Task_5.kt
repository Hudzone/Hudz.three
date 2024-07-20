package lesson_13


fun main() {

    var userPhone: String = readln()

    val obj = ContactBuilder("Vasya", userPhone, "Universal")
    obj.print()
}

class ContactBuilder(val name: String, var number: String?, val _company: String?) {
    val company: String? = _company

    init {
        try {
            number?.toLong()
        } catch (e: NumberFormatException) {
            println("Ошибка: ${e::class.simpleName}")
            number = null
        }
    }

    fun print() {
        println("Имя: $name\nНомер: ${number  ?: "<не указано>"}\nКомпания: ${company ?: "<не указано>"}\n")
    }
}