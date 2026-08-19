class Solution {
    fun solution(my_string: String): String {
        var answer = my_string.lowercase().toList().sorted().joinToString("")
        
        return answer
    }
}