package lesson_13


fun main() {

    val contactList: List<ContactI> = listOf(
        ContactI("User1", 84759837473, "Atlassian"),
        ContactI("User2", 84759837473, null),
        ContactI("User3", 84759837473, "null"),
        ContactI("User4", 84759837473, null),
        ContactI("User5", 84759837473, "Mundfish"),
    )

    val resultList =
        contactList.mapNotNull { contact -> if (contact.company != "null" && contact.company != null) contact else null }

    println("Список существующих компаний: ")
    resultList.forEach { contact -> println("${contact.company}") }

}

class ContactI(val name: String, val number: Long, val _company: String?) {
    val company: String? = _company

    fun print() {
        println("Имя: $name\nНомер: $number\nКомпания: ${company ?: "<не указано>"}\n")
    }
}