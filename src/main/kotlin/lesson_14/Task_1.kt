package lesson_14

const val STANDART_SHIELD_CAPACITY: Int = 100

fun main() {

    val linerSample = Liner("Evidence")
    linerSample.startTheEngine()
    linerSample.sail()

    val cargoSample = Cargo("Yakutsk", 100)
    cargoSample.loadTheCargo(100)
    cargoSample.startTheEngine()
    cargoSample.sail()
    cargoSample.unloadTheCargo(100)

    val icebreakerSample = IceBreaker("IceKiller2000")
    icebreakerSample.startTheEngine()
    icebreakerSample.sail()
    icebreakerSample.sailThroughIce()


}

open class Liner(
    var name: String,
    var speed: Int = 100,
    var storage: Int = 750,
    var passengers: Int = 1000,
) {

    open fun startTheEngine() {
        println("$name's engine started")
    }

    fun sail() {
        println("$name is sailing")
    }

    init {
        println()
    }

}

class Cargo(
    name: String,
    var movers: Int,
) : Liner(name, speed = 75, storage = 1500, passengers = 0) {

    fun loadTheCargo(capacity: Int) {
        println("$name loaded $capacity t.")
    }

    fun unloadTheCargo(capacity: Int) {
        println("$name unloaded $capacity t.")
    }

    init {
        println()
    }
}

class IceBreaker(
    name: String,
    var shield: Int = STANDART_SHIELD_CAPACITY,
) : Liner(name, speed = 50, storage = 350, passengers = 0) {

    override fun startTheEngine() {
        super.startTheEngine()
        println("$name' nuclear engine started")
    }

    fun sailThroughIce() {
        println("$name go through Ice, using shield. Shield condition is $shield percent.")
    }

    init {
        println()
    }

}