package data_structures.stacks.stack_using_linked_list

/**
 * Represents a node in the linked-list used for the Stack.
 *
 * @param value The value to be stored in the node.
 * @param next The reference to the next node in the linked-list.
 */
class Node(val value: String?, var next: Node? = null)