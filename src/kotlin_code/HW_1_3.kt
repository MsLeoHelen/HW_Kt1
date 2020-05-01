package kotlin_code

fun main() {
    var num: Int = enterInt()

    when {
        num > 0 -> num++
        num < 0 -> num -= 2
        num == 0 -> num = 10
    }
    println("Полученное число $num")
}