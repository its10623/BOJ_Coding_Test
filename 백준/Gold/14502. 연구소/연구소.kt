import kotlin.math.max

fun main() {

    val (a, b) = readln().split(" ").map { it.toInt() }

    val virusMap = Array(a) { IntArray(b) }
    var column = listOf(0)

    val virus = 2

    val deque = ArrayDeque<Pair<Int, Int>>()
    val emptySpace = mutableListOf<Pair<Int, Int>>()
    val initialViruses = mutableListOf<Pair<Int, Int>>()

    for (i in 0 until a) {
        column = readln().split(" ").map { it.toInt() }
        for (j in 0 until b) {
            virusMap[i][j] = column[j]
            if (column[j] == virus) {
                initialViruses.add(Pair(i, j))
            }
            if (column[j] == 0) {
                emptySpace.add(Pair(i, j))
            }
        }
    }

    // 깊은복사
    var maxSafeZone = 0

    for (i in 0 until emptySpace.size - 2) {
        for (j in i + 1 until emptySpace.size - 1) {
            for (k in j + 1 until emptySpace.size) {
                val tempMap = virusMap.map { it.clone() }.toTypedArray()

                val wall1 = emptySpace[i]
                val wall2 = emptySpace[j]
                val wall3 = emptySpace[k]



                tempMap[wall1.first][wall1.second] = 1
                tempMap[wall2.first][wall2.second] = 1
                tempMap[wall3.first][wall3.second] = 1

                val virusQueue = ArrayDeque(initialViruses)
                val dx = intArrayOf(-1, 1, 0, 0)
                val dy = intArrayOf(0, 0, -1, 1)


                while (virusQueue.isNotEmpty()) {

                    val (vx, vy) = virusQueue.removeFirst()

                    for (i in 0 until 4) {
                        val nx = vx + dx[i]
                        // 다음 x 좌표
                        val ny = vy + dy[i]

                        if (nx in 0 until a && ny in 0 until b && tempMap[nx][ny] == 0) {


                            tempMap[nx][ny] = 2
                            virusQueue.addLast(Pair(nx, ny))

                        }
                    }
                }
                var safeZoneCount = 0
                for (row in 0 until a) {
                    for (cell in 0 until b) {
                        if (tempMap[row][cell] == 0) {
                            safeZoneCount++
                        }
                    }
                }
                maxSafeZone = max(maxSafeZone, safeZoneCount)

            }
        }
    }
    println(maxSafeZone)
}
