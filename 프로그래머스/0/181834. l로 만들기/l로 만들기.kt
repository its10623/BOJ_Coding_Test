class Solution {
    fun solution(myString: String): String {
        var answer: String = ""

        myString.map { i ->
            if (i < 'l') {
                answer += 'l'
            } else {
                answer += i
            }
        }

        return answer
    }
}