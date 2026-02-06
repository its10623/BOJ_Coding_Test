fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()
    repeat(t) {
        var input = readln().toInt()
        val coins = listOf(25, 10, 5, 1)
        val pocket = mutableListOf<Int>()

        for (coin in coins) {
            pocket.add(input / coin)
            input %= coin
        }
        sb.append(pocket.joinToString(" "))
        sb.append("\n")
    }
    println(sb.toString())
}