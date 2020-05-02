package kotlin_code

fun main() {
    var num = 1
    var sum = 0
    while (num <= 99) {
        sum += num
        num += 2
    }
    println("Сумма всех нечетныъ чисел от 0 до 100 - $sum")
}