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
    var userList: MutableList<forumMember> = mutableListOf(),
    var messagesBase: MutableMap<forumMember, forumMessage> = mutableMapOf(),
) {
    fun createNewUser(
        name: String,
        id: Int = (0..100).random(),
    ) {
        val usr = forumMember(id, name)
        userList.add(usr)
    }

    fun createNewMessage(id: Int) {
        val objThatNeeded = userList.find { it.userId == id }

        if (objThatNeeded != null) {
            val usrMessage = "Тестовое сообщение хехеххехехех"
            val message = forumMessage(id, usrMessage)
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

class forumMember(
    var userId: Int,
    var userName: String,
)

class forumMessage(
    val authorId: Int,
    val message: String,
)