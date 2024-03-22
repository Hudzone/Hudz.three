package Lesson_6

fun main() {
    println("===РЕГИСТРАЦИЯ===")
    print("Введите логин: ")
    val regLogin: String = readln()
    print("Введите пароль: ")
    val regPass: String = readln()
    println("Пользовательские данные созданы! Теперь вы можете войти!")
    var x = 1

    while (true) {
        println("\n===АВТОРИЗАЦИЯ=Попытка=${x++}===")
        print("Введите логин: ")
        var authLogin: String = readln()
        print("Введите пароль: ")
        var authPass: String = readln()

        if (authLogin == regLogin && authPass == regPass) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Логин или пароль введены неверно! Повторите!")
        }
    }
}