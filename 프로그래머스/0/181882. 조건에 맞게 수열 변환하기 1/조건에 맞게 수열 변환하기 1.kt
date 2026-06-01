class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = arr
        
        answer.forEachIndexed { i, ch ->
            if (ch < 50 && ch % 2 !=0) {
                answer[i] *= 2
            } else if(ch >= 50 && ch % 2 == 0) {
                answer[i] /= 2
            }
        }
        
        return answer
    }
}