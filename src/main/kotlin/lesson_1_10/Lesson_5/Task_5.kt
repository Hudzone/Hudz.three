package lesson_1_10.Lesson_5

fun main() {
    val firstNum: Int = (0..42).random()
    val secondNum: Int = (0..42).random()
    val thirdNum: Int = (0..42).random()
    val generatedNum = listOf(firstNum,secondNum,thirdNum)

    println("Угадайте три числа от 0 до 42 :)")
    print("Первое число: ")
    val firstUserNum: Int = readln().toInt()
    print("Второе число: ")
    val secondUserNum: Int = readln().toInt()
    print("Третье число: ")
    val thirdUserNum: Int = readln().toInt()
    val userNumList = listOf(firstUserNum,secondUserNum,thirdUserNum)

    val result = generatedNum.intersect(userNumList).size

    when (result) {
        3 -> println("Вы угадали все числа! ДЖЕКПОТ!!!")
        2 -> println("Вы угадали два числа, вам достается крупный приз!")
        1 -> println("Вы угадали одно число, вам достается утешительный приз!")
        else -> println("Вы проиграли))))))")
    }

    println("Ваша комбинация: $firstUserNum - $secondUserNum - $thirdUserNum ")
    println("Выигрышная комбинация: $firstNum - $secondNum - $thirdNum")

}