package algorithms.searching.binary_search

/**
 * Binary search only works with only sorted arrays
 */
class BinarySearch {
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
                    return "Element Found At Index $middle"
                }
                else -> {
                    last = middle - 1
                }
            }
            middle = (first + last) / 2
        }
        return "Element Not Found"
    }
}

fun main() {
    val binarySearch = BinarySearch()
    val array = intArrayOf(10, 25, 32, 45, 55, 68)
    val result = binarySearch.binarySearch(array, 55)
    println(result)
    val result2 = binarySearch.binarySearch(array, 100)
    println(result2)
}