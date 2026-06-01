class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0

        num_list.forEach {
            var number = it
            while(number != 1) {
                if (number % 2 == 0) number /= 2
                else number = (number-1)/2
                answer++
            }
        }
        return answer
    }
}