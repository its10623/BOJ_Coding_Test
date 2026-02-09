fun main() {
    val input = readln().toInt()

    var count = 1
    var range = 1

    while (range < input) {
        range += (6 * count)
        count ++
    }

    println(count)
}