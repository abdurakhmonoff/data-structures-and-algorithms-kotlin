package algorithms.searching.linear_search

class LinearSearch {

    /**
     * Performs a linear search on an array of integers to find the index of a specified key.
     *
     * @param arr the array to search
     * @param key the value to search for
     * @return the index of the key if it is found, or -1 if it is not found
     */
    fun linearSearch(arr: IntArray, key: Int): Int {
        for (i in arr.indices) {
            if (arr[i] == key) {
                return i
            }
        }
        return -1
    }
}

fun main() {

    val linearSearch = LinearSearch()
    val arr = intArrayOf(12, 45, 69, 78, 89, 54)
    val answer = linearSearch.linearSearch(arr, 69)
    println(answer)
}