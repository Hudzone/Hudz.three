package lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val eMail: String,
) {

}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val eMail: String,
    var bio: String = "",
) {

    fun printInfo() {
        println(
            """
        === ПОЛЬЗОВАТЕЛЬ 1 ===
        ID: $id
        Login: $login
        Password: $password
        EMail: $eMail
        Biography: $bio
        """.trimIndent()
        )
    }

    fun changeBio() {
        println("Введите информацию в поле bio: ")
        val userInput: String = readln()
        bio = userInput
        println("Информация в поле bio изменена!")
    }

    fun changePassword() {
        println("=== МЕНЮ ИЗМЕНЕНИЯ ПАРОЛЯ ===")
        print("Ведите текущий пароль: ")
        val userInput: String = readln()

        if (userInput == password) {
            print("Валидация пройдена. Введите новый пароль: ")
            val newPassword = readln()
            password = newPassword
        } else {
            println("Валидация не пройдена!")
        }
    }
}

fun main() {
    val user1 = User2(1, "Pena", "12345", "my@mail.com")

    user1.printInfo()

    user1.changeBio()

    user1.changePassword()

    user1.printInfo()
}