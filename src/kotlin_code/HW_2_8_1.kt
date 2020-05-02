package kotlin_code

fun main() {
    var string = 0
    var space = 3
    while (string < 4) {
        var str = ""
        for (symbol in 0..3) {
            str += if (symbol < space) {
                "  "
            } else {
                " *"
            }
        }
        println(str)
        string++
        space--
    }
}