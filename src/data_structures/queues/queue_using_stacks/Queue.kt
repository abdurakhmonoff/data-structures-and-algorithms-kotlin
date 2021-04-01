package data_structures.queues.queue_using_stacks

import java.util.*

class Queue {
    var queueStack = Stack<Int>()

    private var revStack = Stack<Int>()
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

    fun pop(): Int? {
        return if (queueStack.size > 0) {
            queueStack.pop()
        } else {
            null
        }
    }

    fun peek(): Int? {
        return if (queueStack.size > 0) {
            queueStack[queueStack.size - 1]
        } else {
            null
        }
    }

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