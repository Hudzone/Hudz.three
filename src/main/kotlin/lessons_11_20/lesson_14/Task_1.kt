package lessons_11_20.lesson_14

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
    open var name: String,
    open var speed: Int = 100,
    open var storage: Int = 750,
    open var passengers: Int = 1000,
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
    override var speed: Int = 75,
    override var storage: Int = 1500,
    override var passengers: Int = 0,
) : Liner(name, speed, storage, passengers) {

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
    override var speed: Int = 50,
    override var storage: Int = 350,
    override var passengers: Int = 0,
    var shield: Int = STANDART_SHIELD_CAPACITY,
) : Liner(name, speed, storage, passengers) {

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