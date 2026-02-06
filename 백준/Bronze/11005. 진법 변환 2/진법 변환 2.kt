fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }

    val result = a.toString(b)
    println(result.uppercase())
}
