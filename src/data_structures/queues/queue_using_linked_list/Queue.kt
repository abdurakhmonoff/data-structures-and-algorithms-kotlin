package data_structures.queues.queue_using_linked_list

/**
 * Simple implementation of a queue data structure using linked list.
 *
 * @property first Points to the first node in the queue.
 * @property last Points to the last node in the queue.
 * @property length Represents the number of elements currently in the queue.
 */
class Queue {
    var first: Node? = null
    var last: Node? = null
    var length = 0

    /**
     * Returns the value of the first element in the queue without removing it.
     *
     * @return The value of the first element if the queue is not empty, otherwise null.
     */
    fun peek(): String? {
        return if (length > 0) {
            first?.value
        } else {
            null
        }
    }

    /**
     * Adds an element with the given value to the end of the queue.
     *
     * @param value The value to be added to the queue.
     */
    fun enqueue(value: String?) {
        val newNode = Node(value)
        if (length == 0) {
            first = newNode
        } else {
            last?.next = newNode
        }
        last = newNode
        length++
    }

    /**
     * Removes the first element from the queue if it's not empty.
     */
    fun dequeue() {
        if (length > 0) {
            first = first?.next
            if (length == 1) {
                last = null
            }
            length--
        }
    }

    /**
     * Checks if the queue is empty.
     *
     * @return True if the queue is empty, otherwise false.
     */
    fun isEmpty() = length == 0
}

fun main() {

    val myQueue = Queue()
    println(myQueue.isEmpty())
    println(myQueue.peek())
    myQueue.enqueue("Apple")
    myQueue.enqueue("Ball")
    myQueue.enqueue("Cat")
    myQueue.dequeue()
    println(myQueue.peek())
}