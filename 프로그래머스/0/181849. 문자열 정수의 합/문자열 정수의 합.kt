class Solution {
    fun solution(num_str: String): Int {
        var answer: Int = 0
        
        num_str.forEach { num ->
            answer += num.digitToInt()
        }
        
        return answer
    }
}