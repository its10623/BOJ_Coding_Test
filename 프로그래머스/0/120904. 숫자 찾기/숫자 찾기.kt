class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = 0
        
        answer = num.toString().indexOf(k.toString()) + 1
        
        answer = if(answer == 0) -1 else answer
        
        return answer
    }
}