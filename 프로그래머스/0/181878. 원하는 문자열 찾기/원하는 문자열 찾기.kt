class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        answer = if(myString.contains(pat, true)) 1 else 0
        return answer
    }
}