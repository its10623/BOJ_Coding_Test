class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var idx = 0
        var answer: Int = numbers[idx]
        
        while(answer <= n) {
            answer += numbers[idx+1]
            idx ++
        }
        
        return answer
    }
}