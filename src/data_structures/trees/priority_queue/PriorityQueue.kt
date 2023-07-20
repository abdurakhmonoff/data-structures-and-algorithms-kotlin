package data_structures.trees.priority_queue

/**
 * Simple implementation of a priority queue data structure.
 *
 * @property queueArray ArrayList that holds the nodes in the priority queue.
 */
class PriorityQueue {
    private val queueArray = ArrayList<Node>()

    /**
     * Adds a new node with the given value and priority to the priority queue.
     *
     * @param value The value to be added to the priority queue.
     * @param priority The priority of the value. Higher values represent higher priority.
     */
    fun enqueue(value: String?, priority: Int) {
        val newNode = Node(value!!, priority)
        var contain = false
        for (i in queueArray.indices) {
            if (queueArray[i].priority > newNode.priority) {
                queueArray.add(i, newNode)
                contain = true
                break
            }
        }
        if (!contain) {
            queueArray.add(newNode)
        }
    }

    /**
     * Removes and returns the value of the node with the highest priority from the priority queue.
     *
     * @return The value of the node with the highest priority, or "empty array" if the queue is empty.
     */
    fun dequeue(): String {
        if (queueArray.isEmpty()) {
            return "empty array"
        }
        val toRemove = queueArray[0]
        queueArray.removeAt(0)
        return toRemove.value
    }

    /**
     * Returns the node with the highest priority in the priority queue without removing it.
     *
     * @return The node with the highest priority, or null if the queue is empty.
     */
    fun front(): Node? {
        return if (queueArray.isNotEmpty()) {
            queueArray[0]
        } else null
    }

    /**
     * Returns the node with the lowest priority in the priority queue without removing it.
     *
     * @return The node with the lowest priority, or null if the queue is empty.
     */
    fun rear(): Node? {
        return if (queueArray.isNotEmpty()) {
            queueArray[queueArray.size - 1]
        } else null
    }

    /**
     * Property that indicates whether the priority queue is empty or not.
     */
    val isEmpty: Boolean
        get() = queueArray.isEmpty()

    /**
     * Returns an array containing the values of all nodes in the priority queue.
     *
     * @return An array of String? containing the values of all nodes in the priority queue.
     */
    fun printQueue(): Array<String?> {
        val array = arrayOfNulls<String>(queueArray.size)
        for (i in array.indices) {
            array[i] = queueArray[i].value
        }
        return array
    }
}

fun main() {

    val queue = PriorityQueue()
    queue.enqueue("piyush", 3)
    queue.enqueue("rohan", 1)
    queue.enqueue("jeet", 2)
    queue.enqueue("john", 5)
    queue.enqueue("Dave", 4)
    println(queue.printQueue().contentToString())
    println(queue.dequeue())
    println(queue.printQueue().contentToString())
    println(queue.front()?.value)
    println(queue.rear()?.value)
    println(queue.isEmpty)
}