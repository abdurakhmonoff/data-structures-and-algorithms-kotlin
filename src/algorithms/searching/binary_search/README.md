### Binary search

This function performs a binary search on a sorted array of integers to find the index of a specified key. The algorithm
works by repeatedly dividing the array in half and discarding the half that the key cannot be in, until the key is found
or the entire array has been searched.

```kotlin
fun binarySearch(arr: IntArray, key: Int): String {
    // Initialize first, last, and middle indexes
    var first = 0
    var last = arr.size - 1
    var middle = (first + last) / 2

    // Loop until the first index is greater than the last index
    while (first <= last) {
        when {
            // If the middle element is less than the key, update the first index to middle + 1
            // This means that the key is in the right half of the array
            arr[middle] < key -> {
                first = middle + 1
            }
            // If the middle element is equal to the key, return a message indicating that it was found
            // and its index
            arr[middle] == key -> {
                return "Element found at index $middle"
            }
            // If the middle element is greater than the key, update the last index to middle - 1
            // This means that the key is in the left half of the array
            else -> {
                last = middle - 1
            }
        }
        // Recalculate the middle index based on the updated first and last indexes
        middle = (first + last) / 2
    }
    // If the loop completes and the key is not found, return a message indicating that it was not found
    return "Element not found!"
}
```