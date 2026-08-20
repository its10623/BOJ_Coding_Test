class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0

        val min = if (s1.size >= s2.size) s2 else s1
        val max = if (s2.size > s1.size) s2 else s1
        
        min.forEach { i -> 
           answer += if (max.contains(i)) 1 else 0
        }
        
        return answer
    }
}