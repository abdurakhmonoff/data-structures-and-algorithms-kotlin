package data_structures.arrays.implementation

class DynamicArray(
    private var array: Array<String?> = arrayOfNulls(1),
    private var capacity: Int = 1,
    var length: Int = 0
) {
    // gets element at the given index
    fun get(index: Int): String? {
        return if (index > -1 && index < length) array[index] else "IndexOutOfBounds"
    }

    // this method adds an element to the end of array
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

    // replaces value at given index
    fun replace(index: Int, value: String) {
        if (index > -1 && index < length)
            array[index] = value
        else
            println("IndexOutOfBounds")
    }

    // removes last item on array
    fun pop() {
        if (length > 0) {
            length--
        }
    }

    // deletes element at the given index
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

    // gets the array
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