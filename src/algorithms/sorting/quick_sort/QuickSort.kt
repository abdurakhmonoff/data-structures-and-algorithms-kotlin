package algorithms.sorting.quick_sort

class QuickSort {
    fun quickSort(arr: IntArray, low: Int, high: Int) {
        if (low < high) {
            val pIndex = partition(arr, low, high)
            quickSort(arr, low, pIndex - 1)
            quickSort(arr, pIndex + 1, high)
        }
    }

    private fun partition(arr: IntArray, low: Int, high: Int): Int {
        val pivot = arr[high]
        var i = low - 1
        for (j in low until high) {
            if (arr[j] <= pivot) {
                i++

                // swap arr[i] and arr[j]
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
        val temp = arr[i + 1]
        arr[i + 1] = arr[high]
        arr[high] = temp
        return i + 1
    }

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