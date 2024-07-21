package lesson_14

fun main() {

    val chat = Chat()

    chat.addMessage("Геннадий", "А что вы думаете о Ктулху?")
    chat.addThreadMessage(chat.messages[0], "КтулхуФхтагн!", "Спииииит родимый, дожидается!")
    chat.addThreadMessage(chat.messages[0], "Анон", "Совсем чокнулись уже, пейте таблетки")

    chat.printChat()
}

class Chat(
    var messages: MutableList<Message> = mutableListOf(),
) {
    fun addMessage(
        author_name: String,
        message_body: String,
    ) {
        val message: Message = Message(author = author_name, message = message_body)
        messages.add(message)
        messages.groupBy { it.messageId }
    }

    fun addThreadMessage(
        parentMessage: Message,
        author_name: String,
        message_body: String,
    ) {
        val subMessage: ChildMessage = ChildMessage(parentMessage, author_name, message_body)
        parentMessage.subMessages.groupBy { it.parentMessageId }
    }

    fun printChat() {

        messages.forEach { it ->
            println(
                """
                =========================
                ID: ${it.messageId} Автор: ${it.author}
                =========================
                ${it.message}
                тред --->
                
            """.trimIndent()
            )

            it.subMessages.forEach { it ->
                println("\tID: ${it.parentMessageId} Автор: ${it.author}\n\t${it.message}\n")
            }
        }

    }

}

open class Message(
    val author: String,
    val message: String,
    var subMessages: MutableList<ChildMessage> = mutableListOf(),
    val messageId: Int = (0..99999).random(),
) {

    fun addChildMessage(message: ChildMessage) {
        subMessages.add(message)
    }

}

class ChildMessage(
    val parentMessage: Message,
    author: String,
    message: String,
    val parentMessageId: Int = (0..99999).random(),
) : Message(author, message) {

    init {
        parentMessage.addChildMessage(this)
    }

}