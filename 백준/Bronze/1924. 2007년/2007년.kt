fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val result = calculateDate(a, b)
    println(result)
}

fun calculateDate(month: Int, day: Int): String {

    val daysList = listOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    var sum = 0

    for (i in 1..month - 1) {

        sum += daysList[i]

    }

    sum = (sum + day) % 7

        return when (sum) {
        0 -> "SUN"
        1 -> "MON"
        2 -> "TUE"
        3 -> "WED"
        4 -> "THU"
        5 -> "FRI"
        6 -> "SAT"
            else -> ""
    }
}

