class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0

        answer = num_list.indexOfFirst { it < 0 } ?: -1

        return answer
    }
}