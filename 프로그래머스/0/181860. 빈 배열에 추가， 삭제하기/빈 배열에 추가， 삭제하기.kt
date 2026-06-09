class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer: IntArray = intArrayOf()

        flag.forEachIndexed { i,b ->
            if (b) repeat(arr[i]*2) { answer += arr[i] } else { answer = answer.dropLast(arr[i]).toIntArray() }
        }
        return answer
    }
}