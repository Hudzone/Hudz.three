package lessons_11_20.lesson_19


fun main() {

    val infoStorage = authService()

    println("КАРТОТЕКА: ")
    infoStorage.forEach { user ->
        println("Имя: ${user.name}. Пол: ${user.gender.description} ")
    }

}

fun authService() : MutableList<Human> {

    var i: Int = 0
    val infoStorage: MutableList<Human> = mutableListOf()

    println("Введите имя русском языке и пол (М или Ж)")

    while (i < 5) {

        val typedName = nameInput()
        var typedGender: String = genderInput()

        while (typedGender != "М" && typedGender != "Ж") {

            println("Пол указываем М или Ж.")
            typedGender = genderInput()

        }

        val resultGender: Gender = if (typedGender == "М") {
            Gender.MALE
        } else {
            Gender.FEMALE
        }

        ++i

        val user: Human = Human(typedName, resultGender)

        infoStorage.add(user)

    }

    return infoStorage

}

fun nameInput(): String {
    print("Имя: ")
    val inputName: String = readln().trim().replaceFirstChar { it.uppercase() }
    return inputName
}

fun genderInput(): String {
    print("Пол: ")
    val inputGender: String = readln().trim().replaceFirstChar { it.uppercase() }
    return inputGender
}

enum class Gender(val description: String) {
    MALE("мужской"),
    FEMALE("женский"),
}

class Human(
    val name: String,
    val gender: Gender,
)