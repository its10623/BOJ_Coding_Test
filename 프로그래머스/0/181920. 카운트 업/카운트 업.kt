class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer = mutableListOf<Int>()
        
        for (i in start_num..end_num) {
            answer.add(i)
        }
        
        return answer.toIntArray()
    }
}