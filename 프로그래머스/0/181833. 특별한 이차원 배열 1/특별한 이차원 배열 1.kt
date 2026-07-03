class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer = Array(n) { i -> IntArray(n) { j -> if (i == j) 1 else 0} }

        return answer
    }
}