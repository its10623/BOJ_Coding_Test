class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer = Array(n) { IntArray(n) }

        for (i in 0 until n) {
            for (j in 0 until n) {
                if(i == j) {
                    answer[i][j] = 1
                } else {
                    answer[i][j] = 0
                }
            }
        }

        return answer
    }
}