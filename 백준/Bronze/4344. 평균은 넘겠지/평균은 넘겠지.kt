fun main() {
    val c = readln().toInt()

    repeat(c) {
        println(solution())
    }
}

fun solution(): String {
    val input = readln().split(" ").map { it.toInt() }
    val n = input[0]

    val avg = (input.sum() - n) / n

    var count = 0

    for (i in 1 until input.size) {
        if (avg < input[i]) {
            count++
        }
    }

    val avgCount = (count.toDouble() / n) * 100.toDouble()
    val result = String.format("%.3f",avgCount)
    return "$result%"
}