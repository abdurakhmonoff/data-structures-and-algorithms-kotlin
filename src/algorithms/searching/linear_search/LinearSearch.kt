package algorithms.searching.linear_search

class LinearSearch {
    fun linearSearch(arr: IntArray, key: Int): Int {
        for (i in arr.indices) {
            if (arr[i] == key) {
                return i
            }
        }

        // element not found
        return -1
    }
}

fun main() {
    val ls = LinearSearch()
    val arr = intArrayOf(12, 45, 69, 78, 89, 54)
    val answer = ls.linearSearch(arr, 69)
    println(answer)
}