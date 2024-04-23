package lesson_11

class Wall(
    var chatList: MutableList<ChatRoom> = mutableListOf()
) {
    fun createChatRoom(addCover: String, addName: String) {
        val chat = ChatRoom(addCover, addName)
        chatList.add(chat)
    }
}

class ChatRoom(
    val chatCover: String,
    val chatName: String,
    var chatUsers: MutableList<ChatUser> = mutableListOf(),
) {

    fun addUser(newUser: String) {
        val user = ChatUser(newUser)
        chatUsers.add(user)
    }

    fun changeUserStatus(name: String, newStatus: String) {

        chatUsers.forEach { it ->
            if (it.userName == name) {
                it.status = newStatus
            } else {
                println("Такого пользователя нет в комнате!")
            }
        }

    }

    fun printUserInfo(avatar: String) {
        chatUsers.forEach { it ->
            if (it.profileImage.contains(avatar)) {
                println("""
                    === ИНФОРМАЦИЯ О ПОЛЬЗОВАТЕЛЕ ===
                    Логин: ${it.userName}
                    Статус: ${it.status}
                """.trimIndent())
            }
        }
    }
}

class ChatUser(
    val userName: String,
    var status: String = "",
    val profileImage: String = "${userName}_avatar.jpg",
) {}

fun main() {
    val statusList = arrayOf("разговаривает", "микрофон выключен", "пользователь заглушен")
    val chatGroup1 = ChatRoom("1stroom.jpg", "Беседка")
    val user_1 = "Kate"
    val user_2 = "Burunduk"
    chatGroup1.addUser(user_1)
    chatGroup1.addUser(user_2)
    chatGroup1.changeUserStatus(user_1, statusList[0])
    chatGroup1.changeUserStatus(user_2, statusList[2])
    chatGroup1.printUserInfo("${user_1}_avatar.jpg")
    chatGroup1.printUserInfo("${user_2}_avatar.jpg")
}
