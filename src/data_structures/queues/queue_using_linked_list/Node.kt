package data_structures.queues.queue_using_linked_list

/**
 * Represents a node in the linked-list used for the Queue.
 *
 * @param value The value to be stored in the node.
 * @param next The reference to the next node in the linked-list.
 */
class Node(var value: String?, var next: Node? = null)