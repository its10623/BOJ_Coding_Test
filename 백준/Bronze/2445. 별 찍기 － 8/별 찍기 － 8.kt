fun main() {
    val n = readln().toInt()

    for (i in n - 1 downTo  0) {
        print("*".repeat(n - i))

        print(" ".repeat(i * 2))

        print("*".repeat(n - i))
        println("")
    }

    for (i in 1 until n) {
        print("*".repeat(n - i))

        print(" ".repeat(i * 2))

        print("*".repeat(n - i))
        println("")
    }
}