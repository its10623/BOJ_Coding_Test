class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        
        for(query in queries) {
            val (s, e, k) = query
            
            for(i in s..e) {
                if (i % k == 0) {
                    answer[i] += 1
                }
            }
        }
        return answer
    }
}