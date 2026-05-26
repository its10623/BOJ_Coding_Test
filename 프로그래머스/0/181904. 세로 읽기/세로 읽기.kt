class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        var answer: String = ""
        var idx = c
        
        while(my_string.length >= idx) {
            answer += my_string[idx-1]
            
            idx += m
        }
        return answer
    }
}