### Arrays

An array is a fundamental data structure in computer programming that allows for efficient storage and retrieval of a
collection of elements of the same type. It is a contiguous block of memory, where each element is accessed by its
index. The index is an integer that represents the position of the element in the array, starting from 0. Arrays can be
used to store primitive data types such as integers, characters, and booleans, as well as more complex objects such as
strings and custom data types. The key advantage of arrays is their constant-time access to individual elements, which
allows for fast retrieval and modification of data. However, the size of an array is fixed at creation time, so resizing
requires creating a new array and copying the elements, which can be time-consuming and memory-intensive. Here's how we
can implement an array that can dynamically resize itself as needed:

```kotlin
class DynamicArray(
    private var array: Array<String?> = arrayOfNulls(1),
    private var capacity: Int = 1,
    var length: Int = 0
) {

    fun get(index: Int): String? {
        return if (index > -1 && index < length) array[index] else "IndexOutOfBounds"
    }

    fun push(string: String) {
        if (length == capacity) {
            val tempArray = arrayOfNulls<String>(2 * capacity)
            for (i in array.indices) {
                tempArray[i] = array[i]
            }
            array = tempArray
            capacity *= 2
        }
        array[length] = string
        length++
    }

    fun replace(index: Int, value: String) {
        if (index > -1 && index < length)
            array[index] = value
        else
            println("IndexOutOfBounds")
    }

    fun pop() {
        if (length > 0) {
            length--
        }
    }

    fun delete(index: Int) {
        if (index > -1 && index < length) {
            if (index == length - 1) {
                pop()
            } else {
                for (i in index until length) {
                    array[i] = array[i + 1]
                }
                length--
            }
        } else {
            println("IndexOutOfBounds")
        }
    }

    fun array(): Array<String?> {
        val tempArr = arrayOfNulls<String>(length)
        for (i in 0 until length) {
            tempArr[i] = array[i]
        }
        return tempArr
    }
}
```