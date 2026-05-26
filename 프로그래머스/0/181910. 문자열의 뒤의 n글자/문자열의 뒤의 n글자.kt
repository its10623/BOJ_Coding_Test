class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        
        val strLen = my_string.length
        answer = my_string.substring(strLen - n)
        return answer
    }
}