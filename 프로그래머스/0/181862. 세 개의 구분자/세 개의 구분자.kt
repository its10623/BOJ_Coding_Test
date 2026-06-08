class Solution {
    fun solution(myStr: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        answer = myStr.split("a", "b", "c").filter { it.isNotBlank() }.toTypedArray()

        if (answer.isEmpty()) {
            answer = arrayOf("EMPTY")
        }

        return answer
    }
}