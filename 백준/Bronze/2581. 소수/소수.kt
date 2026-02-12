fun main() {
    val m = readln().toInt()
    val n = readln().toInt()

    val result = mutableListOf<Int>()

    for (i in m..n) {
        val basket = mutableListOf<Int>()
        for (j in 1..i) {
            if (i % j == 0) {
                basket.add(j)
            }
        }
        if (basket.size == 2) {
            result.add(i)
        }
    }

    if (result.isEmpty()) {
        println(-1)
    } else {
        println(result.sum())
        println(result[0])
    }
}