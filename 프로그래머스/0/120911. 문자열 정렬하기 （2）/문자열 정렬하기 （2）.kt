class Solution {
    fun solution(my_string: String): String {
        var answer = my_string.toList().map { it.lowercase() }.sorted().joinToString("")
        
        return answer
    }
}