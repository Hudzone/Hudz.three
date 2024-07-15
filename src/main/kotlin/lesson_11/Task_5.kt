package lesson_11


fun main() {
    val forumInstance = Forum(1, "О технологиях")

    val user_1 = forumInstance.createNewUser("Boris")
    val user_2 = forumInstance.createNewUser("Anton")

    forumInstance.createNewMessage(forumInstance.userList[0].userId)
    forumInstance.createNewMessage(forumInstance.userList[1].userId)

    forumInstance.printTread()
}

class Forum(
    val forumId: Int,
    var forumTitle: String,
    var userList: MutableList<ForumMember> = mutableListOf(),
    var messagesBase: MutableMap<ForumMember, ForumMessage> = mutableMapOf(),
) {
    fun createNewUser(
        name: String,
        id: Int = (0..100).random(),
    ) {
        val usr = ForumMember(id, name)
        userList.add(usr)
    }

    fun createNewMessage(id: Int) {
        val objThatNeeded = userList.find { it.userId == id }

        if (objThatNeeded != null) {
            val usrMessage = "Тестовое сообщение хехеххехехех"
            val message = ForumMessage(id, usrMessage)
            messagesBase.put(objThatNeeded, message)
        } else {
            println("Пользователь не найден!")
        }

    }

    fun printTread() {
        println("ТРЕД:")
        messagesBase.forEach { (forumMember, forumMessage) ->
            println("${forumMember.userName}: ${forumMessage.message}")
        }
    }
}

class ForumMember(
    var userId: Int,
    var userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)