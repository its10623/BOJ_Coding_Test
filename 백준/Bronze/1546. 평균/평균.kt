fun main() {
    val n = readln().toInt()
    val score = readln().split(" ").map { it.toDouble() }
    val maxValue = score.maxBy { it }

    var sum = 0.0
    score.forEach { i ->
        sum += i / maxValue * 100
    }
    println(sum / n)
}