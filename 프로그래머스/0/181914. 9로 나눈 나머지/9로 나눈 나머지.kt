class Solution {
    fun solution(number: String): Int {
        var answer = 0

        for (char in number) {
            val digit = char.digitToInt()

            answer += digit
            answer %= 9

        }
        return answer
    }
}