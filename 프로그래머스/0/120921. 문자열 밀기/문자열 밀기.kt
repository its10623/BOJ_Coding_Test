class Solution {
    fun solution(A: String, B: String): Int {
        var answer: Int = 0

        val bPlus = B + B
        if (bPlus.contains(A)) {
            answer = bPlus.indexOf(A)
        } else {
            answer = -1
        }

        return answer
    }
}