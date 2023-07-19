package data_structures.stacks.stack_using_array

import java.util.*

/**
 * Simple implementation of a stack data structure using array.
 *
 * @property stackArray An ArrayList used to store the elements of the stack.
 */
class Stack {
    private var stackArray: ArrayList<String> = ArrayList()

    /**
     * Returns the value of the top element in the stack without removing it.
     *
     * @return The value of the top element if the stack is not empty, otherwise null.
     */
    fun peek(): String? {
        return if (stackArray.size > 0) {
            stackArray[stackArray.size - 1]
        } else {
            null
        }
    }

    /**
     * Adds an element with the given value to the top of the stack.
     *
     * @param value The value to be added to the stack.
     */
    fun push(value: String) {
        stackArray.add(value)
    }

    /**
     * Removes the top element from the stack if it's not empty.
     */
    fun pop() {
        if (stackArray.size > 0) {
            stackArray.removeAt(stackArray.size - 1)
        }
    }

    /**
     * Checks if the stack is empty.
     *
     * @return True if the stack is empty, otherwise false.
     */
    fun isEmpty() = stackArray.size == 0
}

fun main() {

    val myStack = Stack()
    myStack.push("Google")
    myStack.push("Udemy")
    myStack.push("Discord")
    println(myStack.peek())
    myStack.pop()
    println(myStack.peek())
    println(myStack.isEmpty())
}