package kotlin_code

fun main() {
    var last_distance = 10
    last_distance *= 100

    var distance: Int = 0
    var day: Short = 1
    while (day++ <= 7) {
        distance += last_distance
        last_distance += last_distance / 10
    }
    println("За 7 дней спортсмен суммарно пробежал " + distance / 100 + " километров и " + distance % 100 + " метров.")
}