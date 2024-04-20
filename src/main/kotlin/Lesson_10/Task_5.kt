package Lesson_10

const val JWT_TOKEN_LENGTH = 32

fun main() {
    val userLogin = "faust"
    val userPassword = "password"

    print("Логин: ")
    val typedLogin = readln()
    print("Пароль: ")
    val typedPassword = readln()

    val userStatus = validateUser(userLogin, userPassword, typedLogin, typedPassword)

    val jwtToken = createJWT(userStatus)

    val tokenStatus = jwtValidation(jwtToken)

    if (userStatus && tokenStatus) {
        printCart()
    } else {
        println("Неудачная авторизация!")
    }

}

fun validateUser(userLogin: String, userPassword: String, typedLogin: String, typedPassword: String): Boolean {

    if (userLogin == typedLogin && userPassword == typedPassword) {
        return true
    } else {
        return false
    }
}

fun createJWT(validationStatus: Boolean): String {

    val engSym: CharRange = 'a'..'z'
    val upEngSym: CharRange = 'A'..'Z'
    val numSym: IntRange = 0..9
    val symbolsPool = engSym.toList() + numSym.toList() + upEngSym.toList()
    val jwtToken = StringBuilder()

    for (i in 1..JWT_TOKEN_LENGTH) {
        val generatedSymbol = symbolsPool.random()
        jwtToken.append(generatedSymbol)
    }

    return jwtToken.toString()
}

fun jwtValidation(token: String): Boolean {
    if (token != "null") {
        return true
    } else {
        return false
    }
}

fun printCart() {
    val userCart = listOf("Картофель", "Курица", "Лук", "Чеснок", "Огурцы", "Ракета falcon-x")

    println("Ваш список продуктов: ")
    var i = 0
    userCart.forEach { product ->
        println("${++i}. $product")
    }
}