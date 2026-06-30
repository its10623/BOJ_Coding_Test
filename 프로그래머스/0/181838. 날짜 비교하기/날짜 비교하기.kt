import java.time.LocalDate

class Solution {
    fun solution(date1: IntArray, date2: IntArray): Int {
        var answer: Int = 0

        val date11 = LocalDate.of(date1[0], date1[1], date1[2])
        val date22 = LocalDate.of(date2[0], date2[1], date2[2])
        
        answer = if (date11 < date22) 1 else 0 

        return answer
    }
}