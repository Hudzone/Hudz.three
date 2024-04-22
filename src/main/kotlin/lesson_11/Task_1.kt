package lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val eMail: String,
) {

}

fun main() {

    val user1: User = User(1, "PozhilayaChilibomba", "12345", "johndoe@gmail.com")
    val user2: User = User(2, "Chupakabra", "54321", "chupadoe@gmail.com")

    println(
        """
        === ПОЛЬЗОВАТЕЛЬ 1 ===
        ID: ${user1.id}
        Login: ${user1.login}
        Password: ${user1.password}
        EMail: ${user1.eMail}
    """.trimIndent()
    )

    println(
        """
        === ПОЛЬЗОВАТЕЛЬ 2 ===
        ID: ${user2.id}
        Login: ${user2.login}
        Password: ${user2.password}
        EMail: ${user2.eMail}
    """.trimIndent()
    )
}