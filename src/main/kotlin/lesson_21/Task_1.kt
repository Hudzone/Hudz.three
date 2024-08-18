package lesson_21

fun main() {

    val string: String = "Ты не верь слезам, все вернется"
    print(string.vowelCounter())

}

fun String.vowelCounter(): Int {
    val vowels: List<Char> = listOf('а', 'я', 'у', 'о', 'ю', 'е', 'ё', 'э', 'и', 'ы')
    return this.count { it in vowels }
}