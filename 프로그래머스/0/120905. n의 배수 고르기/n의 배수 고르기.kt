class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        answer = numlist.filter { it % n == 0 }.toIntArray()
        return answer
    }
}