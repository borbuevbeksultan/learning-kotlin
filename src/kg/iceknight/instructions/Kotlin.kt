package kg.iceknight.instructions

fun main(args: Array<String>) {
    val message = "Ololo"
    val simpleArray: Array<Int>

    println("You are $message")
    print(max(10, 5))

}

fun max(a: Int, b: Int) = if (a > b) a else b

fun max(a: Double, b: Double): Double {
    return if (a > b) a else b
}

fun max(a: Float, b: Float): Float {
    return if (a > b) {
        a
    } else {
        b
    }
}