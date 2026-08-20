class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        n.toString().forEach { i ->
            answer += i.digitToInt()
        }
        return answer
    }
}