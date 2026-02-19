fun main() {
    val n = readln()

    val basket = IntArray(10)

    for (char in n) {
        val number = char.digitToInt()
        basket[number] += 1
    }

    basket[6] = (basket[6] + basket[9] + 1) / 2
    basket[9] = 0
    
    println(basket.max())

}