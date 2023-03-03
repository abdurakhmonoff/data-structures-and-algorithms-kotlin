package algorithms.sorting.insertion_sort

/**
 * Performs an insertion sort on an ArrayList of integers to sort it in ascending order.
 *
 * @param array the ArrayList to sort
 */
fun insertionSort(array: ArrayList<Int>) {
    // Iterate over the indices of the input array
    for (i in array.indices) {
        // If the current number is less than or equal to the first number, insert it at the beginning of the array
        if (array[i] <= array[0]) {
            array.add(0, array.removeAt(i))
        } else {
            // If the current number is less than the previous number, find the correct position to insert it
            if (array[i] < array[i - 1]) {
                // Iterate over the array from the second number to the current number
                for (j in 1 until i) {
                    // If the current number is less than the j-th number, insert it at that position
                    if (array[i] < array[j]) {
                        array.add(j, array.removeAt(i))
                        break
                    }
                }
            }
        }
    }
}

fun main() {

    val numbers = ArrayList(listOf(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0))
    insertionSort(numbers)
    println(numbers)
}