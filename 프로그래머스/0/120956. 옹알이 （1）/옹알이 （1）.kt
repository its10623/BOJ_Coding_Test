class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val basket = listOf("aya","ye", "woo","ma")
        var temp = babbling

        babbling.forEachIndexed { i, ch ->
            var cnt = 0
            var idx = 0
            basket.forEach { j ->
                if(ch.contains(j)) {
                    idx = ch.indexOf(j)
                    temp[i] = temp[i].replace(j, " ")
                    cnt ++
                }
            }
            temp[i] = temp[i].trim()
            if (temp[i].isEmpty()) {
                answer++
            }
        }
        return answer
    }
}