package kotlin_code

fun main(){
    var sum = 0
    var number = 1
    while (number <= 256) {
        sum += number
        number *= 2
    }
    println("Ответ $sum")
}