fun main() {
    while (true) {
        val (n, k) = readln().split(" ").map { it.toInt() }
        if (n == 0 && k == 0) {
            break
        }
        if (k % n == 0) {
            println("factor")
        } else if(n % k == 0) {
            println("multiple")
        } else {
            println("neither")
        }
    }
}