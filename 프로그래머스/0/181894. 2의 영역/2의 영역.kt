class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        if (arr.contains(2)) {
            val a = arr.indexOfFirst { it == 2 }
            val b = arr.indexOfLast { it == 2 }
            
            (a..b).forEach {
                answer += arr[it]
            }
            
        } else {
            answer += -1
        }
        
        return answer
    }
}