class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        
        val parse = array.joinToString("")
        
        for(i in parse) {
            if(i == '7') answer ++
        }
        return answer
    }
}