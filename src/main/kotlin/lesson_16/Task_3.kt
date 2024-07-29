package lesson_16

fun main() {

    val user1 = User("vasya37RUS", "qwerty123")

    val password = "qwerty123"

    user1.validation(password)

}

class User(
    val login: String,
    private val password: String
) {

    fun validation(typedPass: String) {
        if (password == typedPass) {
            println("Пароль верен!")
        } else {
            println("Пароль неверен!")
        }
    }

}