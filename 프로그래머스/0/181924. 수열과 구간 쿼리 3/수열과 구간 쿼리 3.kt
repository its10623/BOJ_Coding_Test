class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr

        for (query in queries) {
            val i = query[0]
            val j = query[1]

            answer[i] = answer[j].also { answer[j] = answer[i] }
        }
        return answer
    }
}