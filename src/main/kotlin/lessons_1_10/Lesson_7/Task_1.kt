package lessons_1_10.Lesson_7

const val ITERATIONS = 3

fun main() {
    println("===ГЕНЕРАТОР ПАРОЛЕЙ===")
    val literalRange: CharRange = 'a'..'z'
    val numRange = 0..9
    var password = StringBuilder()

    for (i in 1..ITERATIONS) {
        val randomLiteral = literalRange.random()
        val randomNum = numRange.random()
        password.append(randomLiteral)
        password.append(randomNum)
    }

    println("Ваш пароль: $password")
}