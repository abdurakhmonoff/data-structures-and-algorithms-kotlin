package algorithms.searching.binary_search

class BinarySearch {

    /**
     * Performs a binary search on an array of integers to find the index of a specified key.
     *
     * @param arr the array to search
     * @param key the value to search for
     * @return a message indicating whether the element was found and its index, or that it was not found
     */
    fun binarySearch(arr: IntArray, key: Int): String {
        var first = 0
        var last = arr.size - 1
        var middle = (first + last) / 2
        while (first <= last) {
            when {
                arr[middle] < key -> {
                    first = middle + 1
                }
                arr[middle] == key -> {
                    return "Element found at index $middle"
                }
                else -> {
                    last = middle - 1
                }
            }
            middle = (first + last) / 2
        }
        return "Element not found!"
    }
}

fun main() {

    val binarySearch = BinarySearch()

    // Note: Binary search works only with sorted arrays.
    val array = intArrayOf(10, 25, 32, 45, 55, 68)
    val result = binarySearch.binarySearch(array, 55)
    println(result)

    val result2 = binarySearch.binarySearch(array, 100)
    println(result2)
}