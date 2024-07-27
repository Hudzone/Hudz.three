package lesson_15

fun main() {

    val fish = Crucian("Карась")
    val seagull = Seagull("Чайка")
    val duck = Duck("Утка")

    fish.swim()
    fish.diveIn()
    fish.popUp()

    seagull.fly()
    seagull.land()
    seagull.takeOff()

    duck.swim()
    duck.diveIn()
    duck.popUp()
    duck.fly()
    duck.land()
    duck.takeOff()

}

interface Swimming {

    fun swim()

    fun diveIn()

    fun popUp()

}

interface Flying {

    fun fly()

    fun land()

    fun takeOff()

}


class Crucian(val name: String) : Swimming {

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

class Seagull(val name: String) : Flying {

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

class Duck(val name: String) : Swimming, Flying {

    override fun swim() {
        println("$name плывет по поверхности")
    }

    override fun diveIn() {
        println("$name ныряет")
    }

    override fun popUp() {
        println("$name выниривает")
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