package kg.iceknight.cycles

import java.util.*

fun fizzBuzz(i: Int) : String = when {
    i % 15 == 0 -> "fizz buzz"
    i % 5 == 0 -> "buzz"
    i % 3 == 0 -> "fizz"
    else -> "$i"
}

fun cycleWitMap() {
    val binaryMap = TreeMap<Char, String>()
    for (i in 'A'..'Z') {
        binaryMap[i] = Integer.toBinaryString(i.toInt())
    }

    for ((key, value) in binaryMap) {
        println("$key = $value")
    }

}

fun main(args: Array<String>) {
    for (i in 1..100) {
//        println(fizzBuzz(i))
    }
//
//    for (i in 100 downTo 1 step 2) {
//        println(fizzBuzz(i))
//    }
    println(Integer.toBinaryString('A'.toInt()))
    cycleWitMap()

}