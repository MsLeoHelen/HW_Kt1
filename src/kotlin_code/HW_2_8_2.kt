package kotlin_code

fun main() {
    var string: Int = 0
    while (string < 5) {
        var str: String = ""
        for (symbol in 0..4) {
            if(symbol >= string) str += " *"
            else str += "  "
        }
        println(str)
        string++
    }
}