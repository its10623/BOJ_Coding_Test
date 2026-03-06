fun main() {
    val sb = StringBuilder()
    while (true) {
        val n = readln().split(" ").map { it.toInt() }
        val basket = mutableListOf<Int>()
        for (i in n) {
            basket.add(i)
        }

        if (n.sum() == 0) {
            break
        }
        val maxN = basket.max()
        basket.remove(maxN)

        if (maxN >= basket.sum()) {
            sb.appendLine("Invalid")
        } else if (n[0] != n[1] && n[1] != n[2] && n[0] != n[2]) {
            sb.appendLine("Scalene")
        } else if (n[0] == n[1] && n[1] == n[2] && n[0] == n[2]) {
            sb.appendLine("Equilateral")
        } else {
            sb.appendLine("Isosceles")
        }
    }
    println(sb)
}