import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        val root = sqrt(n.toDouble())
        answer = if (root % 1.0 == 0.0) 1 else 2
        
        return answer
    }
}