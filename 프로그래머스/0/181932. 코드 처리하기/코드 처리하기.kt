class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode = 0
        var idx = 0
        
        for(char in code) {
            if(char == '1') {
                mode = if(mode == 0) 1 else 0
            } else {
                if(mode == 0 && idx % 2 == 0) {
                    answer += char
                }
                
                if(mode == 1 && idx % 2 != 0) {
                    answer += char
                }
            }
            idx++
        }
        if(answer.isBlank()) {
            answer = "EMPTY"
        }
        return answer
    }
}