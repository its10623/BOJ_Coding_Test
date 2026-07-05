class Solution {
    fun solution(board: Array<IntArray>, k: Int): Int {
        var answer: Int = 0
        
        board.indices.forEach { i->
            board[i].indices.forEach { j->
                val idxSum = i + j
                if(idxSum <= k) {
                    answer += board[i][j]
                }
            }
        }
        return answer
    }
}