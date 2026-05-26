class Solution {
    fun solution(names: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        answer += names.filterIndexed { idx, _ -> idx % 5 == 0 }
        return answer
    }
}