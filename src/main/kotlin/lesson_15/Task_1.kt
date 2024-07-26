package lesson_15

fun main() {

    val fish = Crucian("Карась")
    val seagull = Seagull("Чайка")
    val duck = Duck("Утка")

    fish.swim()
    fish.diveIn()
    fish.popUp()

    seagull.diveIn()
    seagull.fly()
    seagull.land()
    seagull.takeOff()

    duck.swim()
    duck.diveIn()
    duck.fly()
    duck.land()
    duck.takeOff()
    
}

interface Waterfowl {

    fun swim() {}

    fun diveIn() {}

    fun popUp() {}

}

interface Flying {

    fun fly() {}

    fun land() {}

    fun takeOff() {}

}

abstract class Creature : Waterfowl, Flying {

    abstract val name: String

}

class Crucian(override val name: String) : Creature(), Waterfowl {

    override fun swim() {
        println("$name плывет")
    }

    override fun diveIn() {
        println("$name погружается")
    }

    override fun popUp() {
        println("$name всплывает")
    }

}

class Seagull(override val name: String) : Creature() {

    override fun diveIn() {
        println("$name ныряет")
    }

    override fun fly() {
        println("$name летит")
    }

    override fun land() {
        println("$name приземляется")
    }

    override fun takeOff() {
        println("$name взлетает")
    }
}

class Duck(override val name: String) : Creature() {

    override fun swim() {
        println("$name плывет по поверхности")
    }

    override fun diveIn() {
        println("$name ныряет")
    }

    override fun fly() {
        println("$name летит")
    }

    override fun land() {
        println("$name приземляется")
    }

    override fun takeOff() {
        println("$name взлетает")
    }

}