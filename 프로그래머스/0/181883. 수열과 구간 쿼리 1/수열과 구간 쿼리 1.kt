class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        
        queries.forEach { query ->
            val left = query[0]
            val right = query[1]
            
            (left..right).forEach { 
                answer[it] += 1
            }
        }
        
        return answer
    }
}