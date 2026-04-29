import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val exponent = 2.0

        if(n % 2 != 0) {
            for(i in 1..n) {
                if(i % 2 != 0) {
                    answer += i
                }
            }
        } else {
            for(j in 1..n) {
                if(j % 2 == 0) {
                    answer += (j.toDouble().pow(exponent)).toInt()
                }
            }
        }
        return answer
    }
}