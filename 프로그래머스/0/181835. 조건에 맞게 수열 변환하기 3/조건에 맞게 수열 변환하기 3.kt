class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        answer = arr.map { i ->
            if(k % 2 != 0) {
                i * k
            } else {
                i + k
            }
        }.toIntArray()
        return answer
    }
}