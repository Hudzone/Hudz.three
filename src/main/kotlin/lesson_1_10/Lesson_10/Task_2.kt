package lesson_1_10.Lesson_10

const val MIN_CRED_LENGTH = 4

fun main() {

    print("Введите логин: ")
    val userName = readln()
    print("Введите пароль: ")
    val userPassword = readln()

    val isLoginOk = validateString(userName)
    val isPasswordOk = validateString(userPassword)

    if (isLoginOk == true && isPasswordOk == true) {

        println(
            """
            Ваш логин: ${userName}
            Ваш пароль: ${userPassword}
        """.trimIndent()

        )
    } else {
        println("Логин или пароль недостаточно длинные!")
    }

}

fun validateString(string: String): Boolean {
    if (string.length < MIN_CRED_LENGTH) {
        return false
    } else {
        return true
    }

}