package lessons_11_20.lesson_14

const val STANDART_SHIELD_CAPACITY: Int = 100

fun main() {

    val linerSample = LinerShip("Evidence")
    linerSample.shipInfo()

    val cargoSample = CargoShip("Yakutsk", 100)
    cargoSample.shipInfo()

    val icebreakerSample = IceBreakerShip("IceKiller2000")
    icebreakerSample.shipInfo()


}

open class LinerShip(
    var name: String,
    var speed: Int = 100,
    var storage: Int = 750,
    var passengers: Int = 1000,
) {

    open fun shipInfo() {
        println(
            """
            SHIP INFORMATION:
            Name: $name
            Max speed: $speed km/h
            Storage capacity: $storage tonn
            Passengers capacity: $passengers passengers
        """.trimIndent()
        )
    }

    open fun shipLoad() {
        println("Activating Ramp")
    }

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

class CargoShip(
    name: String,
    var movers: Int,
) : LinerShip(name, speed = 75, storage = 1500, passengers = 0) {

    override fun shipLoad() {
        if (movers > 50) {
            println("$name' cargo crane activated")
        } else {
            println("Not enough movers")
        }
    }

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

class IceBreakerShip(
    name: String,
    var shield: Int = STANDART_SHIELD_CAPACITY,
) : LinerShip(name, speed = 50, storage = 350, passengers = 0) {

    override fun startTheEngine() {
        super.startTheEngine()
        println("$name' nuclear engine started")
    }

    override fun shipLoad() {
        println("Open gate A")
    }

    fun sailThroughIce() {
        println("$name go through Ice, using shield. Shield condition is $shield percent.")
        shield -= 20
    }

    init {
        println()
    }

}