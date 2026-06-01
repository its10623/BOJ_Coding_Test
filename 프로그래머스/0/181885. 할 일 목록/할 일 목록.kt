class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        finished.forEachIndexed { i, ch ->
            if (!ch) {
                answer += todo_list[i]
            }
        }
        
        return answer
    }
}