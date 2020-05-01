package kotlin_code

fun enterInt(): Int {
    return enterInt("Введи целое число: ")
}

fun enterInt(massage: String): Int {
    var str: String?
    loop@ while (true) {
        print(massage)
        str = readLine()
        when {
            str == "" -> println("Вы ничего не ввели")
            str!!.all { it.isDigit() || it == '-' } -> {
                return str!!.toInt()
            }
            else -> println("Это не число")
        }
    }
}