### Hash tables

A hash table is a data structure that uses a hash function to map keys to unique indexes in an array, allowing for fast
insertion, deletion, and retrieval of data. Each key is hashed to an index in the array where the corresponding value is
stored. In case of collisions, where multiple keys map to the same index, the values are typically stored in a linked
list or other data structure. Here's how we can implement a hash table data structure using `KeyValue` model:

```kotlin
data class KeyValue(val key: String, val value: Int)

class HashTable(size: Int) {
    private var data: Array<ArrayList<KeyValue>?> = arrayOfNulls<ArrayList<KeyValue>?>(size)
    private var currentLength: Int = 0

    private fun _hash(key: String): Int {
        var hash = 0
        for (i in key.indices) {
            hash = (hash + key.codePointAt(i) * i) % data.size
        }
        return hash
    }

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
```