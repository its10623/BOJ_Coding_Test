fun main() {
    val (min, max) = readln().split(" ").map { it.toInt() }

    val isPrime = solution(min, max)

    val result = (min..max).filter { isPrime[it] }
    result.forEach { i ->
        println(i)
    }
}

fun solution(min: Int, max: Int): BooleanArray {
    val result = BooleanArray(max + 1) { true }

    result[0] = false
    if (max >= 1) result[1] = false
    
    for (i in 2..max) {
        if (result[i]) {
            for (j in i..max step i) {
                if (j != i) {
                    result[j] = false
                }
            }
        }
    }
    return result
}