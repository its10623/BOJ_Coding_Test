class Solution {
    fun solution(num_list: IntArray, n: Int): Int {
        var answer: Int = 0
        
        if(num_list.contains(n)) {
            answer = 1
        }
        return answer
    }
}