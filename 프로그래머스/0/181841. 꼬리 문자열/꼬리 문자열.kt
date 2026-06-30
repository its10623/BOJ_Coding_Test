class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        var answer: String = ""
        val parse = str_list.filterNot { it.contains(ex) }
        
        parse.indices.forEach {
            answer += parse[it]
        }

        return answer
    }
}