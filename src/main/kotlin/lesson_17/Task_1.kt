package lesson_17

fun main() {

    val question: String = "Сколько будет дважды два"
    val answer: Int = 4

    val quiz = Quiz(question, answer.toString())

}

class Quiz(_question: String, _answer: String) {

    val question = _question
        get() = field

    var answer = _answer
        get() = field
        set(value) {
            field = value
        }
}

