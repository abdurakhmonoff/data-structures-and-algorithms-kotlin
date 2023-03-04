### Bubble sort

This code implements a bubble sort algorithm for an array of integers. The algorithm works by iterating over
the array and comparing adjacent elements. If the adjacent elements are not in the correct order, they are swapped. This
process is repeated until the entire array is sorted. The outer loop iterates over the array indices, while the inner
loop compares adjacent elements of the array and swaps them if they are in the wrong order.

```kotlin
fun bubbleSort(array: IntArray) {
    // Outer loop iterates over the array indices
    for (i in array.indices) {
        // Inner loop compares adjacent elements of the array and swaps them if
        // they are in the wrong order
        for (j in 0 until array.size - 1) {
            // If the current element is greater than the next element, swap them
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}
```