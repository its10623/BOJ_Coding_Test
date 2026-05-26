class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var odd = ""
        var even = ""
        
        for(i in num_list) {
            if(i % 2 != 0) {
                odd += i.toString()
            } else {
                even += i.toString()
            }
        }
        
        answer = odd.toInt() + even.toInt()
        
        return answer
    }
}