package kotlin_code

fun main() {
    val num1: Int = enterInt("Введите первое число: ")
    val num2: Int = enterInt("Введите второе число: ")

    when {
        num1 > num2 -> println("Максимальное число - $num1")
        num2 > num1 -> println("Максимальное число - $num2")
        else -> println("Числа равны")
    }
}