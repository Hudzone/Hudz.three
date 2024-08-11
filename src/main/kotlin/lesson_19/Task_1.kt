package lesson_19

fun main() {

    println("Вы можете добавить следующих рыб:")
    Fishes.entries.forEach { println(it) }

}

enum class Fishes {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}