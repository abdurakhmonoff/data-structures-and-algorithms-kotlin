package algorithms.recursion.factorial

class Factorial {
    
    // recursive
    fun findFactorialRecursive(number: Int): Int {
        return if (number < 2)
            1
        else
            number * findFactorialRecursive(number - 1)
    }

    // iterative
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