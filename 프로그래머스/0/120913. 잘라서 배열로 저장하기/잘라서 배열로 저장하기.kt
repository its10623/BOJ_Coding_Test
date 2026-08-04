class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        var storage = ""

        my_str.forEach { i ->
            if (storage.length == n) {
                answer += storage
                storage = ""
            }

            if (storage.length < n) {
                storage += i
            }
        }
        answer += storage

        return answer
    }
}