fun main() {
    val input = readln().toInt()

    println(solution(input))
}

fun solution(input: Int): Int {
    var count = 0
    var n = input

    while (n >= 0) {
        if (n % 5 == 0) {
            count += n / 5
            return count
        } else {
            n -= 3
            count++
        }
    }
    return -1
}