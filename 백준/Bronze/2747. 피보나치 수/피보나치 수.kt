fun main() {

    val input = readln().toInt()

    val list = mutableListOf<Int>()
    list.add(0)
    list.add(1)

    var sum = 1

    for(i in 0..46) {

        sum += list[i]
        list.add(sum)

    }

    println(list[input])

}
