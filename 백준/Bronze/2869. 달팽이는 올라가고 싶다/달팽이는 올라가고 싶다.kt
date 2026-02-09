fun main() {
    val (a, b, v) = readln().split(" ").map { it.toInt() }

    var day = (v - b) % (a - b)

    if (day != 0) {
       day = (v - b) / (a - b) + 1
    } else {
        day = (v - b) / (a - b)
    }

    println(day)
}