class Solution {
    fun solution(s: String): String {
        var answer: String = ""

        answer = s.filter { s.indexOf(it) == s.lastIndexOf(it) }.toList().sorted().joinToString("")
        
        return answer
    }
}