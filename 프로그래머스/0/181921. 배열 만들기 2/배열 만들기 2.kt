
class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()

        for (i in l..r) {
            var numberBoolean = true
            for (char in i.toString()) {
                val digit = char.digitToInt()

                if (digit != 5 && digit != 0) {
                    numberBoolean = false
                }
            }
            if (numberBoolean) {
                answer = answer.plus(i)
            }
        }
        if (answer.isEmpty()) {
            answer = intArrayOf(-1)
        }
        return answer
    }
}