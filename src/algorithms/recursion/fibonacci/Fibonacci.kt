package algorithms.recursion.fibonacci

class Fibonacci {
    // iterative
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

    // recursive
    fun fibonacciRecursive(n: Int): Int {
        if (n == 0) return 0
        else if (n == 1 || n == 2) return 1
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2)
    }
}

fun main() {
    val fibonacci = Fibonacci()
    println(fibonacci.fibonacciIterative(5))
    println(fibonacci.fibonacciRecursive(5))
}