package kotlin_code

fun main() {
    var prog: Int
    do {
        prog = enterInt("Введи число программистов: ")
    }while (checkNumber(prog) == -1)

    var str: String = "$prog программист"
    when {
        (prog % 10 == 0) || (prog % 100 in 9..19) -> str += "ов"
        (prog % 100 in 22..29) || (prog % 10 in 2..4) -> str += "а"
        prog % 10 in 5..8 -> str += "ов"
    }
    println(str)
}