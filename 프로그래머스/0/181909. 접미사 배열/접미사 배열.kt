class Solution {
    fun solution(my_string: String): Array<String> {
        var answer = mutableListOf<String>()
        var i = 0
        
        while(answer.size != my_string.length) {
            answer.add(my_string.substring(i, my_string.length))
            
            i ++
        }
        
        answer.sort()
        
        return answer.toTypedArray()
    }
}