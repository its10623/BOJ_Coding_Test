class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        arr.forEach { 
            if(!answer.contains(it) && answer.size != k) {
                answer += it
            }
        }
        if (answer.size != k) {
            (0 until k - answer.size).forEach { answer += -1 }
        }
        
        return answer
    }
}