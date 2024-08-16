package lessons_11_20.lesson_20

fun main() {

    val splashScreen: (userName: String) -> String = { "С наступающим Новым Годом, $it!" }
    println(splashScreen("имя"))

}