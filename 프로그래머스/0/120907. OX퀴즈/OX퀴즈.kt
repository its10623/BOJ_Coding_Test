class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        quiz.forEach { i ->
            val parts = i.split(" ")
            val x = parts[0].toInt()
            val op = parts[1]
            val y = parts[2].toInt()
            val z = parts[4].toInt()

            val result = if(op == "+") x+y else x-y
            answer += if (result == z) "O" else "X"
        }

        return answer
    }
}