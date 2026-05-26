class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer = arr

        (0..query.size-1).forEach { i ->
            answer = if (i % 2 == 0) {
                answer.filterIndexed { idx, _ -> query[i] >= idx }.toIntArray()
            } else {
                answer.filterIndexed { idx, _ -> query[i] <= idx }.toIntArray()
            }
        }
        return answer
    }
}