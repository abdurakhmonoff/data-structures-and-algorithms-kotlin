package dynamic_programming.memoization

import java.util.*

/**
 * A class demonstrating the concept of memoization in Kotlin.
 */
class Memoization {

    /**
     * Calculates the sum of the given integer 'n' and 80 directly without memoization.
     *
     * @param n The integer to add to 80.
     * @return The sum of 'n' and 80.
     */
    fun addTo80(n: Int): Int {
        println("long time")
        return n + 80
    }

    /**
     * Calculates the sum of the given integer 'n' and 80 using memoization to avoid redundant calculations.
     *
     * @param n The integer to add to 80.
     * @return The sum of 'n' and 80, retrieved from the cache if previously calculated.
     */
    fun memoizeAddTo80(n: Int): Int {
        if (!cache.containsKey(n)) {
            println("long time")
            cache[n] = n + 80
        }
        return cache[n]!!
    }

    companion object {
        // HashMap to store previously calculated results for memoization (cache).
        var cache = HashMap<Int, Int>()
    }
}

fun main() {

    val memo = Memoization()
    println("addTo80: " + memo.addTo80(5))
    println("addTo80: " + memo.addTo80(5))
    println("memoizeAddTo80: " + memo.memoizeAddTo80(5))
    println("memoizeAddTo80: " + memo.memoizeAddTo80(5))
    println("memoizeAddTo80: " + memo.memoizeAddTo80(5))
}