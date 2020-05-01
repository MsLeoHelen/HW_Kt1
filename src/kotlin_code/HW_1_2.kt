package kotlin_code

fun main(){
    val a: Int = enterInt("Введи сторону a: ")
    val b: Int = enterInt("Введи сторону b: ")
    val c: Int = enterInt("Введи сторону c: ")

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