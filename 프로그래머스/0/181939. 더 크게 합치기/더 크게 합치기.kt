class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        
        val newA = a.toString() + b.toString()
        val newB = b.toString() + a.toString()
        
        if(newA.toInt() > newB.toInt()) {
            answer = newA.toInt()
        } else {
            answer = newB.toInt()
        }
        return answer
    }
}