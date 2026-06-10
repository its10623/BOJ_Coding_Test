class Solution {
    fun solution(strArr: Array<String>): Int {
        var answer: Int = 0

        val temp = strArr.groupingBy { it.length }
            .eachCount()
        answer = temp.values.max()

        return answer
    }
}