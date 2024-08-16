package lessons_11_20.lesson_17

fun main() {

    val folder = Folder("Фильмы", 14, false)
    val folder2 = Folder("Немецкие фильмы", 12121, true)

    println("Название папки: ${folder.name}. Количество файлов: ${folder.filesQuantity}")
    println("Название папки: ${folder2.name}. Количество файлов: ${folder2.filesQuantity}")

}

class Folder(
    private val _name: String,
    private val _filesQuantity: Int,
    private var isPrivate: Boolean,
) {

    val name
        get() = if (isPrivate) "Cкрытая папка" else _name

    val filesQuantity: Int
        get() = if (isPrivate) 0 else _filesQuantity

}