class Solution {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
        
        val temp1 = str1.split("")
        val temp2 = str2.split("")
        val basket = mutableListOf<String>()
            
        for(i in 0 .. str1.length) {    
            basket.add(temp1[i])
            basket.add(temp2[i])
        }
        answer = basket.joinToString("")
        return answer
    }
}