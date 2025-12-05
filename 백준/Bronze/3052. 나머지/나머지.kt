fun main() {
    val list = mutableListOf<Int>()
    repeat(10) {
        val input = readln().toInt()
        list.add(input)
    }
    val count = list.map { it % 42 }.toSet().count()

    println(count)
}