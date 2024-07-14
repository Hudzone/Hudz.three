package lesson_11

import java.util.*

//Реализовать класс работы форума (Forum).
//Для реализации создай дополнительные классы для сущностей “Член форума” (с полями userId и userName)
//и “Сообщение форума” (с полями authorId и message).
//
//Примени паттерн “Фабрика” для создания пользователей и сообщений форума.
//Напрямую объекты не создаются, логика должна быть инкапсулирована внутри методов класса.
//
//- createNewUser() создает новых пользователей, принимая имя пользователя.
//Метод сохраняет нового пользователя в общий список и одновременно возвращает новый объект.
//Генерация id-шников новых пользователей происходит внутри;
//
//- createNewMessage() создает сообщения, принимая id пользователя.
//Сообщения создаются только если такой пользователь есть на форуме;
//
//- printThread() печатает в консоль все сообщения добавленные на форум в формате:
//
//автор: сообщение
//автор: сообщение
//
//Создай экземпляр Forum и продемонстрируй его работу,
//добавив двух пользователей и по два сообщения от каждого пользователя.

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