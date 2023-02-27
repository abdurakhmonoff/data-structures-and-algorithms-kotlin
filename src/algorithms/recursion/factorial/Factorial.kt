package algorithms.recursion.factorial

class Factorial {

    /**
     * Returns the factorial of the given integer using a recursive approach.
     *
     * @param number the integer to calculate the factorial of
     * @return the factorial of the given integer
     */
    fun findFactorialRecursive(number: Int): Int {
        return if (number < 2)
            1
        else
            number * findFactorialRecursive(number - 1)
    }

    /**
     * Returns the factorial of the given integer using an iterative approach.
     *
     * @param number the integer to calculate the factorial of
     * @return the factorial of the given integer
     */
    fun findFactorialIterative(number: Int): Int {
        return if (number < 2) {
            1
        } else {
            var answer = 1
            for (i in 2..number) {
                answer *= i
            }
            answer
        }
    }
}

fun main() {

    val factorial = Factorial()
    println(factorial.findFactorialRecursive(5))
    println(factorial.findFactorialIterative(5))
}