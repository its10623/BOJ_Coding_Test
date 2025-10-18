fun main() {

    val list = mutableListOf<Int>()
    var sum = 0

    repeat(5) {

        val input = readln().toInt()
        list.add(input)

    }

    for (i in 0 until 5) {
       sum += list[i]
    }
    sum /= 5

    val sorting = list.sorted()
    val middle = sorting[2]

    println(sum)
    println(middle)
}