package data_structures.trees.trie

import java.util.*

/**
 * Represents a node in the trie.
 *
 * @param children Children of the current node.
 * @param isWord Indicates if the node represents the end of a complete word.
 */
class Node(var children: HashMap<Char, Node> = HashMap(), var isWord: Boolean = false)