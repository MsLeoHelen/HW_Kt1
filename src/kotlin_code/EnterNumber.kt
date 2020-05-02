package kotlin_code

fun enterInt(): Int {
    return enterInt("Введи целое число: ")
}

fun enterInt(massage: String): Int {
    var str: String?
    loop@ while (true) {
        print(massage)
        str = readLine()
        if (str == "") println("Вы ничего не ввели")
        if (str!![0] == '-')
            when {
                str == "" -> println("Вы ничего не ввели")
                str!!.all { it -> it.isDigit() || it == '-' } -> {
                    if (checkWriting(str))
                        return str!!.toInt()
                    else
                        println("Это не число")
                }
                else -> println("Это не целое число")
            }
    }
}

fun checkNumber(num: Int): Int {
    return when {
        num > 0 -> 1
        num < 0 -> -1
        else -> 0
    }
}

private fun checkWriting(str: String): Boolean {
    str.forEachIndexed { index, it -> if (it == '-' && index != 0) return false }
    return true
}