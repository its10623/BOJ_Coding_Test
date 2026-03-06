import kotlin.text.appendLine

fun main() {
    val sb = StringBuilder(

    )
    while (true) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        if (a + b == 0) {
            break
        }

        if (a <= b) {
            sb.appendLine("No")
        } else {
            sb.appendLine("Yes")
        }
    }

    println(sb)
}