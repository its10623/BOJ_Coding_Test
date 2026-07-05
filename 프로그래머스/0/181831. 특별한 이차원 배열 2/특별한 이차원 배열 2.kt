class Solution {
    fun solution(arr: Array<IntArray>): Int {
        var answer: Int = 0

        arr.indices.forEach { i ->
            arr.indices.forEach { j ->
                if(arr[i][j] != arr[j][i]) {
                    return 0
                } else  {
                    answer = 1
                }
            }
        }
        return answer
    }
}