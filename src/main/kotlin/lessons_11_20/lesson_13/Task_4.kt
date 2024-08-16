package lessons_11_20.lesson_13


fun main() {

    val contactList: MutableList<ContactConstructor> = mutableListOf()

    var i = 0
    while (true) {

        i++

        println("Введите имя: ")
        val userName: String? = readln()

        if (userName == null || userName == " " || userName == "") {
            println("Вы не ввели номер телефона! Контакт не будет добавлен!")
            continue
        } else if (userName == "hvatit") {
            break
        }

        println("Введите номер телефона: ")
        val userNum: Long? = readln().toLongOrNull()

        println("Введите компанию")
        var userCompany: String? = readln()

        if (userCompany == "" || userCompany == " ") {
            userCompany = null
        }

        val obj: ContactConstructor = ContactConstructor(userName, userNum, userCompany)
        contactList.add(obj)
    }

    contactList.forEach { it -> it.print() }

}

class ContactConstructor(val name: String, val number: Long?, val _company: String?) {
    val company: String = _company ?: "<не указано>"

    fun print() {
        println("Имя: $name\nНомер: $number\nКомпания: $company\n")
    }
}