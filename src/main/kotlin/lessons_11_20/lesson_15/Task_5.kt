package lessons_11_20.lesson_15

const val MAX_SEDAN_PASSENGERS: Int = 3
const val MAX_CARGO_PASSENGERS: Int = 1
const val MAX_CARGO_STORAGE: Int = 2

fun main() {

    val volvo = Sedan()
    val bmw = Sedan()
    val benz = Truck()

    volvo.letPassengersIn(3)
    bmw.letPassengersIn(2)
    benz.letPassengersIn(1)
    benz.load(2)

    volvo.move()
    bmw.move()
    benz.move()

}

interface Movable {

    fun letPassengersIn(passenger: Int)
    fun load(cargo: Int)
    fun move()

}

abstract class Car {

    abstract val passengers: Int
    abstract val storage: Int

}

class Sedan(
    override var passengers: Int = 0,
    override var storage: Int = 0
) : Car(), Movable {

    var isPassengersHere = false

    override fun letPassengersIn(passenger: Int) {

        if (passengers <= MAX_SEDAN_PASSENGERS) {
            passengers = passenger
            println("Пассажиры загружены!")
        } else {
            println("Максимальное количество пассажиров $MAX_SEDAN_PASSENGERS")
        }

        isPassengersHere = true

    }

    override fun load(cargo: Int) {
        println("Перевозка грузов невозможна")
    }

    override fun move() {

        if (isPassengersHere) {
            println("Поехали")
        } else {
            println("Загрузите пассажиров")
        }

    }
}

class Truck(
    override var passengers: Int = 0,
    override var storage: Int = 0,
) : Car(), Movable {

    var isPassengersHere = false
    var isCargoHere = false

    override fun letPassengersIn(passenger: Int) {

        if (passengers <= MAX_CARGO_PASSENGERS) {
            passengers = passenger
            println("Пассажиры загружены!")
        } else {
            println("Максимальное количество пассажиров $MAX_SEDAN_PASSENGERS")
        }

        isPassengersHere = true

    }

    override fun load(cargo: Int) {

        if (storage <= MAX_CARGO_STORAGE) {
            storage = cargo
            println("Погрузка завершена!")
        } else {
            println("Максимальное количество груза $MAX_CARGO_STORAGE тонн")
        }

        isCargoHere = true

    }

    override fun move() {

        if (isPassengersHere && isCargoHere) {
            println("Поехали")
        } else {
            println("Загрузите груз и пассажиров")
        }

    }

}