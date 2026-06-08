class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        arr.forEach { 
            for (i in 0 until it) {
                answer += it
            }
        }
        
        return answer
    }
}