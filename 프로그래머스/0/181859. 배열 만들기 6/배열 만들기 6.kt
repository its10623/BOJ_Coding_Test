class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var i = 0

        while (arr.size > i) {
            if (answer.isEmpty()) {
                answer += arr[i]
            } else if (arr.isNotEmpty() && arr[i] == answer.last()) {
                answer = answer.dropLast(1).toIntArray()
            } else if(arr.isNotEmpty() && arr[i] != answer.last()) {
                answer += arr[i]
            }
            i ++
        }

        if (answer.isEmpty()) answer += -1
        return answer
    }
}