class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var rest = intArrayOf()
        
        num_list.forEachIndexed { i, ch ->
            if (i > n-1) {
                answer += ch
            } else {
                rest += ch
            }
        }
        return answer + rest
    }
}