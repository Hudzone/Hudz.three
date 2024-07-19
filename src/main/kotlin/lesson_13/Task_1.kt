package lesson_13


fun main() {
    val obj = Contact("Cheezy", 89883629439, null)
}

class Contact(
    val name: String, val number: Long, val company: String?
)