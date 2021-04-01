package dynamic_programming.dynamic_fibonacci

import dynamic_programming.dynamic_fibonacci.DynamicFibonacci.Companion.operationsCount
import java.util.*

class DynamicFibonacci {
    fun fibonacciMaster(n: Int): Int {
        return if (cache.containsKey(n)) {
            cache[n]!!
        } else {
            if (n < 2) {
                n
            } else {
                operationsCount++
                cache[n] = fibonacciMaster(n - 1) + fibonacciMaster(n - 2)
                cache[n]!!
            }
        }
    }

    companion object {
        var cache = HashMap<Int, Int>()
        var operationsCount = 0
    }
}

fun main() {
    val fib = DynamicFibonacci()
    println(fib.fibonacciMaster(30))
    println(operationsCount)
}