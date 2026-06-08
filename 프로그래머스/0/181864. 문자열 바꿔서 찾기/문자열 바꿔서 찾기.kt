class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        var newStr = ""
        
        myString.forEach { 
            if (it == 'A') {
                newStr += 'B'
            } else {
                newStr += 'A'
            }
        }
        
        answer = if (newStr.contains(pat)) 1 else 0
        
        return answer
    }
}