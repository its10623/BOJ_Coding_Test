fun main() {
    val n = readln().toInt()

    for (i in n downTo 1) {
        print(" ".repeat(n-i))
        print("*".repeat(2 * i - 1))
        println("")
    }
}