class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = arr
        var count = 1
        while (arr.size > count) {
            count *= 2
        }
        
        (0 until count - arr.size).forEach { answer += 0 }
        
        return answer
    }
}