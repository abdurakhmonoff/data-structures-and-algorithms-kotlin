### Merge sort

Merge Sort is a sorting algorithm that utilizes the divide-and-conquer strategy. The basic idea behind this algorithm is
to divide the input array into two halves, sort them separately, and then merge them into a single sorted output array.
It achieves this by recursively dividing the input array into smaller sub-arrays until the base case of a single element
array is reached, which is trivially sorted. The sub-arrays are then merged together in a series of comparisons that
result in a new sorted array.

```kotlin
class MergeSort {

    fun mergeSort(array: List<Int>): List<Int> {
        // Base case: if array has only one number, it is already sorted
        if (array.size == 1) {
            return array
        }
        // Divide the array into two halves and recursively sort each half
        val left = array.subList(0, array.size / 2)
        val right = array.subList(array.size / 2, array.size)
        return merge(mergeSort(left), mergeSort(right))
    }

    private fun merge(left: List<Int>, right: List<Int>): List<Int> {
        val result = ArrayList<Int>()
        var leftIndex = 0
        var rightIndex = 0
        // Iterate through both lists, comparing the numbers and adding the smaller one to the result list
        while (leftIndex < left.size && rightIndex < right.size) {
            if (left[leftIndex] < right[rightIndex]) {
                result.add(left[leftIndex])
                leftIndex++
            } else {
                result.add(right[rightIndex])
                rightIndex++
            }
        }
        // Add any remaining numbers from the left and right lists
        val leftRemaining = left.subList(leftIndex, left.size)
        val rightRemaining = right.subList(rightIndex, right.size)
        result.addAll(leftRemaining)
        result.addAll(rightRemaining)
        return result
    }
}
```