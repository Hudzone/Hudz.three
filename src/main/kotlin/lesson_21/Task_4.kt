package lesson_21

import java.io.File

fun main() {

    val file = File("/Users/hudzone/Desktop/Code/Hudz.three/src/main/kotlin/lesson_21/testfile.txt")

    // Используем нашу extension-функцию
    file.addWord("inittext")
    file.addWord("check rewrite")

}

fun File.addWord(word: String) {

    val fileReading = this.readText()
    val rewrite = word.lowercase() + fileReading
    this.writeText(rewrite)

}