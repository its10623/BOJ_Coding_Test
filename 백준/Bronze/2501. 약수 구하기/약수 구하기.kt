fun main() {
    val (n, k) = readln().split(" ").map() { it.toInt() }
    val basket = mutableListOf<Int>()

    for(i in 1..n) {
        if(n % i == 0) {
            basket.add(i)
        }
    }
    
    if (basket.size < k) {
        println(0)
    } else {
        println(basket[k - 1])
    }
}