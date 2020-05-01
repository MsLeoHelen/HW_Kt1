package kotlin_code

import kotlin.Short as Short

fun main() {
    val num1: Int = enterInt("Введите первое число: ")
    val num2: Int = enterInt("Введите второе число: ")
    val num3: Int = enterInt("Введите третье число: ")

    var positive = 0
    if (num1 > 0) positive++
    if (num2 > 0) positive++
    if (num3 > 0) positive++

    print("Вы ввели $positive")
    when (positive) {
        0 -> println(" положительных чисел")
        1 -> println(" положительное число")
        in 2..3 -> println(" положительных числа")
    }
}