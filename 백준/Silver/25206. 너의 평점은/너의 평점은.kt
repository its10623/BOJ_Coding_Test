fun main() {

    val list = mutableListOf<Double>()
    var gradeSum = 0.0


    repeat(20) {

        val (a, b, c) = readln().split(" ").map { it }

        val multiple = calculateGrade(b, c)
        list.add(multiple)

        if (c != "P") {
            gradeSum += b.toDouble()

        }

    }

    val result = list.sumOf { it }

    val jjinresult = result/gradeSum

    println(jjinresult)





}

fun calculateGrade (b: String, c: String): Double {

    val b = b.toDouble()
    val c = c
    var multiple = 0.0


    val map = mapOf<String, Double>("A+" to 4.5, "A0" to 4.0
        , "B+" to 3.5, "B0" to 3.0, "C+" to 2.5, "C0" to 2.0
        , "D+" to 1.5, "D0" to 1.0, "F" to 0.0, "P" to 0.0)

        val key = map[c]!!
        multiple = b * key


    return multiple

}
