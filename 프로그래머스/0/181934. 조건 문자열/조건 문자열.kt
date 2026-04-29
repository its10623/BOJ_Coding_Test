class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        val operation = ineq + eq
        when(operation) {
            "<=" -> if(n <= m) answer = 1
            ">=" -> if(n >= m) answer = 1
            "<!" -> if(n < m) answer = 1
            ">!" -> if(n > m) answer = 1
        }
        return answer
    }
}