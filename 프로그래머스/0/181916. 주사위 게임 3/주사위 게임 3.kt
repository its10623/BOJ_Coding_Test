import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var answer: Int = 0

        val dice = intArrayOf(a,b,c,d).groupBy { it }.mapValues { it.value.size }
        var p = 0
        var q = 0
        var r = 0

        when(dice.count()) {
            1 -> answer = 1111*a
            2 -> {
                if (dice.values.contains(3)) {
                    p = dice.filter { it.value == 3 }.keys.first()
                    q = dice.filter { it.value == 1 }.keys.first()

                    answer = 10 * p + q
                    answer *= answer
                } else {
                    p = dice.filter { it.value == 2 }.keys.first()
                    q = dice.filter { it.value == 2 }.keys.last()

                    answer = (p + q) * Math.abs(p - q)
                }
            }
            3 -> {
                q = dice.filter { it.value == 1 }.keys.first()
                r = dice.filter { it.value == 1 }.keys.last()
                answer = q * r
            }
            4 -> {
                answer = dice.keys.minByOrNull { it }!!
            }
        }

        return answer
    }
}