package kotlin_code

fun main() {
    var count: Int = 1
    var hours: Int = 0
    while (hours < 24) {
        count *= 2
        hours += 3
    }
    println("Через 24 часа будет $count амеб.")
}