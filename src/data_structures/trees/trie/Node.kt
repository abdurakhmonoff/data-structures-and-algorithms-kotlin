package data_structures.trees.trie

import java.util.*

data class Node(var children: HashMap<Char, Node> = HashMap(), var isWord: Boolean = false)