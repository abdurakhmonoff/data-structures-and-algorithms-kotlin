### Recursion

Recursion is a programming technique where a function calls itself to solve a problem. Recursion is commonly used to
solve problems that can be broken down into smaller, simpler subproblems.

In Kotlin, a recursive function is defined like any other function, but it calls itself within its own body. Here's an
example of a Kotlin function that uses recursion to calculate the factorial of a number:

```kotlin
fun findFactorialRecursive(number: Int): Int {
    return if (number < 2)
        1
    else
        number * findFactorialRecursive(number - 1)
}
```

The `if` statement checks if the `number` is less than 2. If it is, the function returns 1, as the factorial of 0 and 1
is 1. If the `number` is greater than or equal to 2, the function moves to the `else` block.

In the `else` block, the function multiplies the `number` with the factorial of `number-1`. This is done by calling the
same function recursively with the parameter `number-1`. The function keeps calling itself recursively with decreasing
values of `number` until it reaches 1, at which point the base case is triggered and the recursion stops.

For example, if `number` is 4, the function calculates `4*3*2*1` recursively. It first multiplies `4` with the result of
calling `findFactorialRecursive(3)`. The `findFactorialRecursive` function then multiplies `3` with the result of
calling `findFactorialRecursive(2)`, and so on until it reaches the base case of `findFactorialRecursive(1)`, which
returns `1`. The multiplication chain is then complete and the final result of `4*3*2*1` is returned by the original
call to `findFactorialRecursive(4)`.