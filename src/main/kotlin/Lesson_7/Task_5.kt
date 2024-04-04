package Lesson_7

import kotlin.random.Random

const val MIN_PASS_LENGTH: Int = 6

fun main() {
    println("===ГЕНЕРАТОР ПАРОЛЕЙ===")
    val numProg = 0..9
    val charProg = 'a'..'z'
    val upCharProg = 'A'..'Z'
    var password = StringBuilder()

    while (true) {
        print("Введите желаемую длину пароля: ")
        val passLength: Int = readln().toInt()

        if (passLength < MIN_PASS_LENGTH) {
            println("Длина пароля должна быть больше 5 символов!!!")
        } else {

            for (i in 0 until passLength) {
                val randSym = listOf(charProg.random(),numProg.random(),upCharProg.random())
                val randInd = Random.nextInt(0, randSym.size)
                val sign = randSym[randInd]
                password.append(sign)
            }

            break
        }
    }

    println("Ваш пароль: $password")

}