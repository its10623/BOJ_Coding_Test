class Solution {
    fun solution(my_string: String): String {
        var answer = ""

        for (char in my_string.toList()) {
            answer += char.lowercase()
        }
        
        return answer.toList().sorted().joinToString("")
    }
}