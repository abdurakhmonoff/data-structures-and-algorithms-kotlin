package dynamic_programming.dynamic_fibonacci

import dynamic_programming.dynamic_fibonacci.DynamicFibonacci.Companion.operationsCount
import java.util.*


/**
 * A class to calculate Fibonacci numbers using dynamic programming with memoization.
 */
class DynamicFibonacci {

    /**
     * Calculates the nth Fibonacci number using memoization to avoid redundant calculations.
     *
     * @param n The index of the Fibonacci number to calculate.
     * @return The nth Fibonacci number.
     */
    fun fibonacciMaster(n: Int): Int {
        // Check if the value for 'n' is already available in the cache.
        return if (cache.containsKey(n)) {
            // If it's in the cache, return the cached value.
            cache[n]!!
        } else {
            // If not in the cache, calculate the Fibonacci number and add it to the cache.
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
        // HashMap to store calculated Fibonacci numbers (memoization cache).
        var cache = HashMap<Int, Int>()
        // Counter to keep track of the number of recursive calls made during calculations.
        var operationsCount = 0
    }
}

fun main() {

    val fib = DynamicFibonacci()
    println(fib.fibonacciMaster(30))
    println(operationsCount)
}