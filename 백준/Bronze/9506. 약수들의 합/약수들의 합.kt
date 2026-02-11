fun main() {
    val sb = StringBuilder()

    while (true) {
        val input = readln().toInt()
        if (input == -1) break
        val basket = mutableListOf<Int>()
        for (i in 1 until input) {
            if (input % i == 0) {
                basket.add(i)
            }
        }

        if (basket.sum() == input) {
            sb.appendLine("$input = ${basket.joinToString(" + ")}")
        } else {
            sb.appendLine("$input is NOT perfect.")
        }
    }
    println(sb)
}