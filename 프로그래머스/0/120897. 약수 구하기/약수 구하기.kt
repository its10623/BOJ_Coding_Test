class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        (1..n).forEach { i ->
            if (n % i == 0) {
                answer += i
            }
        }
        return answer
    }
}