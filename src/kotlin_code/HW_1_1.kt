package kotlin_codefun main() {    var str: String?    loop@ while (true) {        print("Введи число: ")        str = readLine()        when {            str == "" -> println("Вы ничего не ввели")            str!!.all { it.isDigit() } -> {                print("Вы ввели ${str.length}-ое число")                break@loop            }            else -> println("Это не число")        }    }}