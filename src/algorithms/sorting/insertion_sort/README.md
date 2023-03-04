### Insertion sort

This code implements an insertion sort algorithm for an ArrayList of integers. Insertion sort is a simple sorting
algorithm that sorts an array by repeatedly shifting elements that are greater than
the current element to be sorted one position ahead of their current position. The algorithm works by iterating over the
input array, and at each iteration, it inserts the current element into its correct position in the sorted portion of
the array that precedes it.

```kotlin
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
```