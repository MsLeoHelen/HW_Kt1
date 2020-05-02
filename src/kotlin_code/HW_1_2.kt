package kotlin_code

fun main(){
    var a: Int
    do {
        a = enterInt("Введи сторону a: ")
    }while (checkNumber(a) == 1)
    var b: Int
    do {
        b = enterInt("Введи сторону b: ")
    } while (checkNumber(b) == 1)
    var c: Int
    do {
        c = enterInt("Введи сторону c: ")
    } while (checkNumber(c) == 1)

    val maxSide: Int
    val otherSide1: Int
    val otherSide2: Int

    if (a > b) {
        otherSide1 = b
        if (a > c) {
            maxSide = a
            otherSide2 = c
        } else {
            maxSide = c
            otherSide2 = a
        }
    } else {
        otherSide1 = a
        if (b > c) {
            maxSide = b
            otherSide2 = c
        } else {
            maxSide = c
            otherSide2 = b
        }
    }
    if (maxSide < otherSide1 + otherSide2) {
        println("Треугольник с такими сторонами существует")
    } else {
        println("Треугольника с такими сторонами не существует")
    }
}