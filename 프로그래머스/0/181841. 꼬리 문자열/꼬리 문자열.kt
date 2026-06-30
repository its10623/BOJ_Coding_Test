class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        var answer: String = ""
        answer = str_list.filterNot { it.contains(ex) }.joinToString("")
        
        return answer
    }
}