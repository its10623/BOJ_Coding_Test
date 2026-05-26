class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        var answer: Int = 0
        
        answer = if (my_string.endsWith(is_suffix)) 1 else 0

        return answer 
    }
}