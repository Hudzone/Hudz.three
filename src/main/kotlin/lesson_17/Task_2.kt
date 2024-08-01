package lesson_17

fun main() {

    val sterlad = Ship()
    sterlad.name = "Пажилая капибара"
    println(sterlad.name)

}

class Ship {

    var name: String = "Стрелядь"
        get() = field
        set(value) {
            if (field != value) {
                println("Поменять имя нельзя!")}
        }

    val avSpeed: Int = 100

    val regPort: String = "Портланд"
}