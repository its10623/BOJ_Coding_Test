class Solution {
    fun solution(names: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        names.forEachIndexed { i, ch ->
            if (i % 5 == 0 ) {
                answer += ch
            }
        }
        return answer
    }
}