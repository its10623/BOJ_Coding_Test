class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string
        var reverse = ""

        for (query in queries) {
            val s = query[0]
            val e = query[1]

            reverse = answer.substring(s,e+1).reversed()
            answer = answer.substring(0,s) + reverse + answer.substring(e+1)
        }

        return answer
    }
}