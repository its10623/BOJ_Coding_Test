class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var answer = IntArray(num) 
        var mid = total / num
        
        val start = if (num % 2 == 0) {
            mid - (num / 2) + 1
        } else {
            mid - (num / 2)
        }
        
        for (i in 0 until num) {
            answer[i] = start + i
        }
        
        return answer
    }
}