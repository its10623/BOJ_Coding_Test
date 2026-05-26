class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        str_list.forEachIndexed { i, ch ->
            if (ch == "l") {
                return answer.plus(str_list.slice(0 until i))
            } else if (ch == "r") {
                return answer.plus(str_list.slice(i+1..str_list.size-1))
            }
        }

        return answer
    }
}