class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        var answer: IntArray = arr

        if (arr.size % 2 != 0) {
            arr.indices.forEach { if (it % 2 == 0) answer[it] += n }
        } else {
            arr.indices.forEach { if (it % 2 != 0) answer[it] += n }
        }

        return answer
    }
}