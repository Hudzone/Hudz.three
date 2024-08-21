package lesson_22

fun main() {

    val p = Person("John Doe", 22, 179)
    val (name, age, height) = p

    println("Имя: $name\nВозраст:$age\nРост:$height")

}

data class Person(
    val name: String,
    val age: Int,
    val height: Int,
)