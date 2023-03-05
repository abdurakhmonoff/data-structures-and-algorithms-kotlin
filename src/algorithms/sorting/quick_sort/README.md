### Quick sort

Quick sort is a sorting algorithm that uses the divide-and-conquer approach to sort an input array. It selects a pivot
element from the array and partitions the array into two sub-arrays: one with elements smaller than the pivot and the
other with elements greater than or equal to the pivot. This process is then recursively applied to the two sub-arrays
until they contain only one element. The base case of a single element array is trivially sorted. The sub-arrays are
then combined by concatenating the sorted sub-arrays with the pivot element in between them to produce the sorted output
array.

```kotlin
class QuickSort {

    fun quickSort(arr: IntArray, low: Int, high: Int) {
        if (low < high) {
            // Find partition index
            val pIndex = partition(arr, low, high)
            // Recursively sort elements before and after partition index
            quickSort(arr, low, pIndex - 1)
            quickSort(arr, pIndex + 1, high)
        }
    }

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
}
```