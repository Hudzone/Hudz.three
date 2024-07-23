package lesson_14

import java.util.Objects

fun main() {

    val chat = Chat()

    chat.addMessage("Геннадий", "А что вы думаете о Ктулху?")
    chat.addThreadMessage(chat.messages[0][0], "КтулхуФхтагн!", "Спииииит родимый, дожидается!")
    chat.addThreadMessage(chat.messages[0][0], "Анон", "Совсем чокнулись уже, пейте таблетки")

    chat.addMessage("Виктор", "Как чинить Мицубу Паджеро?")
    chat.addThreadMessage(
        chat.messages[1][0], "Чумазый", "Обращайтесь в наш автосалон"
    )
    chat.addThreadMessage(
        chat.messages[1][0],
        "ВАЗолюб",
        "лучше на наших катать, ее можно ключом и чей то матерью починить"
    )
    chat.printChat()
}

class Chat(
    var idCounter: Int = 0,
    var messages: MutableList<MutableList<Message>> = mutableListOf(),
) {
    fun addMessage(
        author_name: String,
        message_body: String,
    ) {
        val id = ++idCounter
        var messageContainer: MutableList<Message> = mutableListOf()
        val message = Message(author_name, message_body, id)
        messageContainer.add(message)
        messages.add(messageContainer)

    }

    fun addThreadMessage(
        parentMessage: Message,
        author_name: String,
        message_body: String,
    ) {

        messages.find { it.contains(parentMessage) }?.let { it ->

            val childMessage: ChildMessage = ChildMessage(parentMessage, author_name, message_body)
            it.add(childMessage)

        }
    }

    fun printChat() {

        messages.forEach { it ->

            val parentPost = it[0]

            println(
                """
                =========================
                ID: ${parentPost.messageId} Автор: ${parentPost.author}
                =========================
                ${parentPost.message}
                тред --->
                
            """.trimIndent()
            )

            val sortedThreadMessages = it.drop(1).sortedBy { it.messageId }

            sortedThreadMessages.forEach { threadMessage ->
                println("\tID: ${threadMessage.messageId} Автор: ${threadMessage.author}\n\t${threadMessage.message}\n")
            }

        }

    }

}

open class Message(
    val author: String,
    val message: String,
    val messageId: Int,
) {
}

class ChildMessage(
    val parentMessage: Message,
    author: String,
    message: String,
    messageId: Int = (0..99999).random(),
    val parentMessageId: Int = parentMessage.messageId,
) : Message(author, message, messageId) {
}