fun main() {
    val n = readln()
    val sb = StringBuilder()

    for (char in n) {
        if (char.isUpperCase()) {
            sb.append(char.lowercase())
        } else {
            sb.append(char.uppercase())
        }
    }
    println(sb.toString())
}