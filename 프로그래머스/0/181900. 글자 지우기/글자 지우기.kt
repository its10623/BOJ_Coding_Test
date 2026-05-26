class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        var answer: String = my_string
        
        answer = my_string.filterIndexed { i, _ -> i !in indices }
        return answer
    }
}