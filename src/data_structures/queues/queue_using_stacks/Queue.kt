package data_structures.queues.queue_using_stacks

import java.util.*

/**
 * Simple implementation of a queue data structure using stacks.
 *
 * @property queueStack The main stack used to simulate the queue.
 * @property revStack A temporary stack used for reordering elements during the push operation.
 */
class Queue {
    var queueStack = Stack<Int>()

    private var revStack = Stack<Int>()
    /**
     * Adds an element with the value 'x' to the end of the queue.
     *
     * @param x The value to be added to the queue.
     */
    fun push(x: Int) {
        if (queueStack.size == 0) {
            queueStack.push(x)
        } else {
            while (queueStack.size != 0) {
                revStack.push(queueStack.pop())
            }
            revStack.push(x)
            while (revStack.size != 0) {
                queueStack.push(revStack.pop())
            }
        }
    }

    /**
     * Removes and returns the first element from the queue if it's not empty.
     *
     * @return The first element from the queue, or null if the queue is empty.
     */
    fun pop(): Int? {
        return if (queueStack.size > 0) {
            queueStack.pop()
        } else {
            null
        }
    }

    /**
     * Returns the value of the first element in the queue without removing it.
     *
     * @return The value of the first element if the queue is not empty, otherwise null.
     */
    fun peek(): Int? {
        return if (queueStack.size > 0) {
            queueStack[queueStack.size - 1]
        } else {
            null
        }
    }

    /**
     * Checks if the queue is empty.
     *
     * @return True if the queue is empty, otherwise false.
     */
    fun empty() = queueStack.size == 0
}

fun main() {
    val myQueue = Queue()
    myQueue.push(10)
    myQueue.push(20)
    myQueue.push(30)
    println("queue: " + myQueue.queueStack)
    println("peek: " + myQueue.peek())
    println("pop: " + myQueue.pop())
    println("queue: " + myQueue.queueStack)
    println("peek: " + myQueue.peek())
    println("is queue empty: " + myQueue.empty())
}