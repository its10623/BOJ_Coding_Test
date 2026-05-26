class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()

        answer += num_list.slice(n until num_list.size).plus(num_list.slice(0 until n))


        return answer
    }
}