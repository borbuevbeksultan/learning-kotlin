package kg.iceknight.casting

import javax.naming.OperationNotSupportedException

interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e
        return n.value
    }

    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }

    throw OperationNotSupportedException()

}

fun main(args: Array<String>) {
    println(eval(Sum(Num(5), Num(10))) + eval(Num(5)))
}