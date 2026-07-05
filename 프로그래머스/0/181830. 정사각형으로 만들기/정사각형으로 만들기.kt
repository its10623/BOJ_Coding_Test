import kotlin.math.max

class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        val maxLen = max(arr.size, arr[0].size)
        val answer = Array(maxLen) { IntArray(maxLen) { 0 } }

        for (i in 0 until arr.size) {
            for (j in 0 until arr[i].size) {
                answer[i][j] += arr[i][j]
            }
        }

        return answer
    }
}