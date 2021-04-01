package data_structures.stacks.stack_using_linked_list

class Stack {
    private var top: Node? = null
    private var bottom: Node? = null
    private var length = 0

    fun peek(): String? {
        return if (length > 0) {
            top!!.value
        } else {
            null
        }
    }

    fun push(value: String?) {
        val newNode = Node(value!!)
        if (length == 0) {
            top = newNode
            bottom = newNode
        } else {
            newNode.next = top
            top = newNode
        }
        length++
    }

    fun pop() {
        if (length > 0) {
            top = top!!.next
            if (length == 1) {
                bottom = null
            }
            length--
        }
    }

    fun isEmpty() = length == 0

    val lastElement: String?
        get() = if (length > 0) {
            bottom!!.value
        } else null
}

fun main() {
    val myStack = Stack()
    myStack.push("Google")
    myStack.push("Udemy")
    myStack.push("Discord")
    println(myStack.peek())
    myStack.pop()
    println(myStack.isEmpty())
    println(myStack.lastElement)
}