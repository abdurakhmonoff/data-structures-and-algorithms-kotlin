package algorithms.sorting.merge_sort

/**
 * Implementation of the merge sort algorithm for sorting a list of integers in ascending order.
 */
class MergeSort {

    /**
     * Recursively sorts the given list by dividing it into halves and merging them.
     *
     * @param array the list to sort
     * @return the sorted list
     */
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

    /**
     * Merges two sorted lists into a single sorted list.
     *
     * @param left the first sorted list
     * @param right the second sorted list
     * @return the merged sorted list
     */
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

fun main() {

    val mergeSort = MergeSort()
    val numbers = ArrayList(listOf(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0))
    println(mergeSort.mergeSort(numbers))
}