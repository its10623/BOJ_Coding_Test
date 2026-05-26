class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()

        for (query in queries) {
            val s = query[0]
            val e = query[1]
            val k = query[2]
            var minVal = -1

            for (i in s..e) {
                if (arr[i] > k) {
                    if (minVal == -1 || arr[i] < minVal) {
                        minVal = arr[i]
                    }
                }
            }
            answer = answer.plus(minVal)
        }
        return answer
    }
}