class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer = mutableListOf<Int>()

        for (strs in intStrs) {
            val parseStr = strs.substring(s, s + l).toInt()

            if (parseStr > k) {
                answer.add(parseStr)
            }
        }

        return answer.toIntArray()
    }
}