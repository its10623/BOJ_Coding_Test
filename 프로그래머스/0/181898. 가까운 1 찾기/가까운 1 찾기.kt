class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        var answer: Int = 0
        answer = arr.indices.filterIndexed { i, _ -> i >= idx && arr[i] == 1 }.minOrNull() ?: -1
        return answer
    }
}