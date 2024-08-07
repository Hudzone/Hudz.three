package lesson_19


fun main() {

    val tank = Tank()
    tank.makeShot()
    tank.rearmBlue()
    tank.makeShot()
    tank.makeShot()
    tank.rearmGreen()
    tank.makeShot()
    tank.rearmRed()
    tank.makeShot()

}

enum class Ammo(val damage: Int?) {
    BLUE(5),
    GREEN(10),
    RED(20),
    EMPTY(null),
}

class Tank(
    private var ammo: Ammo = Ammo.EMPTY,
) {

    private var isTankArmed: Boolean = false

    fun rearmBlue() {
        ammo = Ammo.BLUE
        isTankArmed = true
    }

    fun rearmGreen() {
        ammo = Ammo.GREEN
        isTankArmed = true
    }

    fun rearmRed() {
        ammo = Ammo.RED
        isTankArmed = true
    }

    fun makeShot() {

        if (!isTankArmed) {
            println("Отсутствует снаряд. Зарядите")
        } else {
            println("Произведен выстрел. Урон: ${ammo.damage}")
        }

        ammo = Ammo.EMPTY
        isTankArmed = false

    }

}