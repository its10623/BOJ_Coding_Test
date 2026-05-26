import kotlin.math.*

class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0

        val a = num_list.fold(1) {acc, i -> acc * i}
        val b = num_list.sum()
        val multiple = b * b

        answer = if(a < multiple) 1 else 0

        return answer
    }
}