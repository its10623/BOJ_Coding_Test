class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        var answer: Int = 0
        val list = mutableListOf<Triple<Int, Int, Boolean>>()

        rank.indices.forEach { i ->
            if (attendance[i]) {
                list.add(Triple(rank[i], i, attendance[i]))
            }
        }

        list.sortBy { it.first }

        (0..2).forEach { i ->
            when(i) {
                0 -> answer += 10000 * list[i].second
                1 -> answer += 100 * list[i].second
                2 -> answer += list[i].second
            }
        }

        return answer
    }
}