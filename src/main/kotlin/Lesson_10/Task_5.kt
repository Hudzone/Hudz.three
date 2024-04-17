package Lesson_10

const val JWT_TOKEN_LENGTH = 32

fun main() {
    val userLogin = "faust"
    val userPassword = "password"

    print("Логин: ")
    val typedLogin = readln()
    print("Пароль: ")
    val typedPassword = readln()

    val authToken = createJWT(userLogin, userPassword, typedLogin, typedPassword)

    getCart(authToken)

}

fun createJWT(
    username: String, password: String, userInput1: String, userInput2: String
): String {

    val engSym: CharRange = 'a'..'z'
    val upEngSym: CharRange = 'A'..'Z'
    val numSym: IntRange = 0..9
    val symbolsPool = engSym.toList() + numSym.toList() + upEngSym.toList()
    val jwtToken = StringBuilder()

    if (username == userInput1 && password == userInput2) {

        for (i in 1..JWT_TOKEN_LENGTH) {
            val generatedSymbol = symbolsPool.random()
            jwtToken.append(generatedSymbol)
        }
    } else {
        jwtToken.append("null")
    }

    return jwtToken.toString()
}

fun getCart(jwtToken: String) {
    val userCart = listOf("Картофель", "Курица", "Лук", "Чеснок", "Огурцы", "Ракета falcon-x")

    if (jwtToken != "null") {
        println("Ваш список продуктов: ")
        var i = 0
        userCart.forEach { product ->
            println("${++i}. ${product}")
        }
    } else {
        println("Авторизация была неудачной!")
    }
}