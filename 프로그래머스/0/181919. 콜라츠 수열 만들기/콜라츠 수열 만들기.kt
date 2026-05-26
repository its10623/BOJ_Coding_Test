class Solution {
    fun solution(n: Int): IntArray {
        var answer = mutableListOf<Int>()
        var idx = 0

        answer.add(n)

        while(answer[idx] != 1) {
            if (answer[idx] % 2 == 0) {
                answer.add(answer[idx]/2)
            } else {
                answer.add(3*answer[idx]+1)
            }
            idx ++
        }
        return answer.toIntArray()
    }
}