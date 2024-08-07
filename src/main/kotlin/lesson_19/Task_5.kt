package lesson_19


fun main() {

    var i: Int = 0
    val infoStorage: MutableList<Human> = mutableListOf()

    println("Введите имя русском языке и пол (М или Ж)")

    while (i < 5) {

        print("Имя: ")
        val inputName: String = readln().trim().replaceFirstChar { it.uppercase() }

        print("Пол: ")
        val inputGender: String = readln().trim().replaceFirstChar { it.uppercase() }
        println()

        var resultGender: Gender

        if (inputGender == "М") {
            resultGender = Gender.MALE
        } else if (inputGender == "Ж") {
            resultGender = Gender.FEMALE
        } else {
            println("Пол указываем М или Ж. Данный экземпляр не будет создан")
            continue
        }

        ++i

        val user: Human = Human(inputName, resultGender)

        infoStorage.add(user)

    }

    println("КАРТОТЕКА: ")
    infoStorage.forEach { user ->
        println("Имя: ${user.name}. Пол: ${user.gender.description} ")
    }

}

enum class Gender(val description: String) {
    MALE("мужской"),
    FEMALE("женский"),
}

class Human(
    val name: String,
    val gender: Gender,
)