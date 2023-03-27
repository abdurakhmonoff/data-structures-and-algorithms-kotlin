package data_structures.linked_lists.singly_linked_list

/**
 * Implementation of a singly linked list data structure with basic operations.
 */
class LinkedList(value: Int) {
    private var head: Node? = Node(value)
    private var tail: Node? = head
    var length: Int = 1

    /**
     * Appends a new node with the given value to the end of the list.
     *
     * @param value the integer value to add to the list
     */
    fun append(value: Int) {
        val newNode = Node(value)
        tail?.next = newNode
        tail = newNode
        length++
    }

    /**
     * Adds a new node with the given value to the beginning of the list.
     *
     * @param value the integer value to add to the list
     */
    fun prepend(value: Int) {
        val newNode = Node(value)
        newNode.next = head
        head = newNode
        length++
    }

    /**
     * Returns an array containing the values of all nodes in the list.
     *
     * @return an array containing the values of all nodes in the list
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
     * Inserts a new node with the given value at the specified index.
     *
     * @param index the index at which to insert the new node
     * @param value the integer value to add to the list
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
            length++
        }
    }

    /**
     * Removes the node at the specified index from the list.
     *
     * @param index the index of the node to remove
     */
    fun remove(index: Int) {
        if (index < 0 || index > length) {
            println("Index Out Of Bounds For Length $length")
        } else if (index == 0) {
            head = head?.next
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
            }
        }
    }

    /**
     * Reverses the order of nodes in the list.
     *
     * @param linkedList the list to be reversed
     * @return a new reversed LinkedList
     */
    fun reverse(linkedList: LinkedList): LinkedList {
        val newList = LinkedList(linkedList.head!!.value)
        var current: Node? = linkedList.head
        while (current?.next != null) {
            current = current.next
            val newNode = Node(current!!.value)
            newNode.next = newList.head
            newList.head = newNode
            newList.length++
        }
        return newList
    }
}

fun main() {

    val myLinkedList = LinkedList(10)

    myLinkedList.append(12)
    myLinkedList.append(16)

    myLinkedList.prepend(20)
    myLinkedList.prepend(50)
    println("Length: " + myLinkedList.length)
    println("List: " + myLinkedList.printList().contentToString())

    myLinkedList.insert(2, 25)
    println("Length: " + myLinkedList.length)
    println("List: " + myLinkedList.printList().contentToString())

    myLinkedList.remove(4)
    println("Length: " + myLinkedList.length)
    println("List: " + myLinkedList.printList().contentToString())

    val linkedList2 = myLinkedList.reverse(myLinkedList)
    println("Reversed linked list: " + linkedList2.printList().contentToString())
}