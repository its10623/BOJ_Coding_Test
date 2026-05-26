class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        var answer: String = ""

        answer = code.filterIndexed { index, _ -> index % q == r }
        return answer
    }
}