class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer =  mutableListOf<String>()
        var context = ""

        picture.forEach { list ->
            repeat(k){
                context = ""
            list.forEach { i ->
                repeat(k) {
                    context += i
                }
            }
            answer.add(context)}
        }

        return answer.toTypedArray()
    }
}