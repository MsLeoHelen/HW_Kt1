package kotlin_code

fun main() {
    val num1: Int = enterInt("Введите первое число: ")
    val num2: Int = enterInt("Введите второе число: ")
    val num3: Int = enterInt("Введите третье число: ")

    var positive: Int = 0
    var negative: Int = 0

    when {
        num1 > 0 -> positive++
        num1 < 0 -> negative++
    }
    when {
        num2 > 0 -> positive++
        num2 < 0 -> negative++
    }
    when {
        num3 > 0 -> positive++
        num3 < 0 -> negative++
    }

    print("Вы ввели $positive")
    when (positive) {
        0 -> println(" положительных чисел")
        1 -> println(" положительное число")
        in 2..3 -> println(" положительных числа")
    }

    print("Вы ввели $positive")
    when (positive) {
        0 -> println(" отрицательных чисел")
        1 -> println(" отрицательное число")
        in 2..3 -> println(" отрицательных числа")
    }
}