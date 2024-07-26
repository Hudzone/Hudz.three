package lesson_15

fun main() {

    val balabolnya = Forum()

    println("Форум создан")

    val vasya = User(1, balabolnya, "Васёк")
    val borya = User(2, balabolnya, "Убиватор666")

    printUser(balabolnya)

    val goga = Admin(0, balabolnya, "Повелитель_всея_всего")
    val lyoha = Admin(999, balabolnya, "Баню_по_приколу!_Вопросы?")

    printAdmin(balabolnya)

    vasya.send(balabolnya, message = "Чет питсы захотелось, жиесь")
    borya.send(balabolnya, message = "А ничего тебе больше не захотелось, чорт??")
    goga.send(balabolnya, message = "Так тут ты попутал, другалек, удаляю сообщение!")
    lyoha.send(balabolnya, message = "А еще я удалю тебя Борька, и твое сообщение Васян! Тред закрт))))))")

    vasya.read(balabolnya)

    goga.deleteMessage(balabolnya, "А ничего тебе больше не захотелось, чорт??")
    goga.read(balabolnya)

    lyoha.deleteUser(balabolnya, borya)

    lyoha.deleteMessage(balabolnya, "Чет питсы захотелось, жиесь")

    goga.send(balabolnya, message = "Че мы одни тут остались теперь чтоли???")
    lyoha.send(balabolnya, message = "А гоу чек")
    lyoha.read(balabolnya)
    printUser(balabolnya)
    lyoha.send(balabolnya, message = "Рил))0")
    lyoha.read(balabolnya)


}

interface ForumBaseActions {

    fun send(address: Forum, author: ForumBaseActions = this, message: String)
    fun read(message: Forum)

}

class Forum(
    var users: MutableList<User> = mutableListOf(),
    var admins: MutableList<Admin> = mutableListOf(),
    var messages: MutableList<MessageObj> = mutableListOf(),
)

class MessageObj(
    val author: ForumBaseActions,
    val body: String,
    val id: Int = (1..1311415).random(),
) {}

open class User(
    val id: Int,
    val forum: Forum,
    val name: String,
) : ForumBaseActions {

    init {
        forum.users.add(this)
    }

    override fun send(address: Forum, user: ForumBaseActions, message: String) {

        val text = MessageObj(this, message)
        address.messages.add(text)

    }

    override fun read(source: Forum) {
        source.messages.forEach { sms ->
            println(
                """
                ID: ${sms.id} Author: ${sms.author} 
                ===================================
                ${sms.body}
                ===================================
            """.trimIndent()
            )
            println()
        }
    }
}

class Admin(
    val id: Int,
    val forum: Forum,
    val name: String
) : ForumBaseActions {

    init {
        forum.admins.add(this)
    }

    override fun send(address: Forum, user: ForumBaseActions, message: String) {

        val text = MessageObj(this, message)
        address.messages.add(text)

    }

    override fun read(source: Forum) {
        source.messages.forEach { sms ->
            println(
                """
                ID: ${sms.id} Author: ${sms.author} 
                ===================================
                ${sms.body}
                ===================================
            """.trimIndent()
            )
            println()
        }
    }

    fun deleteUser(forum: Forum, user: User) {

        forum.users.remove(user)
        println("${user.name} has been deleted")

    }

    fun deleteMessage(forum: Forum, message: String) {

        val seekMessage = forum.messages.find { it.body == message }

        forum.messages.remove(seekMessage)
        println("Message has been deleted")

    }
}

fun printUser(source: Forum) {
    println("Пользаки: ")
    source.users.forEach { it ->
        println("${it.id} ${it.name}")
    }
    println()
}

fun printAdmin(source: Forum) {
    println("Админота: ")
    source.admins.forEach { it ->
        println("${it.id} ${it.name}")
    }
    println()
}