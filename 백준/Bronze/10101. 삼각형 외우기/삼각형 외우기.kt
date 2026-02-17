fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    if (a + b + c == 180) {
        if (a == 60 && b == 60 && c == 60) {
            println("Equilateral")
        } else if (a == b || b == c || a == c) {
            println("Isosceles")
        } else {
            println("Scalene")
        }
    } else {
        println("Error")
    }
}