class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        var answer: Int = 0

        if (arr1.size != arr2.size) {
            if (arr1.size > arr2.size) {
                answer += 1
            } else {
                answer += -1
            }
        } else {
            val arr1Sum = arr1.sum()
            val arr2Sum = arr2.sum()

            if (arr1Sum != arr2Sum) {
                if (arr1Sum > arr2Sum) {
                    answer += 1
                } else {
                    answer += -1
                }
            } else {
                answer += 0
            }
        }

        return answer
    }
}