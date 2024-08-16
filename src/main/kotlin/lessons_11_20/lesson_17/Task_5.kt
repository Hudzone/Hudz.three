package lessons_11_20.lesson_17

fun main() {

    val tolyan = User("tolyan", "shtrikhiRulyat")
    println("Логин: ${tolyan.login}")
    tolyan.login = "tolyan_ubivator"
    println("Логин: ${tolyan.login}")
    println("Пароль: ${tolyan.password}")
    tolyan.password = "vzlomalAShtoTySdelaeshYaVDrugomGorode"
    println("Пароль: ${tolyan.password}")


}

class User(
    private var _login: String,
    private var _password: String,
) {

    var login: String = _login
        get() = field
        set(value) {
            println("Логин успешно изменен!")
            field = value
        }

    var password: String = _password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль!")
        }

}