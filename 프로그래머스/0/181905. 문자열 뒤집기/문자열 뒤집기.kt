class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        var answer: String = ""
        val parseStr = my_string.substring(s,e + 1)
        val reverseStr = parseStr.reversed()
        answer = my_string.replaceRange(s,e + 1,reverseStr)
        return answer
    }
}