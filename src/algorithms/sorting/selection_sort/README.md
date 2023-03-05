### Selection sort

Selection sort is a simple sorting algorithm that works by repeatedly finding the smallest element from an unsorted part
of the array and swapping it with the first element of the unsorted part. This process is repeated until the entire
array is sorted. It is an in-place algorithm and is not recursive, making it easy to implement and understand.

```kotlin
fun selectionSort(array: IntArray) {
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
}
```