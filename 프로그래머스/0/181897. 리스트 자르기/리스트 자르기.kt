class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        var answer = mutableListOf<Int>()

        val (a, b, c) = slicer

        when(n) {
            1 -> {
                (0..b).forEach {
                    answer.add(num_list[it])
                }
            }

            2 -> {
                (a..num_list.lastIndex).forEach {
                    answer.add(num_list[it])
                }
            }

            3 -> {
                (a..b).forEach {
                    answer.add(num_list[it])
                }
            }
            
            4 -> {
                (a..b step c).forEach { 
                    answer.add(num_list[it])
                }
            }
        }

        return answer.toIntArray()
    }
}