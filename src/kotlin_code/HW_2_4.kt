package kotlin_code

fun main() {
    var a: Int = enterInt("Введи A: ")
    var b: Int = enterInt("Введи B: ")

    var multiplication: Int = 0
    var negativ: Int = 0
    if (a != 0 && b != 0) {
        if (a < 0){
            a *= -1
            negativ++
        }
        if (b < 0) {
            b *= -1
            negativ++
        }

        while (b-- > 0) {
            multiplication += a
        }

        if (negativ == 1) multiplication *= -1
    }
    println("Результат умнажения ваших чисел $multiplication")
}