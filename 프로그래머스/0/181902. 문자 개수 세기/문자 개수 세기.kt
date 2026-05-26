class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = IntArray(52)
        var idx = 0
        for(str in my_string) {
            if(str.isUpperCase()) {
                idx = str - 'A'
            } else {
                idx = str - 'a' + 26
            }
            answer[idx] ++
        }
        return answer
    }
}