fun main() {
    val input = readln().toInt()

    val side = (1 shl input) + 1

    println(side * side)
}