fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()

    var s = 0

    repeat(n) {
        val input = readln().split(" ")

        val a = input[0]
        val b = if (input.size == 2) input[1].toInt() else 0


        when(a) {
            "add" -> s = s or (1 shl b)
            "remove" -> s = s and (1 shl b).inv()
            "check" -> {
                if ((s and (1 shl b)) != 0) {
                    sb.appendLine(1)
                } else sb.appendLine(0)
            }
            "toggle" -> s = s xor (1 shl b)
            "all" -> s = (1 shl 21) - 1
            "empty" -> s = 0
        }
    }
    println(sb.toString())
}