fun main() {

    val input = readln()
    val result = cutString(input)
    
}

fun cutString(input: String) {

    val resultString = input.chunked(10)
    val sb = StringBuilder()

    for (i in 0 until resultString.size ) {

        println(resultString[i])

    }

}
