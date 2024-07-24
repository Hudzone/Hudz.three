package lesson_14

fun main() {

    val planet = Planet("Jupiter", true, false)
    val satellite1 = Satellite("Io",planet,true,false)
    val satellite2 = Satellite("Ganimed",planet,true,true)

    println("""
        === ИНФОРМАЦИЯ О ПЛАНЕТЕ===
        Название: ${planet.name}
        Есть ли атмосфера: ${planet.isAtmosphereExist}
        Пригодна ли для высадки: ${planet.isEqualForLanding}
        
        === ИНФОРМАЦИЯ О СПУТНИКАХ ${planet.name} ===
    """.trimIndent())

    planet.satellites.forEach { sattelite ->
        println("""
            ----------------------
            Название: ${sattelite.name}
            Есть ли атмосфера: ${sattelite.isAtmosphereExist}
            Пригоден ли для высадки: ${sattelite.isEqualForLanding}
        """.trimIndent())
        println("----------------------")
    }



}

open class SpaceObject(
    val name: String,
    val isAtmosphereExist: Boolean,
    val isEqualForLanding: Boolean,
) {}

class Planet(
    name: String,
    isAtmosphereExist: Boolean,
    isEqualForLanding: Boolean,
    var satellites: MutableList<Satellite> = mutableListOf(),
) : SpaceObject(name, isAtmosphereExist, isEqualForLanding) {

    fun addSatellite(satellite: Satellite) {
        satellites.add(satellite)
    }
}

class Satellite(
    name: String,
    val referToPlanet: Planet,
    isAtmosphereExist: Boolean,
    isEqualForLanding: Boolean,
) : SpaceObject(name, isAtmosphereExist, isEqualForLanding) {

    init {
        referToPlanet.addSatellite(this)
    }

}