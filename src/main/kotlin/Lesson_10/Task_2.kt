package Lesson_10

const val MIN_CRED_LENGTH = 4

fun main() {

    userAuth()

}

fun userLogin() : String = readln()
fun userPass() : String = readln()

fun credentialValidation(login: String, pass: String) {
    if (login.length < MIN_CRED_LENGTH || pass.length < MIN_CRED_LENGTH) {
        println("Логин или пароль недостаточно длинные!")
    } else {
        println("""
            Ваш логин: ${login}
            Ваш пароль: ${pass}
        """.trimIndent())
    }
}

fun userAuth() {
    print("Введите логин: ")
    val userName = userLogin()
    print("Введите пароль: ")
    val userPassword = userPass()

    credentialValidation(userName, userPassword)
}