package Lesson_6

fun main() {
    println("===РЕГИСТРАЦИЯ===")
    print("Введите логин: ")
    val regLogin: String = readln()
    print("Введите пароль: ")
    val regPass: String = readln()
    println("Пользовательские данные созданы! Теперь вы можете войти!")

    var authLogin: String = "null"
    var authPass: String = "null"

    while (authLogin != regLogin && authPass != regPass) {
        println("\n===АВТОРИЗАЦИЯ===")
        print("Введите логин: ")
        authLogin = readln()
        print("Введите пароль: ")
        authPass= readln()

        if (authLogin == regLogin && authPass == regPass) {
            println("Авторизация прошла успешно")
        } else {
            println("Логин или пароль введены неверно! Повторите!")
        }
    }
}