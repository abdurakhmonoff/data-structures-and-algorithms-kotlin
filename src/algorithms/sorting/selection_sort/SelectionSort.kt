package algorithms.sorting.selection_sort

/**
 * Sorts an array of integers using the selection sort algorithm.
 *
 * @param array the array to sort
 * @return the sorted array
 */
fun selectionSort(array: IntArray): IntArray {
    for (i in array.indices) {
        // Find the index of the smallest number in the unsorted portion of the array
        var smallest = i
        for (j in i until array.size) {
            if (array[j] < array[smallest]) {
                smallest = j
            }
        }
        // Swap the smallest number with the first number in the unsorted portion of the array
        val temp = array[i]
        array[i] = array[smallest]
        array[smallest] = temp
    }
    return array
}

fun main() {

    val numbers = intArrayOf(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0)
    println(selectionSort(numbers).contentToString())
}