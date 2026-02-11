fun main() {
    val n = readln().toInt()
    val x = readln().split(" ").map { it.toInt() }

    var count = 0

    for (i in 0 until n) {
        val basket = mutableListOf<Int>()
        for (j in 1..x[i]) {
            if (x[i] % j == 0) {
                basket.add(j)
            }
        }
        if (basket.size == 2) {
            count++
        }
    }

    println(count)
}