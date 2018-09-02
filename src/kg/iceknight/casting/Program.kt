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

fun evalModified(e: Expr): Int =
        if (e is Num) {
            e.value
        } else if (e is Sum) {
            eval(e.left) + eval(e.right)
        } else {
            throw IllegalArgumentException()
        }

fun evalWithWhen(e: Expr) : Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        else -> throw IllegalArgumentException()
}

fun evalWithLoggin(e: Expr): Int =
        when (e) {
            is Num -> {
                println(e.value)
                e.value // result of block (last expression)
            }

            is Sum -> {
                val result = evalWithLoggin(e.left) + eval(e.right)
                println(result)
                result // result of block (last expression)
            }
            else -> throw IllegalArgumentException()
        }

fun main(args: Array<String>) {
    println(eval(Sum(Num(5), Num(10))) + eval(Num(5))) //20
    println(evalModified(Sum(Num(5), Num(10))) + eval(Num(5))) //20
    println(evalWithWhen(Sum(Num(5), Num(10))) + eval(Num(5))) //20
    println(evalWithLoggin(Sum(Num(5), Num(10))) + eval(Num(5))) //20
}