class Solution {
    fun solution(n: Int, control: String): Int {
        var answer: Int = n
        for (char in control) {
            when (char) {
                'w' -> answer++
                's' -> answer--
                'd' -> answer += 10
                'a' -> answer -= 10
            }
        }
        return answer
    }
}