package Lesson_10

const val MAX_SYMBOLS = 16
const val MAX_NUMERALS = 9

fun main() {
    println("===PASS GENERATOR===")
    print("Укажите длину пароля: ")
    val passwordLength = readln().toInt()

    passGen(passwordLength)
}

fun passGen(length: Int) {
    val numProg = 0..MAX_NUMERALS
    val symbols = listOf<String>("!", "#", "$", "%", "&", "\'", "(", ")", "*", "+", ",", "-", ".", "/","\"", " ")
    val password = StringBuilder()

    for (i in 1..(length / 2)) {
        val fstSym = numProg.random()
        val scnSym = symbols[(0 until MAX_SYMBOLS).random()]

        password.append(fstSym)
        password.append(scnSym)
    }

    println("$password")
}