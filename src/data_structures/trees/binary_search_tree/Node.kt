package data_structures.trees.binary_search_tree

/**
 * Represents a node in the binary search tree.
 *
 * @param value The value to be stored in the node.
 * @param left The reference to the left child node.
 * @param right The reference to the right child node.
 */
class Node(val value: Int, var left: Node? = null, var right: Node? = null)