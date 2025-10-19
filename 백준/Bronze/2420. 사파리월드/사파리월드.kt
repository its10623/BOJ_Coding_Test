import kotlin.math.abs
import kotlin.math.absoluteValue

fun main() {

    val (a, b) = readln().split(" ").map { it.toLong() }

    val result = a -b


    val resultNumber = abs(result)


    println(resultNumber)
}

