class Solution {
    fun solution(common: IntArray): Int {
        var answer: Int = 0
        var temp = 0
        
        if (common[1] - common[0] == common[2] - common[1]) {
            temp = common[1] - common[0]
            answer = common.last() + temp
        } else {
            answer = common.last() * (common[1] / common[0])
        }
        return answer
    }
}