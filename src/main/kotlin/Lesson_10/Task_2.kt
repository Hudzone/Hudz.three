package Lesson_10

const val MIN_CRED_LENGTH = 4

fun main() {

    print("Введите логин: ")
    val userName = readln()
    print("Введите пароль: ")
    val userPassword = readln()

    credentialValidation(userName, userPassword)

}

fun credentialValidation(login: String, pass: String) {
    if (login.length < MIN_CRED_LENGTH || pass.length < MIN_CRED_LENGTH) {
        println("Логин или пароль недостаточно длинные!")
    } else {
        println(
            """
            Ваш логин: ${login}
            Ваш пароль: ${pass}
        """.trimIndent()
        )
    }
}