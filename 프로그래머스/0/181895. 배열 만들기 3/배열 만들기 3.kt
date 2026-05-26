class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (interval in intervals) {
            val a = interval[0]
            val b = interval[1]
            
            (a..b).forEach {
                answer += arr[it]
            }
        }
        
    
        return answer
    }
}