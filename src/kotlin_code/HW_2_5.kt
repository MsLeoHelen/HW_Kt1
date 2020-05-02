package kotlin_code

fun main(){
    var inch = 1
    var centimeter = 254
    val centInOneInch = 254
    while (inch <= 20) {
        println(inch.toString() + " д. = " + centimeter / 100 + "." + centimeter % 100 + " см.")
        inch++
        centimeter += centInOneInch
    }
}