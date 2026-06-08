class Solution {
    fun solution(binomial: String): Int {
        var answer: Int = 0

        val (num1, op, num2) = binomial.split(" ").map { it}

        answer = when(op) {
            "+" -> num1.toInt() + num2.toInt()
            "-" -> num1.toInt() - num2.toInt()
            "*" -> num1.toInt() * num2.toInt()
            else -> 0
        }

        return answer
    }
}