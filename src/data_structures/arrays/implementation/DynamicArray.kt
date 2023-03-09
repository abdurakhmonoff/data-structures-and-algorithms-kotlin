package data_structures.arrays.implementation

/**
 * Implementation of array data structure that can dynamically resize itself as needed.
 *
 * @constructor Creates an empty dynamic array.
 * @property array The array used to store elements.
 * @property capacity The current capacity of the array.
 * @property length The current number of elements in the array.
 */
class DynamicArray(
    private var array: Array<String?> = arrayOfNulls(1),
    private var capacity: Int = 1,
    var length: Int = 0
) {

    /**
     * Returns the element at the specified index.
     *
     * @param index The index of the element to retrieve.
     * @return The element at the specified index, or "IndexOutOfBounds" if the index is out of range.
     */
    fun get(index: Int): String? {
        return if (index > -1 && index < length) array[index] else "IndexOutOfBounds"
    }

    /**
     * Appends the specified element to the end of the array.
     * If the array is full, its capacity is doubled before the element is added.
     *
     * @param string The element to add.
     */
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

    /**
     * Replaces the element at the specified index with the specified value.
     *
     * @param index The index of the element to replace.
     * @param value The new value to set.
     */
    fun replace(index: Int, value: String) {
        if (index > -1 && index < length)
            array[index] = value
        else
            println("IndexOutOfBounds")
    }

    /**
     * Removes the last element from the array.
     */
    fun pop() {
        if (length > 0) {
            length--
        }
    }

    /**
     * Removes the element at the specified index from the array.
     *
     * @param index The index of the element to remove.
     */
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

    /**
     * Returns a new array containing all of the elements in this DynamicArray.
     *
     * @return An array containing all of the elements in this DynamicArray.
     */
    fun array(): Array<String?> {
        val tempArr = arrayOfNulls<String>(length)
        for (i in 0 until length) {
            tempArr[i] = array[i]
        }
        return tempArr
    }
}

fun main() {

    val dynamicArray = DynamicArray()
    dynamicArray.push("apple")
    dynamicArray.push("ball")
    dynamicArray.push("cat")
    dynamicArray.push("dog")

    println("Array length: " + dynamicArray.length)
    println("array: " + dynamicArray.array().contentToString())
    println("item at index 2: " + dynamicArray.get(2))

    dynamicArray.replace(1, "world")
    println("array: " + dynamicArray.array().contentToString())

    dynamicArray.pop()
    println("array: " + dynamicArray.array().contentToString())

    dynamicArray.delete(1)
    println("array: " + dynamicArray.array().contentToString())

    println("Array length: " + dynamicArray.length)
}