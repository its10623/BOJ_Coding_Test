class Solution {
    fun solution(n: Int): Array<IntArray> {
        // 1. n x n 크기의 0으로 채워진 2차원 배열 생성
        val answer = Array(n) { IntArray(n) }
        
        // 2. 우 -> 하 -> 좌 -> 상 순서의 방향 이동을 위한 좌표 변화량
        val dx = intArrayOf(0, 1, 0, -1) // 행 (세로)
        val dy = intArrayOf(1, 0, -1, 0) // 열 (가로)
        
        var x = 0
        var y = 0
        var dir = 0 // 현재 방향 (0:우, 1:하, 2:좌, 3:상)
        
        // 3. 1부터 n^2까지 순서대로 배열에 채우기
        for (num in 1..n * n) {
            answer[x][y] = num
            
            // 다음으로 이동할 예정인 좌표 계산
            val nextX = x + dx[dir]
            val nextY = y + dy[dir]
            
            // 4. 벽을 만나거나(배열 범위 밖) 이미 채워진 칸을 만나면 방향을 90도 틀기
            if (nextX !in 0 until n || nextY !in 0 until n || answer[nextX][nextY] != 0) {
                dir = (dir + 1) % 4 // 0->1->2->3->0... 무한 반복
            }
            
            // 진짜 확정된 방향으로 이동
            x += dx[dir]
            y += dy[dir]
        }
        
        return answer
    }
}