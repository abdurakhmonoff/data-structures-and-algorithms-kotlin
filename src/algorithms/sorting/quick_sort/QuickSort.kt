package algorithms.sorting.quick_sort

/**
 * Implementation of the quick sort algorithm for sorting a list of integers in ascending order.
 */
class QuickSort {

    /**
     * Sorts an array of integers in ascending order using QuickSort algorithm.
     *
     * @param arr the array to be sorted.
     * @param low the starting index of the array.
     * @param high the ending index of the array.
     */
    fun quickSort(arr: IntArray, low: Int, high: Int) {
        if (low < high) {
            // Find partition index
            val pIndex = partition(arr, low, high)
            // Recursively sort elements before and after partition index
            quickSort(arr, low, pIndex - 1)
            quickSort(arr, pIndex + 1, high)
        }
    }

    /**
     * Partitions the array into two sub-arrays around the pivot element.
     *
     * @param arr the array to be partitioned.
     * @param low the starting index of the array.
     * @param high the ending index of the array.
     * @return the index of the pivot element after partitioning.
     */
    private fun partition(arr: IntArray, low: Int, high: Int): Int {
        val pivot = arr[high]
        var i = low - 1
        // Iterate through numbers from low to high-1
        for (j in low until high) {
            if (arr[j] <= pivot) {
                i++
                // Swap arr[i] and arr[j]
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
        // Place pivot at correct position in array
        val temp = arr[i + 1]
        arr[i + 1] = arr[high]
        arr[high] = temp
        // Return partition index
        return i + 1
    }

    /**
     * Prints the elements of the array.
     *
     * @param arr the array to be printed.
     */
    fun printArray(arr: IntArray) {
        for (value in arr) print("$value ")
        println()
    }
}

fun main() {

    val numbers = intArrayOf(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0)
    val quickSort = QuickSort()
    quickSort.quickSort(numbers, 0, numbers.size - 1)
    quickSort.printArray(numbers)
}