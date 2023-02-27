package algorithms.recursion.fibonacci

class Fibonacci {

    /**
     * Returns the nth number in the Fibonacci sequence using a recursive approach.
     *
     * @param n the position of the number to retrieve (starting from 0)
     * @return the nth number in the Fibonacci sequence
     */
    fun fibonacciRecursive(n: Int): Int {
        if (n == 0) return 0
        else if (n == 1 || n == 2) return 1
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2)
    }

    /**
     * Returns the nth number in the Fibonacci sequence using an iterative approach.
     *
     * @param n the position of the number to retrieve (starting from 0)
     * @return the nth number in the Fibonacci sequence
     */
    fun fibonacciIterative(n: Int): Int {
        return if (n == 0) {
            0
        } else if (n == 1 || n == 2) {
            1
        } else {
            val arr = intArrayOf(1, 1)
            for (i in 3..n) {
                val temp = arr[1]
                arr[1] = arr[0] + arr[1]
                arr[0] = temp
            }
            arr[1]
        }
    }
}

fun main() {

    val fibonacci = Fibonacci()
    println(fibonacci.fibonacciRecursive(5))
    println(fibonacci.fibonacciIterative(5))
}