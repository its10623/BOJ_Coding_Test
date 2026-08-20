import kotlin.math.*

class Solution {
    fun solution(array: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val max = array.max()
        answer += max
        answer += array.indexOf(max)
        
        return answer
    }
}