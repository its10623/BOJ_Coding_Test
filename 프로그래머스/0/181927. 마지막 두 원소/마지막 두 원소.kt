class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val size = num_list.size

        if(num_list[size - 1] > num_list[size - 2]) {
            answer = num_list + (num_list[size - 1] - num_list[size - 2])
        } else {
            answer = num_list + num_list[size - 1] * 2
        }

        return answer
    }
}