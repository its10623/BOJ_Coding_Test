class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        val parts = my_string.split(" ")

        for(i in 1 until parts.size step 2) {
            val op = parts[i]
            val prev = parts[i - 1].toInt()
            val next = parts[i + 1].toInt()
            val calc = if (op == "+") prev + next else prev - next

            if (i == 1) {
                answer = calc
            } else {
                answer = if (op == "+") answer + next else answer - next
            }

        }

        return answer
    }
}