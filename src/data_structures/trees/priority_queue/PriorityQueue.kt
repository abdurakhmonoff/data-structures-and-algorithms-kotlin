package data_structures.trees.priority_queue

class PriorityQueue {
    private val queueArray = ArrayList<Node>()

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

    fun dequeue(): String {
        if (queueArray.isEmpty()) {
            return "empty array"
        }
        val toRemove = queueArray[0]
        queueArray.removeAt(0)
        return toRemove.value
    }

    fun front(): Node? {
        return if (queueArray.isNotEmpty()) {
            queueArray[0]
        } else null
    }

    fun rear(): Node? {
        return if (queueArray.isNotEmpty()) {
            queueArray[queueArray.size - 1]
        } else null
    }

    val isEmpty: Boolean
        get() = queueArray.isEmpty()

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