package data_structures.queues.queue_using_linked_list

class Queue {
    var first: Node? = null
    var last: Node? = null
    var length = 0

    fun peek(): String? {
        return if (length > 0) {
            first?.value
        } else {
            null
        }
    }

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

    fun dequeue() {
        if (length > 0) {
            first = first?.next
            if (length == 1) {
                last = null
            }
            length--
        }
    }

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