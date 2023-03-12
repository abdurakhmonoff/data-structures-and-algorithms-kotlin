package data_structures.hash_tables.implementation

import java.util.*

/**
 * A class representing a hash table data structure that stores key-value pairs.
 * @param size the initial size of the hash table
 */
class HashTable(size: Int) {
    private var data: Array<ArrayList<KeyValue>?> = arrayOfNulls<ArrayList<KeyValue>?>(size)
    private var currentLength: Int = 0

    /**
     * A private hash function that takes a key as input and returns its corresponding hash code.
     * @param key the key to hash
     * @return the hash code of the key
     */
    private fun _hash(key: String): Int {
        var hash = 0
        for (i in key.indices) {
            hash = (hash + key.codePointAt(i) * i) % data.size
        }
        return hash
    }

    /**
     * A method that inserts a key-value pair into the hash table.
     * @param key the key of the pair to insert
     * @param value the value of the pair to insert
     */
    operator fun set(key: String, value: Int) {
        val address = _hash(key)
        if (data[address] == null) {
            val arrayAtAddress = ArrayList<KeyValue>()
            data[address] = arrayAtAddress
            currentLength++
        }
        val pair = KeyValue(key, value)
        data[address]?.add(pair)
    }

    /**
     * A method that retrieves the value associated with a given key from the hash table.
     * @param key the key of the pair to retrieve
     * @return the value associated with the given key or null if the key is not found
     */
    operator fun get(key: String): Int? {
        val address = _hash(key)
        val bucket = data[address]
        if (bucket != null) {
            for (keyValue in bucket) {
                if (keyValue.key == key) {
                    return keyValue.value
                }
            }
        }
        return null
    }

    /**
     * A method that returns an array of all keys in the hash table.
     * @return an array of all keys in the hash table
     */
    fun keys(): Array<String?> {
        val bucket = data
        val keysArray = arrayOfNulls<String>(currentLength)
        var count = 0
        for (keyValues in bucket) {
            if (keyValues != null) {
                keysArray[count] = keyValues[0].key
                count++
            }
        }
        return keysArray
    }
}

fun main() {

    val hashTable = HashTable(50)
    hashTable["grapes"] = 1200
    hashTable["apple"] = 1500
    println("value for key grapes: " + hashTable["grapes"])
    println("value for key apple: " + hashTable["apple"])
    println("list of keys: " + hashTable.keys().contentToString())
}