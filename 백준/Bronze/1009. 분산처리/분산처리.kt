import kotlin.math.pow
import kotlin.text.appendLine

fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()

    repeat(t) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        var result = 1

        for (i in 1..b) {
            result = (result * a) % 10
        }

        if (result == 0) {
            sb.appendLine(10)
        } else {
            sb.appendLine(result)
        }
    }
    println(sb)
}