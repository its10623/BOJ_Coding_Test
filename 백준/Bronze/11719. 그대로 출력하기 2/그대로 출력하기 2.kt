fun main() {
    val sb = StringBuilder()
    while (true) {
        val input = readlnOrNull() ?: break
        sb.appendLine(input)
    }
    println(sb.toString())
}