class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        var idx = 0
        
        for(str in my_strings) {
            
            answer += str.substring(parts[idx][0], parts[idx][1] + 1)
            
            idx ++
        }
        return answer
    }
}