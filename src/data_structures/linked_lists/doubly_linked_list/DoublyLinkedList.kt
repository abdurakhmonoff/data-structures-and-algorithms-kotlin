package data_structures.linked_lists.doubly_linked_list

/**
 * Implementation of a doubly linked list data structure with basic operations.
 */
class DoublyLinkedList(value: Int) {
    var head: Node? = Node(value)
    var tail: Node? = head
    var length: Int = 1

    /**
     * Append a new node to the end of the list.
     *
     * @param value the value to be added to the list
     */
    fun append(value: Int) {
        val newNode = Node(value)
        newNode.previous = tail
        tail?.next = newNode
        tail = newNode
        length++
    }

    /**
     * Prepend a new node to the beginning of the list.
     *
     * @param value the value to be added to the list
     */
    fun prepend(value: Int) {
        val newNode = Node(value)
        head?.previous = newNode
        newNode.next = head
        head = newNode
        length++
    }

    /**
     * Print the values of the nodes in the list as an IntArray.
     *
     * @return an IntArray representing the values of the nodes in the list
     */
    fun printList(): IntArray {
        val myList = IntArray(length)
        var current: Node? = head
        var i = 0
        while (current != null) {
            myList[i] = current.value
            current = current.next
            i++
        }
        return myList
    }

    /**
     * Insert a new node at the specified index in the list.
     *
     * @param index the index at which to insert the new node
     * @param value the value to be inserted into the list
     */
    fun insert(index: Int, value: Int) {
        if (index < 0 || index > length) {
            println("Index Out Of Bounds For Length $length")
        } else if (index == 0) {
            prepend(value)
        } else if (index == length) {
            append(value)
        } else {
            var current: Node? = head
            for (i in 0 until index - 1) {
                current = current?.next
            }
            val newNode = Node(value)
            newNode.next = current?.next
            current?.next = newNode
            newNode.previous = current
            newNode.next?.previous = newNode
            length++
        }
    }

    /**
     * Remove the node at the specified index from the list.
     *
     * @param index the index of the node to be removed from the list
     */
    fun remove(index: Int) {
        if (index < 0 || index > length) {
            println("Index Out Of Bounds For Length $length")
        } else if (index == 0) {
            head = head?.next
            head?.previous = null
            length--
        } else {
            var current: Node? = head
            var i = 0
            while (i < index - 1) {
                current = current?.next
                i++
            }
            current?.next = current?.next?.next
            length--
            if (i == length - 1) {
                tail = current
            } else {
                current?.next?.previous = current
            }
        }
    }
}

fun main() {

    val myDoublyLinkedList = DoublyLinkedList(5)

    myDoublyLinkedList.append(3)
    myDoublyLinkedList.append(4)
    myDoublyLinkedList.prepend(2)
    myDoublyLinkedList.prepend(1)
    println(myDoublyLinkedList.printList().contentToString())

    myDoublyLinkedList.remove(0)
    println(myDoublyLinkedList.printList().contentToString())

    myDoublyLinkedList.insert(2, 200)
    println(myDoublyLinkedList.printList().contentToString())

    println("length: " + myDoublyLinkedList.length)
    println("head value: " + myDoublyLinkedList.head?.value)
    println("head.previous: " + myDoublyLinkedList.head?.previous)
    println("tail value: " + myDoublyLinkedList.tail?.value)
    println("tail.next: " + myDoublyLinkedList.tail?.next)
}