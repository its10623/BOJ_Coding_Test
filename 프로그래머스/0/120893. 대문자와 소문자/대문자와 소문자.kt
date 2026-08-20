class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        my_string.forEach { i ->
            if (i.isUpperCase()) {
                answer += i.lowercase()
            } else {
                answer += i.uppercase()
            }
        }
        return answer
    }
}