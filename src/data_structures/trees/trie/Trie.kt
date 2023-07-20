package data_structures.trees.trie

/**
 * Simple implementation of a trie queue data structure.
 *
 * @property root The root node of the trie.
 */
class Trie {
    val root = Node()

    /**
     * Inserts a string into the trie.
     *
     * @param string The string to be inserted into the trie.
     */
    fun insert(string: String) {
        var current: Node? = root
        for (ch in string.toCharArray()) {
            current!!.children.putIfAbsent(ch, Node())
            current = current.children[ch]
        }
        current!!.isWord = true
    }

    /**
     * Searches for a complete word in the trie and returns true if found, otherwise false.
     *
     * @param string The word to be searched in the trie.
     * @return True if the complete word is found, otherwise false.
     */
    fun findWord(string: String): Boolean {
        var current: Node? = root
        for (ch in string.toCharArray()) {
            current = if (current!!.children.containsKey(ch)) {
                current.children[ch]
            } else {
                return false
            }
        }
        return current!!.isWord
    }

    /**
     * Deletes a word from the trie and returns true if the word was successfully deleted, otherwise false.
     *
     * @param word The word to be deleted from the trie.
     * @return True if the word was successfully deleted, otherwise false.
     */
    fun delete(word: String): Boolean {
        var current: Node? = root
        var deleteAfter: Node? = root
        var ch1 = word[0]
        for (i in word.indices) {
            val ch = word[i]
            if (current!!.children.containsKey(ch)) {
                current = current.children[ch]
                if (current!!.children.size > 1) {
                    deleteAfter = current
                    ch1 = word[i + 1]
                }
            } else {
                return false
            }
        }
        if (current!!.children.isEmpty()) {
            deleteAfter!!.children.remove(ch1)
            return true
        }
        return false
    }
}

fun main() {
    val trie = Trie()
    trie.insert("heating")
    trie.insert("heat")
    println(trie.root.children['h']!!.children['e']?.children)
    println(trie.delete("heat"))
    println(trie.findWord("heat"))
    println(trie.root.children['h']!!.children['e']?.children)
}